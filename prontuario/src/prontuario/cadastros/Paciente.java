package prontuario.cadastros;

import java.time.LocalDate;
import java.util.ArrayList;

import prontuario.prontuario.eletronico.Atendimento;

public class Paciente extends Pessoa {
	public ArrayList<Atendimento> atendimentos;

	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(String nome, String cpf, String nomeMae, String nomePai, String endereco, String sexo,
			LocalDate nascimento) {
		super(nome, cpf, nomeMae, nomePai, endereco, sexo, nascimento);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Atendimento> getAtendimento() {
		return atendimentos;
	}

	public void setAtendimento(ArrayList<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
	public void cadastroRealizado(String nome) { //polimorfismo
		System.out.println("O cadastro do paciente "+nome+" foi realizado com sucesso!");
	}
	
	public void cadastroEditado(String nome) {
		System.out.println("O cadastro do paciente "+nome+" foi editado com sucesso!");
	}
	
	public void cadastroExcluido(String nome) {
		System.out.println("O cadastro do paciente "+nome+" foi excluido com sucesso!");
	}
	
	
	
}
