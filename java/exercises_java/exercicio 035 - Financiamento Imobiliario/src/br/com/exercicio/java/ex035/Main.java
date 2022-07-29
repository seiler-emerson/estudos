package br.com.exercicio.java.ex035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa. Pergunte o valor da casa,"
				+ "o salário do comprador e em quantos anos ele vai pagar. A prestação mensal não pode exceder 30% do salário ou então o empréstimo será negado.");
		
		float valorImovel, salario;
		float anosFinanciamento, mesesFinanciamento, prestacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor do imóvel que você deseja financiar em R$?");
		valorImovel = entrada.nextFloat();
		
		System.out.println("Qual o seu salário mensal em R$?");
		salario = entrada.nextFloat();
		
		System.out.println("Quantos anos de financiamento você pretende fazer?");
		anosFinanciamento = entrada.nextShort();
		
		mesesFinanciamento = anosFinanciamento * 12;
		
		prestacao = valorImovel / mesesFinanciamento;
		
		if(prestacao > (salario*0.3f)) {
			System.out.println("Desculpe, seu financiamento não foi aprovado.");
			System.out.println("O valor da sua prestacao ficou em R$"+prestacao+" ela excede 30% do valor do seu salário.");
		} else {
			System.out.println("Parabéns, seu financiamento foi aprovado.");
			System.out.println("O valor da sua prestacao ficou em R$"+prestacao+" financiada em "+mesesFinanciamento+" meses.");
		}
		
	}

}
