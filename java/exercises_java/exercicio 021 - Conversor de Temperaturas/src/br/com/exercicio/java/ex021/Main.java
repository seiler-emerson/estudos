package br.com.exercicio.java.ex021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:");
		System.out.println("F = C * 1.8 + 32");
		System.out.println("K = C + 273.15");
		System.out.println("Re = C * 0.8");
		System.out.println("Ra = C * 1.8 + 32 + 459.67");
		
		
		double tempCelsius, tempFahrenheit, tempKelvin, tempReaumur, tempRankine;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor digite a temperatura em Celsius para a conversão: ");
		tempCelsius = entrada.nextFloat();
		
		System.out.println("Convertendo...");

		tempFahrenheit = tempCelsius * 1.8 + 32;
		tempKelvin = tempCelsius + 273.15;
		tempReaumur = tempCelsius * 0.8;
		tempRankine = tempCelsius * 1.8 + 32 + 459.67;
		
		System.out.println(tempCelsius+"°C são "+tempFahrenheit+"°F");
		System.out.println(tempCelsius+"°C são "+tempKelvin+"°K");
		System.out.println(tempCelsius+"°C são "+tempReaumur+"°Re");
		System.out.println(tempCelsius+"°C são "+tempRankine+"°Ra");
		
		
		
		
		
	}

}
