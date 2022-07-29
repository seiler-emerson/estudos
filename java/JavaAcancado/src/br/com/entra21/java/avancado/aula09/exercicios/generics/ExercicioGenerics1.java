package br.com.entra21.java.avancado.aula09.exercicios.generics;

import java.util.ArrayList;

public class ExercicioGenerics1 implements IGenerics<Integer> {

	ArrayList<Integer> numeros = new ArrayList<>();
	
	
	public void executar() {
		adicionar(10);
		System.out.println("Numero 10 adicionado");
		adicionar(20);
		System.out.println("Numero 20 adicionado");
		adicionar(3);
		System.out.println("Numero 30 adicionado");
		adicionar(capturar());
		System.out.println("Numero 10 adicionado via captura");
		comparar(numeros.get(0));
		System.out.println("Primeiro numero comparado!");
	}
	
	@Override
	public void adicionar(Integer item) {
		numeros.add(item);
	}

	@Override
	public Integer capturar() {
		int captura = 10;
		
		return captura;
	}

	@Override
	public Integer comparar(Integer item) {
		int retorno;
		if(item <=5) {
			retorno = 5;
		} else {
			retorno = 10;
		}
		
		return retorno;
	}


}