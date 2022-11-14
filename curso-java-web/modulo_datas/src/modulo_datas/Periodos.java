package modulo_datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Periodos {

	public static void main(String[] args) {

		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Mais 5 dias: "+dataBase.plusDays(5));
		
		System.out.println("Mais 5 semanas: "+dataBase.plusWeeks(5));

		System.out.println("Mais 5 meses: "+dataBase.plusMonths(5));
		
		System.out.println("Mais 5 anos: "+dataBase.plusYears(5));

		System.out.println("Menos 5 anos: "+dataBase.minusYears(5));

		System.out.println("Menos 5 meses: "+dataBase.minusMonths(5));
		
		System.out.println("Menos 5 semanas: "+dataBase.minusWeeks(5));
		
		System.out.println("Menos 5 dias: "+dataBase.minusDays(5));

		for(int meses =1 ; meses <=12 ; meses++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Data de vencimento boleto: "+dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ " do mes "+meses );
		}
		
		
//		LocalDate dataAntiga = LocalDate.of(2021, 10, 14);
//		LocalDate dataNova = LocalDate.of(2022, 11, 14);
		
//		LocalDate dataAntiga = LocalDate.parse("2021-10-14");
//		LocalDate dataNova = LocalDate.parse("2022-11-14");
//
//		System.out.println("Data antiga e maior que data nova: "+ dataAntiga.isAfter(dataNova));
//		
//		System.out.println("Data antiga e anterior que data nova: "+ dataAntiga.isBefore(dataNova));
//
//		System.out.println("Data sao iguais: "+ dataAntiga.isEqual(dataNova));
//
//		Period periodo = Period.between(dataAntiga, dataNova);
//		
//		System.out.println("Quantos dias "+ periodo.getDays());
//
//		System.out.println("Quantos meses "+ periodo.getMonths());
//		
//		System.out.println("Quantos anos "+ periodo.getYears());
//		
//		System.out.println("Quantos meses totais "+ periodo.toTotalMonths());
//		
//		System.out.println("Periodo e: "+ periodo.getYears() +" anos "+ periodo.getMonths()+" meses "+ periodo.getDays()+" dias.");

	}

}
