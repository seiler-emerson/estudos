package prontuario.cadastros;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private String endereco;
	private String sexo;
	private LocalDate nascimento;
	
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, String cpf, String nomeMae, String nomePai, String endereco, String sexo,
			LocalDate nascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.endereco = endereco;
		this.sexo = sexo;
		this.nascimento = nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
