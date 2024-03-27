package br.com.senaisp.bauru.henrique.secao06lacowhile;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opc = 0;
        while ( opc<1 && opc>15 /*condição*/) {
        	//bloco de execução
        	System.out.println("Digite um valor entre 1 e 15");
        	opc = sc.nextInt();
        	
        }
        System.out.println("Fim do jogo");
        //exemplo do ..while
        do {
        	System.out.println( "Digite um valor de 5 e 10:");
        	opc = sc.nextInt();
        	while(opc<5|| opc>10)
        	sc.close();
        
        }
	}
}
