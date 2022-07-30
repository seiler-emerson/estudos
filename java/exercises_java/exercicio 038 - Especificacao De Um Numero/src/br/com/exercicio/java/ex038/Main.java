package br.com.exercicio.java.ex038;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Faça um programa que leia um número de 0 a 9999 e mostre na tela cada um dos dígitos separados.
		
		int number;
		String thousand,hundred,ten,unity;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter a number between 0 and 9999.");
		number = input.nextInt();
		String numberToString = Integer.toString(number);

		if (number<0) {
			System.out.println("Invalid number!");
		} else if(number<10) {
			unity = numberToString.substring(0, 1);
			System.out.println("Unidade = "+unity);
		} else if(number<100) {
			ten = numberToString.substring(0, 1);
			unity = numberToString.substring(1, 2);
			System.out.println("Dezena = "+ten);
			System.out.println("Unidade = "+unity);
		} else if (number<1000) {
			hundred = numberToString.substring(0, 1);
			ten = numberToString.substring(1, 2);
			unity = numberToString.substring(2, 3);
			System.out.println("Centena = "+hundred);
			System.out.println("Dezena = "+ten);
			System.out.println("Unidade = "+unity);
		} else if (number<10000) {
			thousand = numberToString.substring(0, 1);
			hundred = numberToString.substring(1, 2);
			ten = numberToString.substring(2, 3);
			unity = numberToString.substring(3, 4);
			System.out.println("Milhar = "+thousand);
			System.out.println("Centena = "+hundred);
			System.out.println("Dezena = "+ten);
			System.out.println("Unidade = "+unity);
		}  else {
			System.out.println("Invalid number!");
		}
	}

}
