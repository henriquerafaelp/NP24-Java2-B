package br.com.senaisp.bauru.henrique.secao08exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListEx2 {
	public static void main(String args[]) {
		ArrayList<Integer> lstInt = new ArrayList<Integer>();
		Random rnd = new Random();
		// adicionando valores aleatorios de 1 a 200 a lista
		for (int i = 0; i < 100; i++) {
			lstInt.add(rnd.nextInt(200) + 1);
		}
		// listar os valores gerados
		for (int it : lstInt) {
			System.out.println(it);
		}
		// Utilizando o iterator
		System.out.println("Listando usando iterator");
		Iterator<Integer> iter = lstInt.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// removendo os pares> isso pode dar problema
		//porque eu perco a referencia dos indices
		/*
		for (int it : lstInt) {
			if (it % 2 == 0) {
				// removendo o item
				lstInt.remove(it);
//				
			}
		}
		*/
		//para resolver problemas
		for (int i = lstInt.size()-1;i>0;i--) {
			if (lstInt.get(i)%2==0) {
				
			}
		}
		// Listando o resultante depois de retirado os valores
		// Utilizando o ListIterator
		ListIterator<Integer> lstIt = lstInt.listIterator();
		while (lstIt.hasNext()) {
			System.out.println(lstIt.next());
		}
		System.out.println("Mostrando o ultimo novamente");
		System.out.println(lstIt.previous()); //volta um indice
	}
}
