package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {
		
		int notas[][]= new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 60;
		notas[1][1] = 50;
		notas[1][2] = 90;
		
		
		for(int posLinha = 0; posLinha < notas.length; posLinha++) {
			System.out.println("===============================================================");
			for(int posCol =0; posCol < notas[posLinha].length; posCol++) {
				System.out.println("Valor da matriz na linha "+posLinha+" e coluna "+posCol+" = "+ notas[posLinha][posCol]);

			}
			
		}
		System.out.println("===============================================================");
	}

}
