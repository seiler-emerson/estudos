package br.com.exercicio.java.ex020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado,  ficou de recuperação ou foi reprovado.");
		System.out.println("A média de aprovação é >= 7.0.");
		System.out.println("A média de recuperação é >= 5.0 e < 7.0.");
		System.out.println("A média do reprovado é < 5.0.");
		
		float nota1,nota2,nota3,media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2 = entrada.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		nota3 = entrada.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media>=7) {
			System.out.println("O aluno foi aprovado.");
		} else if(media<7 && media>=5) {
			System.out.println("O aluno está em recuperação.");
		} else {
			System.out.println("O aluno foi reprovado.");
		}
		
	}

}
