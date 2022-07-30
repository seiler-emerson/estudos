package br.com.exercicio.java.ex005;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e seu antecessor.");

		int numero, sucessor, antecessor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = entrada.nextInt();

		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("O antecessor do número " +numero+" é o número "+antecessor);	
		System.out.println("O sucessor do número " +numero+" é o número "+sucessor);
		
	}

}
