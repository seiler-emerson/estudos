package br.com.entra21.java.avancado.aula09.exercicios.generics;

import java.util.ArrayList;

public class ExercicioGenerics2 implements IGenerics<String> {

	ArrayList<String> palavras = new ArrayList<>();
	
	
	public void executar() {
		adicionar("celular");
		System.out.println("Palavra celular adicionada");
		adicionar("cartao");
		System.out.println("Palavra cartao adicionado");
		adicionar("carro");
		System.out.println("Palavra carro adicionado");
		adicionar(capturar());
		System.out.println("Palavra carreta adicionado via captura");
		comparar(palavras.get(0));
		System.out.println("Primeiro numero comparado!");
	}
	
	@Override
	public void adicionar(String item) {
		palavras.add(item);
	}

	@Override
	public String capturar() {
		String captura = "carreta";
		
		return captura;
	}

	@Override
	public String comparar(String item) {
		String retorno;
		if(item.contains("carro")) {
			retorno = "positivo";
		} else {
			retorno = "negativo";
		}
		
		return retorno;
	}


}