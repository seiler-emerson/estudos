package br.com.exercicio.java.ex009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que leia um número inteiro qualquer e mostre na tela a sua tabuada de 1 a 10.");
		
		int numero, t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para gerar sua tabuada de 1 a 10: ");
		numero = entrada.nextInt();
		
		t1 = numero * 1;
		t2 = numero * 2;
		t3 = numero * 3;
		t4 = numero * 4;
		t5 = numero * 5;
		t6 = numero * 6;
		t7 = numero * 7;
		t8 = numero * 8;
		t9 = numero * 9;
		t10 = numero * 10;
		
		System.out.println(numero+" * 1 = "+t1);
		System.out.println(numero+" * 2 = "+t2);
		System.out.println(numero+" * 3 = "+t3);
		System.out.println(numero+" * 4 = "+t4);
		System.out.println(numero+" * 5 = "+t5);
		System.out.println(numero+" * 6 = "+t6);
		System.out.println(numero+" * 7 = "+t7);
		System.out.println(numero+" * 8 = "+t8);
		System.out.println(numero+" * 9 = "+t9);
		System.out.println(numero+" * 10 = "+t10);

	}

}
