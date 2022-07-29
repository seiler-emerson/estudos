package br.com.exercicios.java.ex022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares.");
		System.out.println("O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).");
		System.out.println("Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.");
		
		float hp, lp, ha, la, areaParede, areaAzulejo, quantidadeAzulejos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura da parede em metros: ");
		hp = entrada.nextFloat();
		
		System.out.println("Digite a largura da parede em metros: ");
		lp = entrada.nextFloat();
		
		System.out.println("Digite a altura do azulejo em centimetros: ");
		ha = entrada.nextFloat();
		
		System.out.println("Digite a largura da azulejo em centimetros: ");
		la = entrada.nextFloat();
		
		areaParede = hp * lp;
		areaAzulejo = (ha / 100)* (la / 100);
		quantidadeAzulejos = areaParede / areaAzulejo;
		
		System.out.println("A area da parede é de "+areaParede+" metros quadrados.");
		System.out.println("A area do azulejo é de "+areaAzulejo+" metros quadrados.");
		System.out.println("Serão necessários "+quantidadeAzulejos+" azulejos para cobrir a parede.");
		
		
		
	}

}
