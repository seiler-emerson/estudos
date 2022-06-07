package prontuario.cadastros;

import java.time.LocalDate;

public class Medico extends Pessoa {
	private String especialidade;
	private String numeroConselho;
	
	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Medico(String nome, String cpf, String nomeMae, String nomePai, String endereco, String sexo, LocalDate nascimento) {
		super(nome, cpf, nomeMae, nomePai, endereco, sexo, nascimento);
		// TODO Auto-generated constructor stub
	}

	public Medico(String especialidade, String numeroConselho) {
		super();
		this.especialidade = especialidade;
		this.numeroConselho = numeroConselho;
	}
	
	public Medico(String nome, String cpf, String nomeMae, String nomePai, String endereco, String sexo, LocalDate nascimento, String especialidade, String numeroConselho) {
		super(nome, cpf, nomeMae, nomePai, endereco, sexo, nascimento);
		// TODO Auto-generated constructor stub
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getNumeroConselho() {
		return numeroConselho;
	}

	public void setNumeroConselho(String numeroConselho) {
		this.numeroConselho = numeroConselho;
	}
	
}
