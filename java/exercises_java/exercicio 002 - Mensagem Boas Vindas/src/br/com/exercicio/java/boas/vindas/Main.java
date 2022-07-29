package br.com.exercicio.java.boas.vindas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.");

		String nome;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome: ");
		nome = entrada.nextLine();
				
		System.out.println("Seja bem vindo(a) "+nome);
	}

}
