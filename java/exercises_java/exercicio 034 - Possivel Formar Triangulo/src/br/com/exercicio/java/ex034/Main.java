package br.com.exercicio.java.ex034;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Desenvolva um programa que leia o comprimento de três retas e diga ao usuário se elas podem ou não formar um triângulo.");
		
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
			System.out.println("Os segmentos acima PODEM FORMAR UM triângulo!");
		} else {
			System.out.println("Os segmentos acima NÃO PODEM FORMAR UM triângulo!");
		}
	}

}
