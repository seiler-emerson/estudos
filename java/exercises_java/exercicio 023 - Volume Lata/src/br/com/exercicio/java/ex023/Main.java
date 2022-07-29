package br.com.exercicio.java.ex023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = PI * R * R * A");
		System.out.println("V, R e A representam respectivamente o volume, o raio e a altura.");
		
		double volume, raio, altura;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o raio da lata em cm.");
		raio = entrada.nextFloat();
		
		System.out.println("Por favor, digite a altura da lata em cm.");
		altura = entrada.nextFloat();
		
		volume = Math.PI * raio * raio * altura;
		
		System.out.println("Sabendo que a altura da lata é "+altura+"cm, o raio da lata é "+raio+"cm, seu volume será de "+volume+"cm cúbicos");
		
	}

}
