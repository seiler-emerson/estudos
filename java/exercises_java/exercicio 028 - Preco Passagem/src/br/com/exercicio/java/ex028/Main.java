package br.com.exercicio.java.ex028;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Desenvolva um programa que pergunte a distância de uma viagem em Km.");
		System.out.println("Calcule o preço da passagem, cobrando R$0,50 por Km para viagens de até 200Km e R$0,45 parta viagens mais longas.");
		
		long distanciaPercorrida;
		float precoPassagem;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a distância da viagem em km para o cálculo do valor da passagem: ");
		distanciaPercorrida = entrada.nextLong();
		
		if (distanciaPercorrida<=200) {
			precoPassagem = distanciaPercorrida * 0.5f;
		} else {
			precoPassagem = distanciaPercorrida * 0.45f;
		}

		System.out.println("Para a distancia de "+distanciaPercorrida+"km, o valor da passagem é de R$"+precoPassagem);
	}

}
