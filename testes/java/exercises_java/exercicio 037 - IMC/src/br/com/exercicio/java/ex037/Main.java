package br.com.exercicio.java.ex037;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capturar peso e altura para calcular o IMC e exibir o resultado e em qual faixa de peso.");
		
		float peso, altura, imc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso em quilos: ");
		peso = entrada.nextFloat();
		
		System.out.println("Digite sua altura em metros: ");
		altura = entrada.nextFloat();
		
		imc = peso / (altura*altura);
		
		if(imc<18.5f) {
			System.out.println("Seu IMC � "+imc+", voc� est� abaixo do peso.");
		} else if(imc<=24.9f) {
			System.out.println("Seu IMC � "+imc+", voc� est� com o peso normal.");
		} else if(imc<=29.9f) {
			System.out.println("Seu IMC � "+imc+", voc� est� com sobrepeso.");
		} else if(imc<=34.9f) {
			System.out.println("Seu IMC � "+imc+", voc� est� com obesidade grau I.");
		} else if(imc<=39.9f) {
			System.out.println("Seu IMC � "+imc+", voc� est� com obesidade grau II.");
		} else {
			System.out.println("Seu IMC � "+imc+", voc� est� com obesidade grau III (Obesidade M�rbida).");
		}
	}

}
