package cursojava.execao;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super("Erro no processamento das notas do aluno"+ erro);
	}
	
	
}
