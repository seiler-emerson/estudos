package br.com.exercicio.java.ex026;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que leia a velocidade de um carro.");
		System.out.println("Se ele ultrapassar 80Km/h, mostre uma mensagem dizendo que ele foi multado.");
		System.out.println("A multa vai custar R$7,00 por cada Km acima do limite.");
		
		float velocidade, multa, velocidadeExcedente;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a velocidade do veículo na hora da leitura: ");
		velocidade = entrada.nextFloat();
		
		if (velocidade > 80) {
			velocidadeExcedente = velocidade - 80;
			multa = velocidadeExcedente * 7;
			System.out.println("Você ultrapassou o limite de velocidade em "+velocidadeExcedente+"km/h, você foi multado em R$"+multa);
		} else {
			System.out.println("Você está dentro do limite de velocidade.");
		}
	}

}
