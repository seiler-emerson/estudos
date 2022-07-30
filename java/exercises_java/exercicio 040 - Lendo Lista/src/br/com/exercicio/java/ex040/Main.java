package br.com.exercicio.java.ex040;

public class Main {
	public static void main(String[] args) {
		//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
		//Fazer um algoritmo que calcule e escreva:
		//	a. a maior e a menor altura do grupo;
		//	b. média de altura dos homens;
		//	c. o número de mulheres.
		
				
		float alturas[] = {1.5f,2f,2.9f,0.8f,2.2f,1.6f,1.72f,1.7f,1.34f,1.1f};
		String sexo[] = {"m","f","f","f","m","f","m","f","m","f"};
		
		// ================================= //
		// QUESTAO A - MAIOR E MENOR ALTURAS //
		// ================================= //
		
		int contadorAlturas = 0;
		float menorAltura=0;
		float maiorAltura=0;
		
		while(contadorAlturas<alturas.length) {

			if(contadorAlturas==0) {
				menorAltura = alturas[contadorAlturas];
			} else if (menorAltura > alturas[contadorAlturas]) {
				menorAltura = alturas[contadorAlturas];
			} else {
				//nada a fazer
			}
			
			if(contadorAlturas==0) {
				maiorAltura=alturas[contadorAlturas];
			} else if (maiorAltura < alturas[contadorAlturas]){
				maiorAltura = alturas[contadorAlturas];
			} else {
				//nada a fazer
			}
			contadorAlturas++;
		}
		System.out.println("QUESTAO A - A menor altura encontrada no grupo foi: "+menorAltura+" metros.");
		System.out.println("QUESTAO A - A maior altura encontrada no grupo foi: "+maiorAltura+" metros.");
		
		
		// =================================== //
		// QUESTAO B - MEDIA ALTURA DOS HOMENS //
		// =================================== //
		
		int contadorSexo=0, qtdHomens=0;
		float somaAlturasHomens=0, mediaAlturasHomens;
		
		while(contadorSexo < sexo.length) {
			if(sexo[contadorSexo].equals("m")) {
				somaAlturasHomens = somaAlturasHomens+ alturas[contadorSexo];
				qtdHomens = qtdHomens+1;
			} else {
				// sexo feminino
			}
			contadorSexo++;
		}
		mediaAlturasHomens = somaAlturasHomens / qtdHomens;
		System.out.println("QUESTAO B - A media de altura dos homens é de "+mediaAlturasHomens+" metros.");
		
		
		// ============================== //
		// QUESTAO C - NUMERO DE MULHERES //
		// ============================== //
		
		int contadorMulheres=0, qtdMulheres=0;
		
		while(contadorMulheres < sexo.length) {
			if(sexo[contadorMulheres].equals("f")) {
				qtdMulheres+=1;
			} else {
				// sexo masculinho
			}
			
			contadorMulheres++;
		}
		System.out.println("QUESTAO C - Existem "+qtdMulheres+" mulheres na lista.");
		
	}
	

	
}

