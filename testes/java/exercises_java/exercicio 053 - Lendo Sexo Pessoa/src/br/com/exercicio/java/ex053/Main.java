package br.com.exercicio.java.ex053;

import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// Faça um programa que leia o sexo de uma pessoa, mas só aceite os valores 'M' ou 'F'.
		// Caso esteja errado, peça a digitação novamente até ter um valor correto.
		
		escreverMenu();
		
	}

	public static void escreverMenu() {
		String sexo;
		System.out.println("Por favor digite o sexo de uma pessoa.\n"
				+ "\tM = Masculino\n"
				+ "\tF = Feminino");
		sexo = input.next();
		verificarSexo(sexo);
	}
	
	public static void verificarSexo(String sexo) {
		switch(sexo) {
		case "m","M":
			System.out.println("Voce digitou M, sexo masculino.");
			break;
		case "f","F":
			System.out.println("Voce digitou F, sexo feminino.");
			break;
		default:
			System.out.println("Opcao invalidade, tente novamente!");
			escreverMenu();
			break;
		}
	}
}
