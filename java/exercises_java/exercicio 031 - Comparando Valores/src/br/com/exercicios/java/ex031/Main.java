package br.com.exercicios.java.ex031;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que leia dois números inteiros e compare-os. mostrando na tela uma mensagem:");
		System.out.println("- O primeiro valor é maior, O segundo valor é maior, Não existe valor maior, os dois são iguais");
		
		float numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		numero2 = entrada.nextFloat();
		
		if(numero1 > numero2) {
			System.out.println("O primeiro valor é maior.");
		} else if(numero1<numero2) {
			System.out.println("O segundo valor é maior.");
		} else {
			System.out.println("Não existe valor maior, os dois são iguais.");
		}
	}

}
