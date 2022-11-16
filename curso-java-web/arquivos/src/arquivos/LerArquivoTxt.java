package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Instanciar um arquivo de entrada de dados
		FileInputStream entradaArquivo = new FileInputStream(new File("/Users/emerson/Documents/GitHub/estudos/curso-java-web/arquivos/src/arquivos/arquivo2.txt"));
	
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		// Enquanto o arquivo tiver dados
		while (lerArquivo.hasNext()){
			
			String linha = lerArquivo.nextLine();
			
			//Validar se linha esta vazia ou null
			if(linha != null && !linha.isEmpty()) {
				// Imprime no console o conteudo da linha
				//System.out.println(linha);				
				
				//Quebrando a linha nos ";" e colocando os dados em um array
				String[] dados = linha.split("\\;");
				
				//Instanciando uma pessoa e setando os dados atraves dos dados mapeados e separados no array
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				//Adicionar a pessoa na lista de pessoas
				pessoas.add(pessoa);
			}
		}
		
		for (Pessoa pessoa : pessoas) { // Poderia gravar no banco, enviar email, gerar boleto, etc....
			System.out.println(pessoa);
			
		}
		
	}
}
