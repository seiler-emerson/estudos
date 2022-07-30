package br.com.exercicio.java.ex051;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Faça um programa que leia o peso de uma quantidade de pessoas definida pelo usuario.
		//No final, mostre qual foi o maior e o menor peso lidos.
		
		Scanner input = new Scanner(System.in);
		byte quantidadePessoas=0;
				
		System.out.print("Por favor digite a quantidade de pessoas que voce vai coletar e analisar os pesos: ");
		quantidadePessoas = input.nextByte();
				
		float pesos[] = new float[quantidadePessoas];
		
		for(byte count=0;count<quantidadePessoas;count++) {
			System.out.println("Digite o peso da "+(count+1)+"ª pessoa: ");
			pesos[count] = input.nextFloat();
		}
		
		float menorPeso=0,maiorPeso=0;
		
		for(byte countPeso=0;countPeso<quantidadePessoas;countPeso++) {
			if (menorPeso==0) {
				menorPeso = pesos[countPeso];			
			} else if(pesos[countPeso] < menorPeso) {
				menorPeso = pesos[countPeso];
			}
		}
		System.out.println("Das "+quantidadePessoas+" pessoas informadas, o menor peso e "+menorPeso);
		
		for(byte countPeso=0;countPeso<quantidadePessoas;countPeso++) {
			if (maiorPeso==0) {
				maiorPeso = pesos[countPeso];			
			} else if(pesos[countPeso] > maiorPeso) {
				maiorPeso = pesos[countPeso];
			}
		}
		System.out.println("Das "+quantidadePessoas+" pessoas informadas, o maior peso e "+maiorPeso);
	}
	
	

}
