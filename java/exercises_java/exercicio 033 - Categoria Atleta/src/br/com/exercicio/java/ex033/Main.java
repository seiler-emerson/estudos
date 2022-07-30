package br.com.exercicio.java.ex033;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("A Confederação Nacional de Natação precisa de um programa que leia o ano de nascimento de um atleta e mostre sua categoria, de acordo com a idade:");
		System.out.println("- Até 9 anos: MIRIM, Até 14 anos: INFANTIL, Até 19 anos: JÚNIOR, Até 25 anos: SÊNIOR, Acima de 25 anos: MASTER");
		
		int idade;
		short anoNascimento, anoAtual;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o ano do seu nascimento: ");
		anoNascimento = entrada.nextShort();
		
		System.out.println("Informe o ano atual: ");
		anoAtual = entrada.nextShort();
		
		idade = anoAtual - anoNascimento;
		
		if(idade<=9 && idade>-1) {
			System.out.println("Categoria: Mirim");
		} else if(idade<=14) {
			System.out.println("Categoria: Infantil");
		} else if (idade<=19) {
			System.out.println("Categoria: Júnior");
		} else if (idade<=25) {
			System.out.println("Categoria: Sênior");
		} else {
			System.out.println("Categoria: Master");
		}
		
		
		
	}

}
