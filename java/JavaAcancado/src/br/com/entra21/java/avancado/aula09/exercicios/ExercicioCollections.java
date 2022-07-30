package br.com.entra21.java.avancado.aula09.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

@ExecutorExercicio(
		numeroExercicio = ExecutorExercicio.numeroExercicio.TRES,
		quemAssume = "Emerson Seiler"
)
public class ExercicioCollections {

	@DescricaoExercicio("Exercicio ArrayList")
	public static void exercicioArrayList() {

		System.out.println("\nEXERCICIO ARRAYLIST\n");
		
		ArrayList<String> nomes = new ArrayList<>();

		// ADCIONAR
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Emerson");

		// LER
		System.out.println(nomes.get(0));

		// DELETAR
		nomes.remove(nomes.get(0));

		// Percorrendo
		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

	@DescricaoExercicio("Exercicio LinkedList")
	public static void exercicioLinkedList() {

		System.out.println("\nEXERCICIO LINKEDLIST\n");
		
		LinkedList<String> interesses = new LinkedList<>();

		// ADCIONAR
		interesses.add("Capgemini");
		interesses.add("Philips");
		interesses.add("AmbevTech");

		// LER
		System.out.println(interesses.get(0));

		// DELETAR
		interesses.remove(interesses.get(1));

		// Percorrendo
		for (String interesse : interesses) {
			System.out.println(interesse);
		}
	}

	@DescricaoExercicio("Exercicio HashMap")
	public static void exercicioHashSet() {
		
		System.out.println("\nEXERCICIO HASHSET\n");
		HashSet<String> captaisBrasileiras = new HashSet<>();
		
		captaisBrasileiras.add("Rio Branco");
		captaisBrasileiras.add("Maceio");
		captaisBrasileiras.add("Macapa");
		captaisBrasileiras.add("Manaus");
		captaisBrasileiras.add("Salvador");
		captaisBrasileiras.add("Fortaleza");
		captaisBrasileiras.add("Brasilia");
		captaisBrasileiras.add("Vitoria");
		captaisBrasileiras.add("Goiania");
		captaisBrasileiras.add("Sao Luis");
		captaisBrasileiras.add("Cuiaba");
		captaisBrasileiras.add("Campo Grande");
		captaisBrasileiras.add("Belo Horizonte");
		captaisBrasileiras.add("Belem");
		captaisBrasileiras.add("Joao Pessoa");
		captaisBrasileiras.add("Curitiba");
		captaisBrasileiras.add("Recife");
		captaisBrasileiras.add("Teresina");
		captaisBrasileiras.add("Rio de Janeiro");
		captaisBrasileiras.add("Natal");
		captaisBrasileiras.add("Porto Alegre");
		captaisBrasileiras.add("Porto Velho");
		captaisBrasileiras.add("Boa Vista");
		captaisBrasileiras.add("Florianopolis");
		captaisBrasileiras.add("Sao Paulo");
		captaisBrasileiras.add("Aracaju");
		captaisBrasileiras.add("Palmas");
		
		// Percorrendo
		for (String captais : captaisBrasileiras) {
			System.out.println(captais);
		}
		
		//Removendo
		System.out.println("Removendo Sao Paulo....");
		captaisBrasileiras.remove("Sao Paulo");
		System.out.println("Sao Paulo esta na lista de estados? " + (captaisBrasileiras.contains("Sao Paulo") ? "Sim" : "Não"));
		
	}

	@DescricaoExercicio("Exercicio HashMap")
	public static void exercicioHashMap() {
		
		System.out.println("\nEXERCICIO HASHMAP\n");
		HashMap<String, String> carros = new HashMap<>();
		
		carros.put("Celta", "Chevrolet");
		carros.put("Sandero", "Renault");
		carros.put("Gol", "Volkswagen");
		carros.put("Palio", "Fiat");
		carros.put("308", "Peugeot");
		
		for (String carro : carros.values()) {
			System.out.println("Marca carro : " + carro);
		}
		
		System.out.println("Removendo Chevrolet..");
		carros.remove("Celta");
		System.out.println("Chevrolet esta na lista de carros? " + (carros.containsKey("Celta") ? "Sim" : "Não"));
		
		System.out.println("Mudando Pegeout para Toyota");
		carros.put("308", "Toyota");
		
		for (String carro : carros.values()) {
			System.out.println("Marca carro : " + carro);
		}
		
	}
}
