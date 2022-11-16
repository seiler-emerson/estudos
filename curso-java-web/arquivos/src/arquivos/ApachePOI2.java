package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePOI2 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream entrada = new FileInputStream(new File("/Users/emerson/Documents/GitHub/estudos/curso-java-web/arquivos/src/arquivos/arquivo_excel.xls"));
	
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // Preparar a entrada do arquivo excel para leitura
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);	//Pegar a primeira planilha do arquivo
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(linhaIterator.hasNext()) { //Fazer um while enquanto o arquivo tiver linhas a serem lidas 
			Row linha = linhaIterator.next(); //Dados da pessoa na linha
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while(celulas.hasNext()) { // Percorrer as celulas
				Cell cell = celulas.next(); //Dados da celula da linha
				
				//Fazer um switch e verificar qual coluna o dado pertence
				switch (cell.getColumnIndex()) {
				case 0:  //Caso seja a coluna 0 e o nome
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:  //Caso seja a coluna 1 e o email
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:  //Caso seja a coluna 1 e o idade
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
			} // Fim das celulas da linha
			pessoas.add(pessoa);
		}
		
		entrada.close(); // Terminou de ler o arquivo excel
		
		for (Pessoa pessoa : pessoas) { // Gravar no banco....mandar email...etc
			System.out.println(pessoa);
		}
	}
}
