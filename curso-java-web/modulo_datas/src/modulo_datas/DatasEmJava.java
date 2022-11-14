package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		
		
		/* =================== Calendar ======================== */

		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Data em milisegundos: "+ calendar.getTimeInMillis());
		System.out.println("Dia do mes "+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana "+ (calendar.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("Hora do dia "+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto da hora "+ calendar.get(Calendar.MINUTE));
		System.out.println("Segundos "+ calendar.get(Calendar.SECOND));
		System.out.println("Ano "+calendar.get(Calendar.YEAR));
		
		
		
		
		
		
		
		
		/* =================== Date ======================== */

		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: "+ date.getTime());
		System.out.println("Dia do mes "+ date.getDate());
		System.out.println("Dia da semana "+ date.getDay());
		System.out.println("Hora do dia "+ date.getHours());
		System.out.println("Minuto da hora "+ date.getMinutes());
		System.out.println("Segundos "+ date.getSeconds());
		System.out.println("Ano "+( date.getYear() + 1900 )); //Data atual menos 1900

		/* =================== Simple Date Format ======================== */
		
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
		
	}
}
