package br.com.exercicio.java.ex054;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Faça um programa onde o computador vai "pensar" em um número entre 0 e 10.
		// O jogador vai tentar adivinhar até acertar, mostrando no final quantos
		// palpites foram necessários para vencer.

		Scanner input = new Scanner(System.in);
		Random geradorNumeros = new Random();

		byte palpite, numeroComputador;
		short contagemErros = 0;

		do {
			numeroComputador = (byte) geradorNumeros.nextInt(11);
			System.out.println("VAMOS LA");
			System.out.println("Tente adivinhar o numero que o computador esta \"PENSANDO\"");
//			System.out.println("o computador pensou em " + numeroComputador);
			palpite = input.nextByte();
			System.out.println("");
			if (palpite == numeroComputador) {
				System.out.println("Por acaso voce e o Giskard? Personagem de Asimov que le mentes?");
				if (contagemErros == 0) {
					System.out.println("Ual acertou de primeira!");
				} else {
					System.out.println("Voce precisou de " + contagemErros + " palpites para acertar.");
				}
			} else {
				contagemErros += 1;
				System.out.println("Voce ja fez " + contagemErros + " palpites, TENTE NOVAMENTE\n");
			}
		} while (palpite != numeroComputador);
	}

}
