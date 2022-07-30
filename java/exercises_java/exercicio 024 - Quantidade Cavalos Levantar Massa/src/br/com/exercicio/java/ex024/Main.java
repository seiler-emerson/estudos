package br.com.exercicio.java.ex024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos.");
		System.out.println("Considere cavalos = (m * h / t) / 745,6999");
		
		double cavalos, massaKg, alturaMetros, tempoSegundos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da massa a ser levantada em quilos: ");
		massaKg = entrada.nextFloat();
		
		System.out.println("Digite a altura em que a massa deve ser levantada: ");
		alturaMetros = entrada.nextFloat();
		
		System.out.println("Digite o valor do tempo em segundos em que a massa deve ser levantada: ");
		tempoSegundos = entrada.nextFloat();
		
		cavalos = (massaKg * alturaMetros / tempoSegundos) / 745.6999;
		
		System.out.println("Para levantar "+massaKg+" quilos, a uma altura de "+alturaMetros+" metros em "+tempoSegundos+" segundos você precisará de "+cavalos+" cavalos");
		
		
		
	}

}
