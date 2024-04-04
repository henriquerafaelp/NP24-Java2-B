package br.com.senaisp.bauru.henrique.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoSimples {
	private int id;
	private String descricao;
	private int saldo;
	private double custo;
	// Usando o conector para BD
	private Connection conn;

	// Constructor
	public ProdutoSimples() throws SQLException {
		id = 0;
		saldo = 0;
		custo = 0;
		// Instanciando o DriverManager
		conn = DriverManager.getConnection("jdbc:sqlite:C:\\Javalibs\\dados\\NP24_JAVA2_B.DB");
	}

	// getter e setters
	public int getId() {
		return id;
	}

	public void setId(int id) throws Exception {
		if (id < 0) {
			throw new Exception("O id não pode ser negativado!");
		}
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	@Override
	public String toString() {
		return"Id: " + getId()+  "\n"+
				   "Descrição: " + getDescricao() + "\n"+
				   "Saldo: " + getSaldo() + "\n"+
				   "Custo: " + getCusto();
		}
	//
	public void gravar () throws SQLException {
		PreparedStatement stmt = conn.prepareStatement("update produto set descricao=?, " + "saldo=?, custo=? where id = ?");
		//Preenchendo os parametros
		stmt.setString(1, getDescricao());
		stmt.setInt(2,getSaldo());
		stmt.setDouble(3, getCusto());
		stmt.setInt(4, getId());
		//Disparando a Query
		int nRegs = stmt.executeUpdate();
		System.out.println(nRegs + "registro (s) afetados (s)!");
	}
		public void apagar () throws SQLException {
			PreparedStatement stmt = conn.prepareStatement("Delete from produto where id = ?");
			//Preenchendo os parametros
			stmt.setInt(1,getId());			
			//Disparando a Query
			int nRegs = stmt.executeUpdate();
			System.out.println(nRegs + "registro (s) afetados (s)!");
		
		
	}

	//
	public static ProdutoSimples create(String des, int sal, double cus) throws SQLException {
		ProdutoSimples ret = new ProdutoSimples();
		ret.setDescricao(des);
		ret.setCusto(cus);
		ret.setSaldo(sal);
		//Gravar no banco de dados
		//Preparando o comando para banco de dados
		PreparedStatement stm = ret.conn.
				prepareStatement("insert into " + "produto(descricao,saldo,custo)"  + "values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
						//Os paramentros começam com 1 e zero
						stm.setString(1, des);
				        stm.setInt(2, sal);
				        stm.setDouble(3, cus);
				        
				        //
				        int linhas = stm.executeUpdate();
				        System.out.println("Adicionei" + linhas + "no banco");
				        ResultSet rs = stm.getGeneratedKeys();
				        rs.next();
				        try {
							ret.setId(rs.getInt(1));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
				       
				        
		return ret;
	}

    public static ProdutoSimples findByPK (int cod ) throws Exception {
    	ProdutoSimples ret = new ProdutoSimples();
    	if (cod>0) {
    		PreparedStatement stmt = ret.conn.prepareStatement("Select id, descricao, saldo, custo" + "from produto where id = ?"); 
    		stmt.setInt(1,cod);
    		//Colocando o parametro da query
    		stmt.setInt(1,cod);
    		//Executando a query
    		ResultSet rs = stmt.executeQuery();
    		//Verificando se encontrou algo
    		if (rs.next()) {
    			ret.setId(rs.getInt(1));
    			ret.setDescricao(rs.getString(2));
    			ret.setSaldo(rs.getInt(3));
    			ret.setCusto(rs.getDouble(4));
    			
    		}else {
    			throw new Exception ("Registro não encontrado!");
    		}
    		
    	}else {
    		throw new Exception ("O codigo deve ser maior que zero");
    	}
    	return ret;
    }

}
