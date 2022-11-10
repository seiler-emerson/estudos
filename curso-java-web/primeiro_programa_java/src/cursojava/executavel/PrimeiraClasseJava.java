package cursojava.executavel;


import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	static int maiorIdadeGlobal = 30;
	
	public static void main(String[] args) {
		
		// new Aluno() é uma INSTANCIA  (criacao de objeto)
		// aluno1 é uma referencia para o objeto aluno
			
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String rg = JOptionPane.showInputDialog("Qual o rg do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula do aluno?");
		String serie = JOptionPane.showInputDialog("Qual a serie do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota1 do aluno?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota2 do aluno?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota3 do aluno?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota4 do aluno?");

		Aluno aluno1 = new Aluno(); // Joao
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		
		System.out.println("Nome do aluno 1: "+aluno1.getNome());
		System.out.println("Idade do aluno 1: "+aluno1.getIdade());
		System.out.println("Nascimento do aluno 1: "+aluno1.getDataNascimento());
		System.out.println("Media do aluno: "+aluno1.getMediaNota());
		System.out.println("Resultado: "+(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		
		//Verificar endereco na memoria
		System.out.println(aluno1.toString());
		System.out.println("Media do aluno :"+aluno1.getMediaNota());
		System.out.println("Resultado :"+aluno1.getAlunoAprovado2());

	}
	
}
