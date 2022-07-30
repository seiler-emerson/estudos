package br.com.exercicio.java.ex017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo.");
		System.out.println("Calcule e mostre o comprimento da hipotenusa.");
		
		double catetoOposto, catetoAdjacente, hipotenusa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do cateto oposto: ");
		catetoOposto = entrada.nextFloat();
		
		System.out.println("Informe o valor do cateto adjacente: ");
		catetoAdjacente = entrada.nextFloat();
		
		System.out.println("Calculando....");
		
		hipotenusa = Math.sqrt((catetoOposto*catetoOposto)+(catetoAdjacente*catetoAdjacente));
		
		System.out.println("A hipotenusa é de "+hipotenusa);
	
		
		
		
		
	}

}
