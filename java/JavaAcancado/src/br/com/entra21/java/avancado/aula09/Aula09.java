package br.com.entra21.java.avancado.aula09;

import java.util.ArrayList;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.aula09.exercicios.ExercicioCollections;
import br.com.entra21.java.avancado.aula09.exercicios.ExercicioDatasComputador;
import br.com.entra21.java.avancado.aula09.exercicios.ExercicioDatasHumano;
import br.com.entra21.java.avancado.aula09.exercicios.ExercicioEnum;
import br.com.entra21.java.avancado.aula09.exercicios.ExercicioException;
import br.com.entra21.java.avancado.aula09.exercicios.ExercicioLambda;
import br.com.entra21.java.avancado.aula09.exercicios.ExercicioWrapper;

public class Aula09 extends Aula {

	public Aula09(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {
		case 1:
			ExercicioWrapper.exercicioWrapper();
			break;
		case 2:
			ExercicioEnum.exercicioEnum();
			break;
		case 3:
			ExercicioCollections.exercicioArrayList();
			ExercicioCollections.exercicioLinkedList();
			ExercicioCollections.exercicioHashSet();
			ExercicioCollections.exercicioHashMap();
			break;
		case 4:
			ExercicioDatasComputador.exercicioDatasComputador();
			break;
		case 5:
			ExercicioDatasHumano.exercicioDatasHumano();
			break;
		case 6:
			System.out.println("Implementado nos exercicios.");
			break;
		case 7:
			//ExercicioGenerics1.executar();
			//ExercicioGenerics2.executar();
			break;
		case 8:
			ExercicioException.exercicioException();
			break;
		case 9:
			ExercicioLambda.exercicioLambda();
			break;

		}
		return opcao;
	}

}
