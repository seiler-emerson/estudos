package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {
			// new Aluno() é uma INSTANCIA (criacao de objeto)
			// aluno1 é uma referencia para o objeto aluno

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
//			String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
//			String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
//			String rg = JOptionPane.showInputDialog("Qual o rg do aluno?");
//			String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
//			String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae do aluno?");
//			String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
//			String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula do aluno?");
//			String serie = JOptionPane.showInputDialog("Qual a serie do aluno?");
//			String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");

			Aluno aluno1 = new Aluno(); // Joao

			aluno1.setNome(nome);
//			aluno1.setIdade(Integer.valueOf(idade));
//			aluno1.setDataNascimento(dataNascimento);
//			aluno1.setRegistroGeral(rg);
//			aluno1.setNumeroCpf(cpf);
//			aluno1.setNomeMae(nomeMae);
//			aluno1.setNomePai(nomePai);
//			aluno1.setDataMatricula(dataMatricula);
//			aluno1.setSerieMatriculado(serie);
//			aluno1.setNomeEscola(nomeEscola);

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplaina(nomeDisciplina);
				disciplina.setNota(Double.parseDouble(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? 1,2,3,4?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}
			alunos.add(aluno1);
		}

		for(int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			System.out.println("Aluno = "+aluno.getNome());
			System.out.println("Media do aluno = "+aluno.getMediaNota());
			System.out.println("Resultado = "+aluno.getAlunoAprovado2());
			System.out.println("======================================================");
			
		}

	

	}

}
