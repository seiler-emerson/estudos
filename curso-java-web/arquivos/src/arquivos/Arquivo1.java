package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo1 {

	public static void main(String[] args) throws IOException {
		
		//Instancia o arquivo
		File arquivo = new File("/Users/emerson/Documents/GitHub/estudos/curso-java-web/arquivos/src/arquivos/arquivo1.txt");
		
		
		if(!arquivo.exists()) {
			// Cria o arquivo
			arquivo.createNewFile();
		}
		
		// Instacia um objeto para escrever no arquivo
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for(int i = 1;i<=10;i++) {
			
			// escreve no arquivo
			escrever_no_arquivo.write("Texto da minha linha " + i + " \n");
		}
		
		// Faz a descarga do buffer de memoria
		escrever_no_arquivo.flush();
		// Fecha o arquivo/finaliza
		escrever_no_arquivo.close();
		
	}

}
