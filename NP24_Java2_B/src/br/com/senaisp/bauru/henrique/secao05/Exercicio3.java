package br.com.senaisp.bauru.henrique.secao05;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o código da cor: (1,2 ou 3):");
		int codigo = sc.nextInt();
		String cor = "Cor invalida";
		switch (codigo) {
		case 1 -> cor = "Próxima luz do semáforo sera verde";
		case 2 -> cor = "Próxima luz do semáforo sera amarelo";
		case 3 -> cor = "Próxima luz do semáforo sera vermelho";
		
		}
		if (codigo ==1 ) {
			cor = "Próxima luz do semáforo sera verde";
		}else if (codigo == 2 ) {
			cor = "Proxima luz do semáforo sera amarelo";
		}else if (codigo == 3) {
			cor = "Proxima luz do semáforo sera vermelho";
			
		}
		System.out.println(cor);
        sc.close();
	}

}
