package br.com.entra21.java.avancado.aula09.exercicios;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExercicioDatasHumano {
	
	@ExecutorExercicio(
			numeroExercicio = ExecutorExercicio.numeroExercicio.CINCO,
			quemAssume = "Emerson Seiler"
	)
	@ExercicioFeito
	@DescricaoExercicio("Exercicio sobre datas humanas")
	public static void exercicioDatasHumano() {
		
		LocalDate inicioCurso = LocalDate.of(2022, 04, 18);
		LocalDate fimCurso = LocalDate.of(2022, 10, 21);
		Period periodoCurso = Period.between(inicioCurso, fimCurso);
		
		System.out.println("O curso tem inicio "+inicioCurso.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("O curso tem fim "+fimCurso.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("O curso tem duracao de "+periodoCurso.getMonths()+" meses.");
		
		LocalTime horaInicioAula = LocalTime.of(18, 15);
		LocalTime horaFimAula = LocalTime.of(22, 15);

		Duration durationAula = Duration.between(horaInicioAula, horaFimAula);
		System.out.println("As aulas tem duracao de "+durationAula.toHours()+" horas.");
		
	}
}
