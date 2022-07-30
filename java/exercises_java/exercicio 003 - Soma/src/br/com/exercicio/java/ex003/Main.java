package br.com.exercicio.java.ex003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Crie um programa que leia dois números e mostre a soma entre eles.");
		
		int numeroA, numeroB, resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numeroA = entrada.nextInt();
		
		System.out.println("Digite outro número: ");
		numeroB = entrada.nextInt();
		
		resultado = numeroA + numeroB;
		
		System.out.println("A soma entre "+numeroA+" e "+numeroB+" é "+resultado);
	}

}
