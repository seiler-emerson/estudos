package br.com.exercicio.java.ex048;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Desenvolva um programa que leia o primeiro termo e a razão de uma PA. No final, mostre os 10 primeiros termos dessa progressão.
		Scanner input = new Scanner(System.in);
		int primeiroTermo,razao;
		
		System.out.print("Digite o primeiro termo da PA: ");
		primeiroTermo = input.nextInt();
		
		System.out.print("Digite a razao que a PA deve ter: ");
		razao = input.nextInt();
		
		for(byte count=0;count<10;count++) {
			System.out.print(primeiroTermo+" -> ");
			primeiroTermo+=razao;
		}
		System.out.print("FIM");
	}

}
