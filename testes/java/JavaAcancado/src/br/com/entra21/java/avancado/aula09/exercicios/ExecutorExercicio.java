package br.com.entra21.java.avancado.aula09.exercicios;

public @interface ExecutorExercicio {
	public enum numeroExercicio {
		UM, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE
	};

	numeroExercicio numeroExercicio();

	String quemAssume();
}
