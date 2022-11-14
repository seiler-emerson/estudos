package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Parcelas {

	public static void main(String[] args) throws ParseException {
		
		// Data inicial
		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("14/11/2021");
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(dateInicial);
		
		// A cada iteracao adiciona um mes
		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			System.out.println("Parcela de numero: "+parcela+ " vencimento em "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
		
	}
}
