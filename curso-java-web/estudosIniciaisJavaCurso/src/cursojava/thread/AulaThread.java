package cursojava.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		for(int count =0; count < 10; count++) {
			
			System.out.println("Executando rotiana, enviando e-mail");
			
			//Executar ação com tempo de parada, intervalos determinados
			Thread.sleep(10000);
			
		}

	}

}
