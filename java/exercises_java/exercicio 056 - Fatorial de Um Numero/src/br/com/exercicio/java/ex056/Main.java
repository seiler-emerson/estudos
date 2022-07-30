package br.com.exercicio.java.ex056;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Faça um programa que leia um número inteiro qualquer e mostre o seu fatorial.
		//Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120

		Scanner input = new Scanner(System.in);
		short numero;
		
		System.out.println("Digite um numero para saber seu fatorial:");
		numero = input.nextShort();
		
		int fatorial = numero;

		for(short count=numero; count > 1; count--) {
			fatorial = fatorial * (count-1);
			System.out.print(count+" x ");
		}
		System.out.println("1 = "+fatorial);
		System.out.println("");
		System.out.println("O numero "+numero+" fatorial e "+fatorial);
		
		
	}

}
