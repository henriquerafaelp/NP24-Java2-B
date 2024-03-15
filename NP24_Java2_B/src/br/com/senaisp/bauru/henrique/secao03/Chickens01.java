package br.com.senaisp.bauru.henrique.secao03;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here - Cenário 1 
       // int eggsPerChicken = 5, chickenCount = 3, totalEggs = 0;
    	//Put yout code here - Cenário 2 
        int eggsPerChicken = 4, chickenCount = 8, totalEggs = 0;
       //Na segunda-feira Mr.Brown recolhe ovos;
        totalEggs += eggsPerChicken * chickenCount++;
        //na terça-feira, Mr.Brown ganha uma galinha pela manhã
        //chickenCount++
        totalEggs += eggsPerChicken * chickenCount;
        //na quarta-feira pela manha um animal come metade das galinhas
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        
        System.out.println(totalEggs);
    }   
}
