package br.com.exercicio.java.ex032;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia o ano de nascimento de um jovem e informe, de acordo com a sua idade, se ele ainda vai se alistar ao serviço militar, se é a hora exata de se alistar ou se já passou do tempo do alistamento. Seu programa também deverá mostrar o tempo que falta ou que passou do prazo.");

		int idade;
		short anoNascimento, anoAtual;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o ano do seu nascimento: ");
		anoNascimento = entrada.nextShort();
		
		System.out.println("Informe o ano atual: ");
		anoAtual = entrada.nextShort();
		
		idade = anoAtual - anoNascimento;
				
		if(idade<18 && idade>-1) {
			System.out.println("Ainda não está na hora do seu alistamento.");
			System.out.println("Faltam "+(18-idade)+" ano(s) para você se alistar.");
		} else if (idade==18) {
			System.out.println("Você tem 18 anos, é hora de se alistar no serviço militar.");
		} else if (idade>18) {
			System.out.println("Você já deveria ter realizado seu alistamento.");
			System.out.println("Já se passou "+(idade-18)+" ano(s).");
		} else {
			System.out.println("Nossa! Você é do futuro?");
		}
	}

}
