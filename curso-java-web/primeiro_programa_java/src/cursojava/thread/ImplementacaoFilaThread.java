package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando.");


		while (true) {

			Iterator iteracao = pilha_fila.iterator();
			synchronized (pilha_fila) { // Bloquear o acesso a esta lista por outros processos
				while (iteracao.hasNext()) { /* Enquanto conter dados na lista vai processar */
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					// PROCESSAR 10MIL NOTAS FISCAIS
					// GERAR UMA LISTA ENORME DE PDFs
					// AQUI QUE E CHAMADO O PROCESSO EM JAVA QUE E GRANDE/DEMORADO
					System.out.println("================================");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					iteracao.remove();

					try {
						Thread.sleep(1000); // Dar um tempo para descarga de memoria
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(1000); // Apos processar toda a lista, dar um tempo para limpeza de memoria
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
