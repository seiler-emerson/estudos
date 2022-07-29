package br.com.exercicio.java.ex007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.");
		
		String nomeAluno;
		float nota1, nota2, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = entrada.nextLine();
		
		System.out.println("Digite a primeira nota de "+nomeAluno+": ");
		nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota de "+nomeAluno+": ");
		nota2 = entrada.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("A média de "+nomeAluno+" foi "+media);

	}

}
