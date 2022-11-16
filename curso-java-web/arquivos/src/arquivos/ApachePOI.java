package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePOI {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/emerson/Documents/GitHub/estudos/curso-java-web/arquivos/src/arquivos/arquivo_excel.xls");

		if(!file.exists()) {
			file.createNewFile();
		}

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

		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("pessoa4@gmail.com");
		pessoa4.setIdade(10);
		pessoa4.setNome("Joana");
		
		//Pode vir do banco de dados ou outra fonte de dados
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // Usado para escrever a planilha
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de Pessoas"); // Criar a planilha

		int numeroLinha = 0;
		for (Pessoa pessoa : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++); // Criando a linha na planilha
			int celula = 0;

			Cell celNome = linha.createCell(celula++);
			celNome.setCellValue(pessoa.getNome());

			Cell celEmail = linha.createCell(celula++);
			celEmail.setCellValue(pessoa.getEmail());

			Cell celIdade = linha.createCell(celula++);
			celIdade.setCellValue(pessoa.getIdade());
		} // Terminou de montar a planilha

		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();

		System.out.println("Planilha criada com sucesso!");
	}
}
