package br.com.entra21.java.avancado.aula09.exercicios.generics;



public interface IGenerics<E> {

	public void adicionar(E item);
	
	public E capturar();
	
	public E comparar(E item);
}
