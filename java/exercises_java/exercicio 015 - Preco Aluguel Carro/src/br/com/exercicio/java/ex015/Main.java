package br.com.exercicio.java.ex015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a "
				+ "quantidade de dias pelos quais ele foi alugado.");
		System.out.println("Calcule o preço a pagar, sabendo que o carro custa R$60,00 por dia e R$0,15 por km rodado.");
		
		float kmRodados, precoPagar, precoDia=60f, precoKmRodado=0.15f;
		short diasAlugado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos km foram rodados com o carro?");
		kmRodados = entrada.nextFloat();
		
		System.out.println("Por quantos dias o carro foi alugado?");
		diasAlugado = entrada.nextShort();
		
		System.out.println("Calculando preço...");
		
		precoPagar = (kmRodados * precoKmRodado) + ( diasAlugado * precoDia);
		
		System.out.println("O valor do aluguel para um carro que ficou "+diasAlugado+" alugados e que percorreu "+kmRodados+"km é de R$"+precoPagar);
		
		
		
		
	}

}
