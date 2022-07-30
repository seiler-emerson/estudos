package br.com.exercicio.java.ex039;

public class Main {
	public static void main(String[] args) {
		//Crie um programa que mostre na tela todos os números pares que estão no intervalo entre 1 e 50.
		
		byte counter;
		
		for(counter=1;counter<=50;++counter) {
			if(counter%2==0) {
				System.out.println("Counting "+counter);
			} else {
				//nothing to do
			}
		}
		
		
	}
}
