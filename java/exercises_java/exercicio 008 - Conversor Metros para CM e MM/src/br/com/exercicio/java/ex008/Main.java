package br.com.exercicio.java.ex008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milimetros.");
		
		float metros, centimetros, milimetros;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma medida em metros para a conversão: ");
		metros = entrada.nextFloat();
		
		centimetros = metros * 100;
		
		milimetros = metros * 1000;
		
		System.out.println(+metros+" metros são "+centimetros+" centimetros.");
		
		System.out.println(+metros+" metros são "+milimetros+" milimetros.");

	}

}
