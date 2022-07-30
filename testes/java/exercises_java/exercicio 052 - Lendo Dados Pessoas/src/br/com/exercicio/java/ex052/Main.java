package br.com.exercicio.java.ex052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Desenvolva um programa que leia o nome, idade e sexo de 4 pessoas.
		// No final do programa, mostre:
			// a média de idade do grupo.
			// qual é o nome do homem mais velho
			// quantas mulheres têm menos de 20 anos.
		
		Scanner input = new Scanner(System.in);
		String nomes[] = new String[4];
		byte idades[] = new byte[4];
		String sexo[] = new String[4];
		
		for(byte count=0;count<nomes.length;count++) {
			System.out.println("Por favor digite o nome da "+(count+1)+"ª pessoa.");
			nomes[count] = input.next();
			System.out.println("Por favor digite a idade da "+(count+1)+"ª pessoa.");
			idades[count] = input.nextByte();
			System.out.println("Por favor digite o sexo da "+(count+1)+"ª pessoa. (m/f)");
			sexo[count] = input.next();
		}

		// a média de idade do grupo.
		float mediaIdades=0;
		for(byte countMedia=0;countMedia<idades.length;countMedia++) {
			mediaIdades+=idades[countMedia];
		}
		mediaIdades = mediaIdades/idades.length;
		System.out.println("A media das idades e "+mediaIdades+" anos");
		
		// qual é o nome do homem mais velho
		byte maiorIdadeM = 0;
		byte posMaiorIdade=0;
		for(byte countIdadeM=0;countIdadeM<idades.length;countIdadeM++) {
			if(sexo[countIdadeM].equalsIgnoreCase("m")) {
				if(idades[countIdadeM] > maiorIdadeM) {
					maiorIdadeM = idades[countIdadeM];
					posMaiorIdade = countIdadeM;
				}
			}
		}
		System.out.println("O nome do homem mais velho e "+nomes[posMaiorIdade]);
		
		// quantas mulheres têm menos de 20 anos.
				byte quantidadeMulheresMenores20 = 0;
				for(byte countIdadeF=0;countIdadeF<idades.length;countIdadeF++) {
					if(sexo[countIdadeF].equalsIgnoreCase("f")) {
						if(idades[countIdadeF] < 20) {
							quantidadeMulheresMenores20 += 1;
						}
					}
				}
				System.out.println("A quantidade de mulheres com menos de 20 anos e "+quantidadeMulheresMenores20);
	}

}
