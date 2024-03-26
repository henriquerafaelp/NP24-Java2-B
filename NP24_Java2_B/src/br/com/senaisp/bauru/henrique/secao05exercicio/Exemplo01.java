package br.com.senaisp.bauru.henrique.secao05exercicio;

public class Exemplo01 {

	public static void main(String[] args) {
      int idade = 19;
      boolean bPodeDirigir = ! (idade <= 18 || idade >= 65);
                                //idade >=18  $$ idade <= 65
      System.out.println("Voce "+ (bPodeDirigir ? "Pode " : "Não Pode") + "Dirigir");
      
	}

}
