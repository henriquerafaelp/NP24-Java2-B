package br.com.senaisp.bauru.henrique.secao05;

import java.util.Scanner;

public class ExemploScanner01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
       System.out.println("Digite um nome ");
       String nome = scn.next();
       System.out.println("Digite o sobrenome:");
       String sobrenome = scn.next();
       System.out.println(" Ola "+ nome + ""+ sobrenome);
       
       scn.close();
	}

}
