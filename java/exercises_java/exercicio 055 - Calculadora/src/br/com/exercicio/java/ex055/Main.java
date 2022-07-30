package br.com.exercicio.java.ex055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crie um programa que leia dois valores e mostre um menu na tela:
		// [ 1 ] somar
		// [ 2 ] multiplicar
		// [ 3 ] maior
		// [ 4 ] sair do programa
		// Seu programa deverá realizar a operação solicitada em cada caso.

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		byte numeroA = input.nextByte();
		System.out.print("Informe outro numero: ");
		byte numeroB = input.nextByte();
		System.out.println("Escolha uma das opcoes do menu para trabalhar com os numeros.");
		
		System.out.println(montarMenu());
		byte opcao = input.nextByte();
		
		switch (opcao) {
		case 1:
			somar(numeroA, numeroB);
			System.out.println("A soma entre "+numeroA+" e "+numeroB+" é "+somar(numeroA, numeroB));
			break;
		case 2:
			multiplicar(numeroA, numeroB);
			System.out.println("A multiplicacao entre "+numeroA+" e "+numeroB+" é "+multiplicar(numeroA, numeroB));
			break;
		case 3:
			maior(numeroA, numeroB);
			break;
		case 4:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Escolha uma opcao valida!");
			break;
		}
		
	}
	
	public static String montarMenu() {
		String menu="";
		menu+="[ 1 ] somar\n";
		menu+="[ 2 ] multiplicar\n";
		menu+="[ 3 ] maior\n";
		menu+="[ 4 ] sair do programa";
		
		return menu;
	}

	public static int somar(float numeroA, float numeroB) {
		int resultado = (int) (numeroA+numeroB);
		
		return resultado;
	}

	public static int multiplicar(float numeroA, float numeroB) {
		int resultado = (int) (numeroA*numeroB);
		
		return resultado;
	}

	public static void maior(float numeroA, float numeroB) {
		if(numeroA>numeroB) {
			System.out.println("O numero "+numeroA+" é maior que o numero "+numeroB);
		} else if(numeroB > numeroA) {
			System.out.println("O numero "+numeroB+" é maior que o numero "+numeroA);
		} else {
			System.out.println("Os dois numeros sao IGUAIS.");
		}
	}

}
