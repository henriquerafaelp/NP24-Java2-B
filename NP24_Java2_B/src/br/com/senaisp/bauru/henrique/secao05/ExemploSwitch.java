package br.com.senaisp.bauru.henrique.secao05;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Digite um valor de 1 a 10:");
          int vlr = sc.nextInt();
          switch(vlr) {
          case 1: System.out.println("Voce ganhou um boné!");
          case 2: System.out.println("Voce ganhou uma caneta!");
          case 3: System.out.println("Voce ganhou um lapís!");
          case 4: System.out.println("Voce ganhou uma calculadora!");
          case 5: System.out.println("Voce ganhou uma borracha!");
          case 6: System.out.println("Voce ganhou uma régua!");
          case 7: System.out.println("Voce ganhou um transferidor!");
          case 8: System.out.println("Voce ganhou um compasso!");
          case 9: System.out.println("Voce ganhou um celular!");
          case 10: System.out.println("Voce ganhou R$ 1.000,00!");
          default: System.out.println("Que Pena, voce perdeu tudo!");
          
          
          }
          sc.close();
	}

}
