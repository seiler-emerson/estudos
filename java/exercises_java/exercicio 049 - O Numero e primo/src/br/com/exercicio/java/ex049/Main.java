package br.com.exercicio.java.ex049;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Faça um programa que leia um número inteiro e diga se ele é ou não um número primo.
		int numero;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor, digite um numero inteiro para verificarmos se ele é um numero primo.");
		numero = input.nextInt();
		
		int qtdNumerosDivisiveis = 0;
		
		for (int count=1;count<=numero;count++) {
			if(numero % count == 0) {
				qtdNumerosDivisiveis += 1;
			}
		}

		if (qtdNumerosDivisiveis == 2) {
			System.out.println("O numero "+numero+" E PRIMO.");
		} else {
			System.out.println("O numero "+numero+" NAO E PRIMO.");
		}
	}

}
