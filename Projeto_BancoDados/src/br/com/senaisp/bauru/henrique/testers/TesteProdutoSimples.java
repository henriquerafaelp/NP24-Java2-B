package br.com.senaisp.bauru.henrique.testers;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.senaisp.bauru.henrique.classes.ProdutoSimples;

public class TesteProdutoSimples {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
				 int op;
				 do {
					 System.out.println("Menu");
		            System.out.println("1 - Criar produto");
		            System.out.println("2 - Consultar produto");
		            System.out.println("3 - Alterar produto");
		           System.out.println("4- Excluir produto");
		           System.out.println("9 Fim");
		           op = sc.nextInt();
		           switch (op) {
		           case 1 -> criarProduto (sc);
		           case 2 -> consultarProduto (sc);
		           case 3 -> alterarProduto (sc);
		           case 4 -> excluirProduto (sc);
		           case 9 -> System.out.println("Bye");
		          default -> System.out.println("Opção invalida");
		           }
		}while (op!=9);
	}

	private static void excluirProduto(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void alterarProduto(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	private static void consultarProduto(Scanner sc) {
		System.out.println("Consultar de Produtos");
		System.out.println("Digite o codigo do produto a pesquisar:");
		int cod = sc.nextInt();
		try {
			//Pesquisando produto
			ProdutoSimples prd = ProdutoSimples.findByPK(cod);
			//Mostrando produto
			System.out.println(prd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		//Pausa para voltar para menu
		System.out.println("Digite algo para voltar ao menu");
		
		
	}

	private static void criarProduto(Scanner sc) {
        sc.nextLine(); //Capturar do enter do menu
		System.out.println("Cadastramento de produto");
		System.out.println("Digite a descrição do produto:");
		String des = sc.nextLine();
		
		System.out.println("Digite o saldo do produto");
		int sal = sc.nextInt();
		
		System.out.println("Digite o custo do produto");
		double cus = sc.nextDouble();
		
		try {
			//Criando o produto
			ProdutoSimples prd = ProdutoSimples.create(des, sal, cus);
			//Mostrando o produto
			System.out.println(prd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		//Pausa para voltar para menu
		System.out.println("Digite enter para voltar para menu");
		sc.nextLine();
	}

	}
