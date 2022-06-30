package br.com.banco;

public class Main {

	public static void main(String[] args) {
		ContaBanco emerson = new ContaBanco();
		emerson.setTipo("cc");
		emerson.abrirConta();;
		emerson.setDono("Emerson Seiler");
		emerson.setNumeroConta((short) 9999);
		emerson.setSaldo(10000f);
		
		emerson.depositar(500f);
		
		emerson.pagarMensalidade();
		
		emerson.status();
		
		
		
	}

}
