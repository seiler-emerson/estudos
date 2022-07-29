package br.com.exercicio.java.ex029;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que leia um ano qualquer e mostre se ele é bisexto.");
		
		/*
	    1 - Se o ano for uniformemente divisível por 4 (RESTO = 0), vá para a etapa 3.
	    2 - Se ele NÃO for uniformemente divisível por 4, vá para a etapa 8.
	    3 - Se o ano for uniformemente divisível por 100, vá para a etapa 5.
	    4 - Se o ano NÃO for uniformemente divisível por 100, vá para a etapa 7.
	    5 - Se o ano for uniformemente divisível por 400, vá para a etapa 7.
	    6 - Se o ano NÃO for uniformemente divisível por 400, vá para a etapa 8.
	    7 - O ano é bissexto (tem 366 dias).
	    8 - O ano não é um ano bissexto (tem 365 dias).
	    * Uniformemente divisível = RESTO = 0
	    */

	short ano;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Insira um ano, para verifcar se ele é ou foi bisexto: ");
	ano = entrada.nextShort();

	if( ano % 4 == 0 ) {
		if (ano % 100 == 0) {
			if (ano % 400 == 0) {
	        	System.out.println("O ano "+ano+" É bisexto!");
	        } else {
	        	System.out.println("O ano "+ano+" NÃO É bisexto!");
	        }
		} else {
	    	System.out.println("O ano "+ano+" É bisexto!");
		}
	} else {
		System.out.println("O ano "+ano+" NÃO É bisexto!");
	}


}

}
