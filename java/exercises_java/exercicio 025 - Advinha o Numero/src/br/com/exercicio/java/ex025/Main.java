package br.com.exercicio.java.ex025;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que faça o computador \"pensar\" em um número inteiro entre 1 e 5 e peça para o usuário tentar descobrir qual foi o número escolhido pelo computador.");
		System.out.println("O programa deverá escrever na tela se o usuário venceu ou perdeu.");
		System.out.println("");
		
		int numero, numeroSorteado;
		
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("CASA DE APÓSTAS DEV");
		System.out.println("Vamos ver se você acerta o número que será Sorteado!");
		System.out.println("");
		System.out.println("Tente a sorte! Digite um número entre 1 e 5!");
		numero = entrada.nextByte();
		
		numeroSorteado = gerador.nextInt(5)+1;
		
		if (numero == numeroSorteado) {
			System.out.println("O número sorteado foi "+numeroSorteado+" VOCÊ GANHOU!");
		} else {
			System.out.println("Não foi dessa vez o numero sorteado foi "+numeroSorteado+".");
		}
	}
}
