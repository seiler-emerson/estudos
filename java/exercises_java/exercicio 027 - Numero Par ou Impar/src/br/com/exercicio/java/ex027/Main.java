package br.com.exercicio.java.ex027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Crie um programa que leia um número inteiro e mostre na tela se ele é PAR ou ÍMPAR.");
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para a verificação: ");
		numero = entrada.nextInt();
		
		if (numero%2>0) {
			System.out.println("O número "+numero+" é ÍMPAR");
		} else {
			System.out.println("O número "+numero+" é PAR");
		}

	}

}
