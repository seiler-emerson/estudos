package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
	
		/* =================== Faixa de tempo com ChronoUnit ======================== */
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-10-14"), LocalDate.now());
		
		System.out.println("Possui "+ dias + " dias entre a faixa de data.");
		
		long meses = ChronoUnit.MONTHS.between(LocalDate.parse("2021-10-14"), LocalDate.now());
		
		System.out.println("Possui "+ meses + " meses entre a faixa de data.");
		
		long semanas = ChronoUnit.WEEKS.between(LocalDate.parse("2021-10-14"), LocalDate.now());
		
		System.out.println("Possui "+ semanas + " semanas entre a faixa de data.");
		
		long anos = ChronoUnit.YEARS.between(LocalDate.parse("2021-10-14"), LocalDate.now());
		
		System.out.println("Possui "+ anos + " anos entre a faixa de data.");
		
		/* =================== Calculo de dia, ano e mês com Calendar ======================== */
/*	
		Calendar calendar = Calendar.getInstance();
		
		// Simular que a data vem do banco de dados
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021")); //Definindo uma data
		
		System.out.println("");
		System.out.println("Data atual: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		//Adicionando 5 dias em relacao ao dia do mes | a data de hoje mais X dias
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		System.out.println("");
		System.out.println("Data atual: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		//Removendo 5 dias em relacao ao dia do mes
		calendar.add(Calendar.DAY_OF_MONTH, -5);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		System.out.println("");
		System.out.println("Data atual: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		//Adicionando 10 dias em relacao ao dia da semana
		calendar.add(Calendar.DAY_OF_WEEK, 10);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		System.out.println("");
		System.out.println("Data atual: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		//Adicionando 1 mes
		calendar.add(Calendar.MONTH, 1);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		System.out.println("");
		System.out.println("Data atual: "+new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		//Adicionando 1 ano
		calendar.add(Calendar.YEAR, 1);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
*/		
		/* =================== After e Before ======================== */
/*
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("11/04/2021");
		
		// After: se data 1 e maior que data 2
		// Before: se data 1 e menor que data 2
		
		// Se a data um e maior que a data dois
		if(dataVencimentoBoleto.after(dataAtualHoje) ) { //Posterior ou maior
			System.out.println("Boleto nao vencido");
		} else {
			System.out.println("Boleto vencido - URGENTE");
		}
		
		// Se a data um e anterior que a data dois 
		if(dataVencimentoBoleto.before(dataAtualHoje) ) { //Inferior ou menor
			System.out.println("Boleto vencido - URGENTE");
		} else {
			System.out.println("Boleto nao vencido");
		}
		
*/
		
		/* =================== Calendar ======================== */
/*
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Data em milisegundos: "+ calendar.getTimeInMillis());
		System.out.println("Dia do mes "+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana "+ (calendar.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("Hora do dia "+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto da hora "+ calendar.get(Calendar.MINUTE));
		System.out.println("Segundos "+ calendar.get(Calendar.SECOND));
		System.out.println("Ano "+calendar.get(Calendar.YEAR));
		
		SimpleDateFormat simpleDateFormatCalendar = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrao e string: "+ simpleDateFormatCalendar.format(calendar.getTime()));
*/
		/* =================== Date ======================== */

/*		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: "+ date.getTime());
		System.out.println("Dia do mes "+ date.getDate());
		System.out.println("Dia da semana "+ date.getDay());
		System.out.println("Hora do dia "+ date.getHours());
		System.out.println("Minuto da hora "+ date.getMinutes());
		System.out.println("Segundos "+ date.getSeconds());
		System.out.println("Ano "+( date.getYear() + 1900 )); //Data atual menos 1900
*/
		/* =================== Simple Date Format ======================== */
/*		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data atual em formato padrao e string: "+ simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data em formato para banco de dados: "+ simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrao e string com minuto e segundo: "+ simpleDateFormat.format(date));
	
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.SS");
		System.out.println("Data atual em formato padrao e string com minuto e segundo(centesimal): "+ simpleDateFormat.format(date));
	
		simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm.ss");
		System.out.println("Data em formato para banco de dados: "+ simpleDateFormat.format(date));
	
		System.out.println("Converter string para date: "+ simpleDateFormat.parse("1987/10/08 20:10.2"));
*/		
	}
}
