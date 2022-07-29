package br.com.entra21.java.avancado.aula09.exercicios;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class ExercicioDatasComputador {

	static Scanner input = new Scanner(System.in);
	
	@ExecutorExercicio(
			numeroExercicio = ExecutorExercicio.numeroExercicio.QUATRO,
			quemAssume = "Emerson Seiler"
	)
	@ExercicioFeito
	@DescricaoExercicio("Exercicio sobre Datas Computador")
	public static void exercicioDatasComputador() {
		System.out.println("DATAS COMPUTADOR");
		Instant start = Instant.now();
		System.out.println("Digite seu nome completo o mais rapido que puder!");
		String nomeCompleto= input.nextLine();
		
		Instant end = Instant.now();
		Duration durationWrite = Duration.between(start, end);
		System.out.println("Tempo usado para escrever "+nomeCompleto+":");
		System.out.println("Milisegundos: " + durationWrite.toMillis());
		System.out.println("Segundos: " + durationWrite.toSeconds());
		System.out.println("Minutos: " + durationWrite.toMinutes());
		System.out.println("Horas: " + durationWrite.toHours());
	}
}
