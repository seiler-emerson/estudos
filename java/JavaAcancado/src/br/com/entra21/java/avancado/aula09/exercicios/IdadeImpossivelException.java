package br.com.entra21.java.avancado.aula09.exercicios;

public class IdadeImpossivelException extends Exception{

	public IdadeImpossivelException() {
		super("Nao e possivel ter uma idade menor que zero");
	}
	
	public IdadeImpossivelException(String mensagem) {
		super(mensagem);
	}

}
