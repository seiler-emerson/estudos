package br.com.exercicio.java.ex030;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que pergunte o salário de um funcionário e calcule o valor do seu aumento.");
		System.out.println("Para salários superiores a R$1250,00, calcule um aumento de 10%. Para os inferiores ou iguais, o aumento é de 15%.");
		
		double salario, novoSalario;
		float aumento;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor insira seu salário para calcular o aumento.");
		salario = entrada.nextShort();
		
		if(salario>1250) {
			aumento=10f;
			novoSalario = salario * (1 + (aumento/100));
		} else {
			aumento=15f;
			novoSalario = salario * (1 + (aumento/100));
		}
		
		System.out.println("Seu salário atual é R$"+salario+" você recebera um aumento de "+aumento+"% e seu novo salário será R$"+novoSalario);

	}

}
