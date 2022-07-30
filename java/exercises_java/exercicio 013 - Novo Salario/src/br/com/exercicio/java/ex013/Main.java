package br.com.exercicio.java.ex013;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um algoritmo que leia o salario de um funcionário e mostre seu novo salário, com 15% de aumento.");
		
		System.out.println("CALCULADORA DE AUMENTO DE SALÁRIO");

		String nomeFuncionario;
		float salarioAtual, salarioNovo, aumento=0.15f;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá, qual o seu nome?");
		nomeFuncionario = entrada.nextLine();
		
		System.out.println("Ola "+nomeFuncionario+", qual o valor do seu salario atual?");
		salarioAtual = entrada.nextFloat();
		
		System.out.println("Calculando Aumento...");
		
		salarioNovo = salarioAtual * (1+aumento);
		
		System.out.println(nomeFuncionario+" seu novo salario será de R$"+salarioNovo);
	}

}
