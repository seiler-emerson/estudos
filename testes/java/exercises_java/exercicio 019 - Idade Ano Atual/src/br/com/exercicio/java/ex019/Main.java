package br.com.exercicio.java.ex019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Determine qual é a idade que o usuário faz no ano atual.");
		System.out.println("Para isso solicite o ano de nascimento do usuário e o ano atual.");
		
		byte idade;
		short anoAtual, anoNascimento;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu ano de nascimento?");
		anoNascimento = entrada.nextShort();
		
		System.out.println("Qual o ano atual?");
		anoAtual = entrada.nextShort();

		idade = (byte) (anoAtual - anoNascimento);
		
		System.out.println("Sabendo que você nasceu no ano "+anoNascimento+" e estamos no ano "+anoAtual+", você tem "+idade+" anos.");
	}

}
