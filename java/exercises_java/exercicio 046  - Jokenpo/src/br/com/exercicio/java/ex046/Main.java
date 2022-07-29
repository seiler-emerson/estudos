package br.com.exercicio.java.ex046;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Crie um programa que faça o computador jogar Jokenpô com você.
		
		byte opcao;

		do {
			System.out.println("JOKENPO");
			System.out.println("Escolha uma opcao: ");
			montarEscolha();
			opcao = input.nextByte();
			System.out.println("");
			
			switch(opcao) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1,2,3:
				jogandoJokenpo(opcao);				
				break;
			default:
				System.out.println("Opcao invalida! Tente novamente!");
				break;
			}

		} while (opcao != 0);

	}

	public static void montarEscolha() {
		System.out.println("1 - PEDRA\n" + "2 - PAPEL\n" + "3 - TESOURA\n" + "0 - DESISTO");
	}

	public static void jogandoJokenpo(byte escolhaJogador) {
		Random geradorNumeros = new Random();

		byte escolhaComputador = (byte) ((byte) geradorNumeros.nextInt(3) + 1);

		if (escolhaJogador == 1 && escolhaComputador == 2) {
			System.out.println("VOCE ESCOLHEU PEDRA E O COMPUTADOR ESCOLHEU PAPEL");
			System.out.println("COMPUTADOR GANHOU PAPEL VENCE PEDRA!\n");
		} else if (escolhaJogador == 2 && escolhaComputador == 1) {
			System.out.println("VOCE ESCOLHEU PAPEL E O COMPUTADOR ESCOLHEU PEDRA");
			System.out.println("VOCE GANHOU PAPEL VENCE PEDRA!\n");
		} else if (escolhaJogador == 1 && escolhaComputador == 3) {
			System.out.println("VOCE ESCOLHEU PEDRA E O COMPUTADOR ESCOLHEU TESOURA");
			System.out.println("VOCE GANHOU PEDRA VENCE TESOURA!\n");
		} else if (escolhaJogador == 3 && escolhaComputador == 1) {
			System.out.println("VOCE ESCOLHEU TESOURA E O COMPUTADOR ESCOLHEU PEDRA");
			System.out.println("COMPUTADOR GANHOU PEDRA VENCE TESOURA!\n");
		} else if (escolhaJogador == 3 && escolhaComputador == 2) {
			System.out.println("VOCE ESCOLHEU TESOURA E O COMPUTADOR ESCOLHEU PAPEL");
			System.out.println("VOCE GANHOU TESOURA VENCE PAPEL!\n");
		} else if (escolhaJogador == 2 && escolhaComputador == 3) {
			System.out.println("VOCE ESCOLHEU PAPEL E O COMPUTADOR ESCOLHEU TESOURA");
			System.out.println("COMPUTADOR GANHOU TESOURA VENCE PAPEL!\n");
		} else {
			if(escolhaJogador == 1) {
				System.out.println("VOCES DOIS EMPATARAM PORQUE ESCOLHERAM PEDRA! JOGUEM NOVAMENTE PARA DESEMPATAR!\n");				
			} else if(escolhaJogador == 1) {
				System.out.println("VOCES DOIS EMPATARAM PORQUE ESCOLHERAM PAPEL! JOGUEM NOVAMENTE PARA DESEMPATAR!\n");	
			} else {
				System.out.println("VOCES DOIS EMPATARAM PORQUE ESCOLHERAM TESOURA! JOGUEM NOVAMENTE PARA DESEMPATAR!\n");	
			}
		}

	}
}
