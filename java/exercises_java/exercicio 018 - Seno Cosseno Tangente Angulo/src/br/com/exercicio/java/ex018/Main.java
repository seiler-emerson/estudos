package br.com.exercicio.java.ex018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.");

		double anguloGraus, anguloRad, seno, cosseno, tangente;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do ângulo: ");
		anguloGraus = entrada.nextDouble();
		
		System.out.println("Calculando.....");
		
		anguloRad = Math.toRadians(anguloGraus);
		
		
		seno = Math.sin(anguloRad);
		cosseno = Math.cos(anguloRad);
		tangente = Math.tan(anguloRad);
		
		System.out.println("Seno: "+seno);
		System.out.println("Cosseno: "+cosseno);
		System.out.println("Tangente: "+tangente);
		
		
	}

}
