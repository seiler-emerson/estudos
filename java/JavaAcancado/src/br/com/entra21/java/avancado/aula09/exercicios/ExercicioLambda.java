package br.com.entra21.java.avancado.aula09.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

import br.com.entra21.java.avancado.Pessoa;

public class ExercicioLambda {

	public static void exercicioLambda() {
		percorrerArrayResumido();
		percorrerPessoa();
	}
	
	
	public static void percorrerArrayResumido() {
		System.out.println("PERCORRER ARRAY FORMA RESUMIDA\n");
		ArrayList<String> nomes = new ArrayList<>(Arrays.asList("João", "Carlos", "Bruna", "Silvana"));
		nomes.forEach(System.out::println);
	}
	
	public static void percorrerPessoa() {
		System.out.println("\nPERCORRER LINKEDLIST FOR MELHORADO\n");
		LinkedList<Pessoa> nomes = new LinkedList<>();
		nomes.add(new Pessoa("Joao", (byte) 32));
		nomes.add(new Pessoa("Adriano", (byte) 12));
		nomes.add(new Pessoa("Bruna", (byte) 22));
		nomes.add(new Pessoa("Silvana", (byte) 50));
		
		nomes.forEach(nome -> System.out.println(nome));
		
		System.out.println("\nFILTRAR NOME LETRA A\n");
		
		
		nomes.stream().filter(a -> a.getNome().startsWith("a")).collect(Collectors.toList());

		nomes.forEach(pessoa -> {

		System.out.println("Pessoa que iniciam com a letra a:" + pessoa.getNome());

		});
		
	}
	
}
