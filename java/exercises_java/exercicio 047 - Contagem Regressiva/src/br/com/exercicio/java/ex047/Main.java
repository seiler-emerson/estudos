package br.com.exercicio.java.ex047;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//Faça um programa que mostre na tela uma contagem regressiva para o estouro de fogos de artifício, indo de 10 até 0, com uma pausa de 1 segundo entre eles.
		
		for(byte count=0;count<10;count++) {
			System.out.println((10-count));
			new Thread();
			Thread.sleep(1000);
		}
		System.out.println("FELIZ ANO NOVO!!!");
		System.out.println("SOM DE FOGOS DE ARTIFICIO!!!");

	}

}
