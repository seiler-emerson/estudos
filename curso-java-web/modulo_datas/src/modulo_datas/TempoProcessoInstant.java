package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class TempoProcessoInstant {

	public static void main(String[] args) throws InterruptedException {
		
		Instant incio = Instant.now();
		
		Thread.sleep(2000); //Pode ser um processo qualquer que nao conhecemos
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(incio, ifinal);
		
		System.out.println("Duracao em nano segundos: "+ duracao.toNanos());
		
		System.out.println("Duracao em minutos: "+ duracao.toMinutes());

		System.out.println("Duracao em horas: "+ duracao.toHours());
		
		System.out.println("Duracao em milisegundos: "+ duracao.toMillis());

		System.out.println("Duracao em dias: "+ duracao.toDays());


	}
}
