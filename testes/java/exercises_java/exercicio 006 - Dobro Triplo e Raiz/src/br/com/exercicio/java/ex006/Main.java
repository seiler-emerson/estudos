package br.com.exercicio.java.ex006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Crie um programa que leia um número e mostre o seu dobro, triplo e raiz quadrada.");

		double numero, dobro, triplo, raiz;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = entrada.nextDouble();

		dobro = numero * 2;
		triplo = numero * 3;
		raiz = Math.sqrt(numero);
		
		System.out.println("O dobro do número " +numero+" é o número "+dobro);	
		System.out.println("O triplo do número " +numero+" é o número "+triplo);
		System.out.println("A raiz do número " +numero+" é o número "+raiz);

	}

}
