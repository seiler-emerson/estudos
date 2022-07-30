package br.com.exercicio.java.ex041;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Faça um programa que leia três números, armazene em um vetor e mostre qual é o maior e qual é o menor.

		Scanner input = new Scanner(System.in);
		byte numbers[] = new byte[3];
		
		for(byte count=0;count<numbers.length;count++) {
			System.out.println("Por favor digite o "+(count+1)+"º numero.");
			numbers[count] = input.nextByte();
		}
		
		if(numbers[0] > numbers[1] && numbers[0] > numbers[2] ) {
			System.out.println("O número "+numbers[0]+" e o maior.");
		} else if(numbers[1] > numbers[0] && numbers[1] > numbers[2]) {
			System.out.println("O número "+numbers[1]+" e o maior.");
		} else {
			System.out.println("O número "+numbers[2]+" e o maior.");
		}
		
		if(numbers[0] < numbers[1] && numbers[0] < numbers[2] ) {
			System.out.println("O número "+numbers[0]+" e o menor.");
		} else if(numbers[1] < numbers[0] && numbers[1] < numbers[2]) {
			System.out.println("O número "+numbers[1]+" e o menor.");
		} else {
			System.out.println("O número "+numbers[2]+" e o menor.");
		}
		
	}

}
