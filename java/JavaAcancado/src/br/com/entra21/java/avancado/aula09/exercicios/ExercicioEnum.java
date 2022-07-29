package br.com.entra21.java.avancado.aula09.exercicios;

public class ExercicioEnum {
	public enum mesesAno {
		JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
	}

	static public enum mesesAnoDescricao {
		JANEIRO("Primeiro mes"), FEVEREIRO("Segundo mes"), MARCO("Terceiro mes"), ABRIL("Quarto mes"),
		MAIO("Quinto mes"), JUNHO("Sexto mes"), JULHO("Setimo mes"), AGOSTO("Oitavo mes"), SETEMBRO("Nono mes"),
		OUTUBRO("Decimo mes"), NOVEMBRO("Decimo primeiro mes"), DEZEMBRO("Decimo segundo mes");

		private final String valor;

		mesesAnoDescricao(String valor) {
			this.valor = valor;
		}

		public String getValor() {
			return this.valor;
		}
	}

	@ExecutorExercicio(
			numeroExercicio = ExecutorExercicio.numeroExercicio.DOIS,
			quemAssume = "Emerson Seiler"
	)
	@ExercicioFeito
	@DescricaoExercicio("Exercicio sobre Enum")
	public static void exercicioEnum() {

		System.out.println("Enum escolhido: " + mesesAno.ABRIL);

		for (byte count = 0; count < mesesAnoDescricao.values().length; count++) {
			System.out.println("O mes " + mesesAnoDescricao.values()[count] + " e o "
					+ mesesAnoDescricao.values()[count].getValor());
		}
	}
}
