package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo do envio do email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		// =============================== DIVISAO DAS THREADS
		
		// Thread processando em paralelo do envio de nota fiscal
		Thread threadNFC = new Thread(thread2);
		threadNFC.start();
		
		
		// Código do sistema continua o fluxo de trabalho
		System.out.println("Fim do código de teste");
		// Fluxo do sistema, cadastro de venda ou emissao de nota fiscald
		JOptionPane.showMessageDialog(null, "Sistema continua em execucao paralela");
		
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			// Código da rotinna para executar em paralelo
			for(int pos = 0; pos<10; pos++) {
				
				// Executar esse envio com um tempo de parada, ou com tempo determinado.
				System.out.println("Rotina de envio de email.");
				
				try {
					
					Thread.sleep(1000); //para 1 segundo entre execucoes
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				} 
			}			
		}
	};
	
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			// Código da rotinna para executar em paralelo
			for(int pos = 0; pos<10; pos++) {
				
				// Executar esse envio com um tempo de parada, ou com tempo determinado.
				System.out.println("Rotina de envio de nota fiscal.");
				
				try {
					
					Thread.sleep(2000); //para 1 segundo entre execucoes
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				} 
			}			
		}
		
	};
}
