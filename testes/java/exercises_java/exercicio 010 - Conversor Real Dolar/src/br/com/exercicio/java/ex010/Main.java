package br.com.exercicio.java.ex010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(
				"Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos Dólares ela pode comprar.");

		float real, dolarAtual, conversao;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite quantos reais você tem em sua carteira: ");
		real = entrada.nextFloat();

		System.out.println("Digite qual a cotação atual do dolar hoje: ");
		dolarAtual = entrada.nextFloat();

		conversao = real / dolarAtual;

		System.out.println(
				"Levando em consideração que você tem R$" + real + " na carteira e o dolar hoje está contado em R$"
						+ dolarAtual + ", com o que você tem na carteira, você pode comprar U$" + conversao);
	}

}
