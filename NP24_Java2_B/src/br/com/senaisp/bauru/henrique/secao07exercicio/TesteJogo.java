package br.com.senaisp.bauru.henrique.secao07exercicio;

public class TesteJogo {

	public static void main(String[] args) {
          Cartao ct01 = new Cartao();
          System.out.println(ct01);
          Cartao ct02= new Cartao();
          System.out.println(ct02);
          //Criando uma maquina
          MaquinaFliperama m1 = new MaquinaFliperama ("MK1");
          m1.lerCartao(ct01);
          
	}

}
