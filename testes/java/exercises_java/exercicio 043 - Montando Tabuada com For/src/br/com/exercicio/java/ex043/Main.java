package br.com.exercicio.java.ex043;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Monte uma tabuada de um número que o usuário escolher, só que agora utilizando um laço for.

		Scanner input = new Scanner(System.in);
		
		byte number;
		
		System.out.println("Por favor digite um número entre 1 e 127 para montar a sua tabuada de 1 até 10.");
		number = input.nextByte();
		System.out.println("");
		System.out.println("=================");
		for(byte count=0;count<10;count++) {
			System.out.println(number+" x "+(count+1)+" = "+(number*(count+1)));
		}
		System.out.println("=================");
	}

}
