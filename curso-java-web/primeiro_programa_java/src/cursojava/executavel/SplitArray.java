package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String texto = "Joao,Curso Java,90,80,70,85";
		
		String[] valoresArray = texto.split(",");
		
		System.out.println("Nome : "+valoresArray[0]);
		System.out.println("Curso : "+valoresArray[1]);
		System.out.println("Nota 1 : "+valoresArray[2]);
		System.out.println("Nota 2 : "+valoresArray[3]);
		System.out.println("Nota 3 : "+valoresArray[4]);
		System.out.println("Nota 4 : "+valoresArray[5]);

		
		/* Convertendo array em lista */
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		/* Convertendo lista em array */

		String[] conversaoArray = list.toArray(new String[6]);
		
		System.out.println("Nome : "+conversaoArray[0]);
		System.out.println("Curso : "+conversaoArray[1]);
		System.out.println("Nota 1 : "+conversaoArray[2]);
		System.out.println("Nota 2 : "+conversaoArray[3]);
		System.out.println("Nota 3 : "+conversaoArray[4]);
		System.out.println("Nota 4 : "+conversaoArray[5]);
	}

}
