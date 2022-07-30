package br.com.exercicio.java.ex014;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que converta uma temperatura digitada em °C e converta para °F.");
		
		float tempCelsius, tempFahrenheit;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius para a conversão: ");
		tempCelsius = entrada.nextFloat();
		
		System.out.println("Convertendo...");
		
		tempFahrenheit = (tempCelsius * 1.8f) + 32;
		
		System.out.println(tempCelsius+"°C é equivalente a "+tempFahrenheit+"°F");

	}

}
