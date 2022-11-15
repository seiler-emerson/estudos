package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alex");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(25);
		pessoa2.setNome("Marcos");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(40);
		pessoa3.setNome("Maria");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		
		File arquivo = new File("/Users/emerson/Documents/GitHub/estudos/curso-java-web/arquivos/src/arquivos/arquivo2.txt");
	
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		} 
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa pessoa : pessoas) {
			escrever_no_arquivo.write(pessoa.getNome() + ";" + pessoa.getEmail() + ";" + pessoa.getIdade() + "\n");
		}

		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
