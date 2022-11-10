package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		//Thread processando em paralelo do envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		 
		//Thread processando em paralelo do envio de nota fiscal
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		//Código do sistema do usuário continuo o fluxo de trabalho
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		//Fluxo de venda, cadastro de venda, uma emissão de nota fiscal...
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			//Código da rotina
			
			//Código da rotina que quero executar em paralelo
			for(int count =0; count < 10; count++) {
				
				System.out.println("Executando rotiana, enviando nota fiscal");
				
				//Executar ação com tempo de parada, intervalos determinados
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //Da um tempo
			}
		};
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			//Código da rotina
			
			//Código da rotina que quero executar em paralelo
			for(int count =0; count < 10; count++) {
				
				System.out.println("Executando rotiana, enviando e-mail");
				
				//Executar ação com tempo de parada, intervalos determinados
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //Da um tempo
				
			}
			//Fim do código paralelo
		}
	};
	
}
