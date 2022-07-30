package br.com.exercicio.java.ex050;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crie um programa que leia o ano de nascimento de uma quantidade de pessoas definida pelo usuario.
		// No final, mostre quantas pessoas ainda não atingiram a maioridade e quantas já são maiores.
		Scanner input = new Scanner(System.in);
		byte quantidadePessoas=0;
		short anoAtual;
		
		System.out.print("Por favor digite a quantidade de pessoas que voce vai coletar e analisar as idades: ");
		quantidadePessoas = input.nextByte();
		
		System.out.print("Por favor digite em que ano estamos: ");
		anoAtual = input.nextShort();
		
		short anoNascimento[] = new short[quantidadePessoas];
		
		for(byte count=0;count<quantidadePessoas;count++) {
			System.out.println("Digite o ano de nascimento da "+(count+1)+"ª pessoa: ");
			anoNascimento[count] = input.nextShort();
		}
		
		byte quantidadeMenorIdade=0;
		for(byte countMinus=0;countMinus<quantidadePessoas;countMinus++) {
			if((anoAtual - anoNascimento[countMinus])<18) {
				quantidadeMenorIdade+=1;
			}
		}
		System.out.println("Das "+quantidadePessoas+" pessoas informadas, "+quantidadeMenorIdade+" ainda sao menores de idade.");
		
	}

}
