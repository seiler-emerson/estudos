package br.com.exercicio.java.ex045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Desenvolva um programa que leia o comprimento de três retas e diga ao usuário:\n"
				+ "\tSe elas podem ou não formar um triângulo.\n"
				+ "\tSe o trinangulo e EQUILÁTERO: todos os lados iguais\n"
				+ "\tSe o trinangulo e ISÓSCELES: dois lados iguais, um diferente\n"
				+ "\tSe o trinangulo e ESCALENO: todos os lados diferentes\n");
		
		float segmentoA, segmentoB, segmentoC;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do Segmento A: ");
		segmentoA = entrada.nextFloat();
		
		System.out.println("Informe o valor do Segmento B: ");
		segmentoB = entrada.nextFloat();
		
		System.out.println("Informe o valor do Segmento C: ");
		segmentoC= entrada.nextFloat();

		
		if( Math.abs(segmentoB - segmentoC) < segmentoA && (segmentoB + segmentoC) > segmentoA &&
			Math.abs(segmentoA - segmentoC) < segmentoB && (segmentoA + segmentoC) > segmentoB &&
			Math.abs(segmentoA - segmentoB) < segmentoC && (segmentoA + segmentoC) > segmentoB){
			tipotriangulo(segmentoA,segmentoB,segmentoC);
			
		} else {
			System.out.println("Os segmentos acima NÃO PODEM FORMAR UM triângulo!");
		}
	}

	public static void tipotriangulo(float segmentoA, float segmentoB, float segmentoC) {
		if(segmentoA == segmentoB && segmentoB == segmentoC) {
			System.out.println("Os segmentos acima  PODEM FORMAR UM triângulo EQUILATERO!");
		} else if(segmentoA == segmentoB || segmentoA == segmentoC || segmentoB == segmentoC) {
			System.out.println("Os segmentos acima  PODEM FORMAR UM triângulo ISOCELES!");
		} else {
			System.out.println("Os segmentos acima  PODEM FORMAR UM triângulo ESCALENO!");
		}
	}
	
}
