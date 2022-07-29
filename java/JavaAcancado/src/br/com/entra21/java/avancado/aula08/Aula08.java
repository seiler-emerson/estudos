package br.com.entra21.java.avancado.aula08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;

public class Aula08 extends Aula {

	public Aula08(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {
		case 1:
			aprenderListar();
			break;
		case 2:
			aprenderFiltrar();
			break;

		case 3:
			aprenderEstatisticas();
			break;
		case 4:
			aprenderOrdenar();
			break;

		}
		return opcao;
	}

	private void aprenderListar() {

		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 5, 10, 8, 9, 15, 8, 3, 4, 2));
		ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Rafael", "Macedo", "Fulano", "Beltrano"));

		System.out.println("Listando de forma muito resumida ");

		numeros.forEach(System.out::println);

		System.out.println("Listando de forma normal ");

		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		System.out.println("Listando nomes de forma resumida ");
		nomes.forEach(System.out::println);

		System.out.println("Listando nomes de forma normal ");

		for (String nome : nomes) {
			System.out.println(nome);

		}
		System.out.println("Listando utilizando Arrow -> , quando executa apenas uma instrucao nao precisa de escopo");
		nomes.forEach(nome -> System.out.println(nome));

		System.out.println(
				"Listando utilizando Arrow -> , quando executa mais de uma instrucao é necessario declarar o escopo \n");
		nomes.forEach(nome -> {
			System.out.println(nome);
			System.out.println("[ " + nome + " ]");
		});
	}

	private void aprenderFiltrar() {
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Daniel", (byte) 15));
		pessoas.add(new Pessoa("Junin", (byte) 10));
		pessoas.add(new Pessoa("Joãozinho", (byte) 18));
		pessoas.add(new Pessoa("Pedrinho", (byte) 25));
		pessoas.add(new Pessoa("Mariazinha", (byte) 27));

		pessoas.forEach(pessoa -> {
			System.out.println("Nome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade());

		});

		System.out.println("--------Percorrendo a lista e filtrando os menores--------");

		List<Pessoa> pessoasNovas = pessoas.stream() // gera um stream para a minha lista, uma cópia que não afeta a
				// lista original
				.filter(pessoa -> pessoa.getIdade() < 18) // o filter vai filtrar com base no meu critério, criando uma
				// variável temporária que é verificada a cada item
				.collect(Collectors.toList()); // os itens resultantes serão convertidos em uma lista

		pessoasNovas.forEach(pessoa -> {

			System.out.println("Essa pessoa é de menor: ");
			System.out.println("Nome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade());
		});

		System.out.println("--------Percorrendo a lista e filtrando os menores(sem lambda)--------");

		ArrayList<Pessoa> pessoasMenores = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 18) {
				pessoasMenores.add(pessoa);

			}
		}
		for (Pessoa pessoa : pessoasMenores) {
			System.out.println("Essa pessoa é de menor: ");
			System.out.println("Nome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade());
		}
		System.out.println("--------Filtrando nomes que terminam com a letra O ou tem mais de 18 anos----------");
		pessoas.stream().filter(pessoa -> pessoa.getNome().endsWith("o") || pessoa.getIdade() >= 18).forEach(pessoa -> {
			System.out.println("Essa pessoa termina com o");
			System.out.println("Nome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade());
		});
	}

	private void aprenderEstatisticas() {
		ArrayList<Double> notas = new ArrayList<>(Arrays.asList(10d, 8d, 7.5d));
		notas.forEach(System.out::println);
		DoubleSummaryStatistics estatisticas = notas.stream().mapToDouble((numero) -> numero).summaryStatistics();

		System.out.println("A média " + estatisticas.getAverage());
		System.out.println("A menor nota " + estatisticas.getMin());
		System.out.println("A Maior nota " + estatisticas.getMax());
		System.out.println("A Soma das notas é " + estatisticas.getSum());
		System.out.println("A quantidade de notas " + estatisticas.getCount());
	}

	private void aprenderOrdenar() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Jão");
		nomes.add("Maria");
		nomes.add("Jorge");
		nomes.add("Pedrinho");
		nomes.add("Ananias");
		System.out.println("Listando os nomes na ordem de criação");

		nomes.forEach(System.out::println);

		System.out.println("Listando os nomes em ordem alfabetica");

		nomes.sort(String::compareTo);
		nomes.forEach(System.out::println);

		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Daniel", (byte) 15));
		pessoas.add(new Pessoa("Junin", (byte) 10));
		pessoas.add(new Pessoa("Joãozinho", (byte) 18));
		pessoas.add(new Pessoa("Pedrinho", (byte) 25));
		pessoas.add(new Pessoa("Mariazinha", (byte) 27));

		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa pessoaA, Pessoa pessoaB) {
				return pessoaB.getNome().compareTo(pessoaA.getNome());
			}
		});
		System.out.println("=-=-=-Imprimindo pessoas em ordem alfabetica=-=-=-");
		pessoas.forEach(pessoa -> {
			System.out.println(pessoa.getNome());
		});
	}

}
