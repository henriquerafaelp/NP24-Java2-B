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
          System.out.println("Exclusao de produtos");	
          ProdutoSimples prd = pesquisarProduto (sc);
          //confirmação de exclusao
          System.out.println("Tem certeza que deseja cancelar a exclusao ? (S/N)");
          String res = sc.nextLine();
          //Estou perguntando se quer CANCELAR a EXCLUSÃO!!
          if (res.equalsIgnoreCase("N")) {
        	  try {
				prd.apagar();
			} catch (SQLException e) {
                 System.out.println(e.getMessage());
			}//Fim do catch
          }//fim do if
          //voltando para menu
          System.out.println("Digite algo para voltar ao menu");
          sc.nextLine(); //capturar do ultimo enter numerico
	}

	private static void alterarProduto(Scanner sc) {
           System.out.println("Alteração de produto");
           ProdutoSimples prd = pesquisarProduto(sc);
           if (prd!=null) {
        	   System.out.println("Digite a descrição do produto:");
        	   prd.setDescricao(sc.nextLine());
        	   
        	   System.out.println("Digite o saldo do produto");
        	   prd.setSaldo(sc.nextInt());
        	   
        	   System.out.println("Digite o custo do produto");
        	   prd.setCusto(sc.nextDouble());
        	   //como o ultimo campo foi número,capturamos o enter
        	   sc.nextLine();
        	   System.out.println("Confirma a alteração (S/N)");
        	   String conf = sc.nextLine();
        	   if (conf.equalsIgnoreCase("S")) {
        		   try {
					prd.gravar();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
        	   }//fim do if de confirmação
           }
           //voltando para menu
           System.out.println("Digite algo para voltar ao menu");
           sc.nextLine(); //capturar do ultimo enter numerico
	}

	private static void consultarProduto(Scanner sc) {
		System.out.println("Digite o codigo do produto a pesquisar");
		pesquisarProduto(sc);
		
		//Pausa para voltar para menu
		System.out.println("Digite algo para voltar ao menu");
		
		
	}

	private static ProdutoSimples pesquisarProduto(Scanner sc) {
		System.out.println("Digite o codigo do produto a pesquisar:");
		int cod = sc.nextInt();
		sc.nextLine(); //captura do enter
		try {
			//Pesquisando produto
			ProdutoSimples prd = ProdutoSimples.findByPK(cod);
			//Mostrando produto
			System.out.println(prd);
			return prd;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return null;
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
