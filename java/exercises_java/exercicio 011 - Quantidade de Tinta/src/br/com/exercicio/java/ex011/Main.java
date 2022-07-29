package br.com.exercicio.java.ex011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(
				"Faça um programa que leia a largura e a atura de uma parede em metros, "
				+ "calcule a sua área e a quantidade de tinta necessária para pintá-la, "
				+ "sabendo que cada litro de tinta, pinta uma área de 2m quadrados.");
		
		float largura, altura, area, qtdTinta;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, insira a largura da parede em metros: ");
		largura = entrada.nextFloat();
		
		System.out.println("Por favor, insira a altura da parede em metros: ");
		altura = entrada.nextFloat();
		
		area = largura * altura;
		
		qtdTinta = area / 2;
		
		System.out.println("Sua parede tem "+area+" metros quadrados, você precisará de "+qtdTinta+" litros de tinta.");

	}

}
