package br.com.entra21.java.avancado.aula09.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula07.DataFuturaException;

public class ExercicioException {
	static Scanner input = new Scanner(System.in);
	
	public static void exercicioException() {
		
		byte opcao;
		System.out.println("Selecione um exercicio para executar");
		System.out.println("1 - Exception Texto e Numero");
		System.out.println("2 - Idade menor que 0");
		opcao = input.nextByte();		
		
		do {
			switch (opcao) {
			case 1:
				exercicio1();
				break;
			case 2:
				exercicio2();
				break;
			default:
				System.out.println("Selecione uma opcao valida");
			}
			
		} while(opcao!=0);
		
	}
	
	public static void exercicio1() {
		System.out.println("Digite seu nome");
		try {
			byte nome = input.nextByte();
			
		} catch (InputMismatchException e) {
			System.out.println("OPA, parece que voce digitou um texto no lugar de um numero.");
			
		}
	}
		
		
	public static void exercicio2() {
		System.out.println("Informe sua idade");
		try {
			byte idade = input.nextByte();

			if (idade < 0) {
				throw new IdadeImpossivelException();
			}

		} catch (IdadeImpossivelException e) {
			System.out.println("Voce digitou uma idade menor que zero");
		}
	}
	
	
	
}
