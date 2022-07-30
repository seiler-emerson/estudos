package br.com.exercicio.java.ex016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.");
		System.out.println("Ex: Digite um número: 6.127");
		System.out.println("O número 6.127 tem a parte Inteira 6.");
		
		double numero;
		int numeroTruncado;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero decimal: ");
		numero = entrada.nextDouble();
		
		
		if((numero - Math.round(numero))>0.5f) {
			numeroTruncado = (int) (numero - (numero - Math.round(numero)));
			System.out.println(numeroTruncado);
		} else {
			numeroTruncado = (int) (numero + (numero - Math.round(numero)));
			System.out.println(numeroTruncado);
		}
		
	}

}
