package br.com.exercicio.java.ex042;

public class Main {

	public static void main(String[] args) {
		// Faça um programa que calcule a soma entre todos os números que são múltiplos de três e que se encontram no intervalo de 1 até 500.
		int sumMultiply3=0; 

		for(short count=1;count<=500;count++) {
			if(count%3 == 0) {
				System.out.println(count);
				sumMultiply3+=count;
			}
		}
		
		System.out.println("A soma de todos os multiplos de 3 entre 1 e 500 é "+ sumMultiply3);
		
		
	}

}
