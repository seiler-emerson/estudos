package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiDatas {

	public static void main(String[] args) throws ParseException {
		
		// Nova Api de data a partir do java 8
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: "+dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: "+horaAtual);
		System.out.println("Hora atual: "+horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
		System.out.println("Hora atual: "+horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora atual: "+dataAtualHoraAtual);

		System.out.println("Data e Hora atual: "+dataAtualHoraAtual.format(DateTimeFormatter.ISO_DATE));
		System.out.println("Data e Hora atual: "+dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Data e Hora atual: "+dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

		
	}

}
