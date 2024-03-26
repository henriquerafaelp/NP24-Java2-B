package br.com.senaisp.bauru.henrique.secao05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
         int dia, mes, ano;
         Scanner sc = new Scanner(System.in);
         boolean bDataValida = false;
         System.out.println("Digite sua data de nascimento");
         String xDtNasc = sc.nextLine();
         
         
         Scanner sc2 = new Scanner(xDtNasc);
         //Usando a barra como delimitador
         sc2.useDelimiter("/");
         //Pegando as partes da data
         dia = sc2.nextInt ();
         mes = sc2.nextInt ();
         ano = sc2.nextInt ();
        //Fechando Scanner 2 
         sc2.close();
         System.out.println("Dia: " + dia);
         System.out.println("Mes: " + mes);
         System.out.println("Ano: " + ano);
         //Verificando se a data e valida
         switch (mes ) {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12: bDataValida = dia >=1 && dia <31; break;
         case 4:
         case 6:
         case 9:
         case 11:bDataValida = dia>=1 && dia <30; break;
         case 2: bDataValida = dia>=1 && dia <=28 ||
        		              dia>=1 && dia <=29 && ano % 4==0 && ano%100!=0 ||
        		              dia>=1 && dia <=29 && ano%400==0; break;
         }
        	if (b
        			DataValida)//Vai exacutar somente uma linha
        		System.out.println("Data é valida");
        	else//Somente 1 comando se nao tiver {
        		System.out.println("Data é invalida!");
        	sc.close();
	}

}
