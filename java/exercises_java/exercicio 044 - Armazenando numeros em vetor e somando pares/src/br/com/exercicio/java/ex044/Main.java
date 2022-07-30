package br.com.exercicio.java.ex044;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Desenvolva um programa que leia uma quantidade de números inteiros definida pelo usuario, armazene em um vetor e mostre a soma apenas daqueles que forem pares. Se o valor digitado for ímpar, desconsidere-o.

		Scanner input = new Scanner(System.in);
		
		byte amountNumbers;
		int sumNumbers=0;
		
		System.out.println("Quantos numeros voce quer armazenar?");
		amountNumbers = input.nextByte();
		
		int numberVector[] = new int[amountNumbers];
		
		for(byte count=0;count<amountNumbers;count++) {
			System.out.println("Insira o "+(count+1)+"º valor");
			numberVector[count] = input.nextInt();
		}
		
		for(byte secondCount=0;secondCount<amountNumbers;secondCount++) {
	
			if(numberVector[secondCount] % 2 ==0) {
				sumNumbers+=numberVector[secondCount];
			}
		}
		
		System.out.println("Os numeros digitados foram: ");
		
		for(byte thirdCount=0;thirdCount<amountNumbers;thirdCount++) {
			System.out.println(numberVector[thirdCount]);
		}
		
		System.out.println("A soma dos numeros pares informados é "+sumNumbers);
				
		
		
	}

}
