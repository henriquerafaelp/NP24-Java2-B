package br.com.senaisp.bauru.henrique.testers;

import br.com.senaisp.bauru.henrique.classes.ProdutoSimples;

public class TesteProdutoSimples {

	public static void main(String[] args) {
		/*
		ProdutoSimples prd = new ProdutoSimples();
		try {
			prd.setId(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		System.out.println(prd.getId());
		*/
		try {
		ProdutoSimples prd = ProdutoSimples.create("Lapis",20, 1.20);
		System.out.println(prd.getId());
	}

	}
