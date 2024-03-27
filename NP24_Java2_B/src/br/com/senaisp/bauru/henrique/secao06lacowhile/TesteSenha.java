package br.com.senaisp.bauru.henrique.secao06lacowhile;

import java.util.Scanner;

public class TesteSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
		int tentativas = 0;
		final int PASSWORLD = 1597;
		do {
			System.out.println("Favor digitar a senha:");
			senha = sc.nextInt();
			if (senha != PASSWORLD) {
				System.out.println("Senha invalida! Redigite.");
				tentativas++;
			}
		} while (senha != PASSWORLD && tentativas < 3);
		// inicio do if
		if (tentativas < 3) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso bloqueado!");
		} // fim do else
		sc.close();

	}
}
