package br.com.exercicio.java.ex012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.");
		
		float preco, precoDesconto, desconto=0.05f;
		String produto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o nome do produto: ");
		produto = entrada.nextLine();
		
		System.out.println("Por favor, digite o valor do produto: ");
		preco = entrada.nextFloat();
		
		System.out.println("Calculando...");
		
		precoDesconto = preco * (1-desconto);
		
		System.out.println("O produto "+produto+" custa R$"+preco+", com o desconto de 5% o preço do produto ficom em R$"+precoDesconto);
		
	}

}
