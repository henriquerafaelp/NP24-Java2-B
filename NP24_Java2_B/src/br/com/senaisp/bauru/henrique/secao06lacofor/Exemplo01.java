package br.com.senaisp.bauru.henrique.secao06lacofor;

public class Exemplo01 {

	public static void main(String[] args) {
         for(int i=0;i<10;i++) {
        	 System.out.println("7 x"+ i + " = " + (7*i));
         }
         //contagem regressiva
         for(int i=100;i>0;i--) {
        	 System.out.println(i);
         }
       //For sem as chaves
         for (int i=0;i<5;i++); {
        	   System.out.println("linha do for");
         }
         System.out.println("linha seguinte!");
         //For sem os paramentros
         for(;;) {
        	 System.out.println("For infinito");
         }
	}

}
