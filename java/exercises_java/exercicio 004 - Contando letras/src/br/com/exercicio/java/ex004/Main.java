package br.com.exercicio.java.ex004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia uma palavra e diga quantas letras ela tem.");
		
		String palavra;
		int quantidadeLetras;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		palavra = entrada.nextLine();
		
		quantidadeLetras = palavra.length();
		
		System.out.println("A palavra "+palavra+" tem "+quantidadeLetras+" letras em sua composição.");

	}

}
