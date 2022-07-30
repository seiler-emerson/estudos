package br.com.entra21.java.avancado.aula09.exercicios;

public class ExercicioWrapper {
	
	@ExecutorExercicio(
			numeroExercicio = ExecutorExercicio.numeroExercicio.UM,
			quemAssume = "Emerson Seiler"
	)
	@ExercicioFeito
	@DescricaoExercicio("Exercicio sobre wrapper")
	public static void exercicioWrapper() {

		// Byte
		String byteReferencia = "8";
		byte variavelByte = Byte.parseByte(byteReferencia);
		System.out.println("Byte: " + variavelByte);

		// Short
		String shortReferencia = "32767";
		short variavelShort = Short.parseShort(shortReferencia);
		System.out.println("Short: " + variavelShort);

		// Int
		String intReferencia = "2147483647";
		int variavelInt = Integer.parseInt(intReferencia);
		System.out.println("Int: " + variavelInt);

		// Long
		String longReferencia = "922337203685477807";
		long variavelLong = Long.parseLong(longReferencia);
		System.out.println("Long: " + variavelLong);

		// Char
		char charReferencia = 'e';
		char variavelChar = Character.valueOf(charReferencia);
		System.out.println("Char: " + variavelChar);

		// Float
		String floatReferencia = "3.4028";
		float variavelFloat = Float.parseFloat(floatReferencia);
		System.out.println("Float: " + variavelFloat);

		// Double
		String doubleReferencia = "1.7976931";
		double variavelDouble = Double.parseDouble(doubleReferencia);
		System.out.println("Double: " + variavelDouble);

		// Boolean
		String booleanReferencia = "tRuE";
		boolean variavelBoolean = Boolean.parseBoolean(booleanReferencia);
		System.out.println("Boolean: " + variavelBoolean);
	}
}
