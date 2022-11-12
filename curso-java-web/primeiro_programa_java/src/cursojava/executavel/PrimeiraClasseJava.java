package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");

		PermitirAcesso permitirAcesso = new Secretario(login, senha);		
		
		if(permitirAcesso.autenticar()) {
			
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			for (int qtd = 1; qtd <= 3; qtd++) {
				// new Aluno() é uma INSTANCIA (criacao de objeto)
				// aluno1 é uma referencia para o objeto aluno

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
//				String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
//				String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
//				String rg = JOptionPane.showInputDialog("Qual o rg do aluno?");
//				String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
//				String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae do aluno?");
//				String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
//				String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula do aluno?");
//				String serie = JOptionPane.showInputDialog("Qual a serie do aluno?");
//				String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");

				Aluno aluno1 = new Aluno(); // Joao

				aluno1.setNome(nome);
//				aluno1.setIdade(Integer.valueOf(idade));
//				aluno1.setDataNascimento(dataNascimento);
//				aluno1.setRegistroGeral(rg);
//				aluno1.setNumeroCpf(cpf);
//				aluno1.setNomeMae(nomeMae);
//				aluno1.setNomePai(nomePai);
//				aluno1.setDataMatricula(dataMatricula);
//				aluno1.setSerieMatriculado(serie);
//				aluno1.setNomeEscola(nomeEscola);

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
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
				
			}

			System.out.println("================= Lista Aprovados =================");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println(aluno.getNome() + " com média de "+aluno.getMediaNota());
			}
			
			System.out.println("================= Lista Reprovados =================");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println(aluno.getNome() + " com média de "+aluno.getMediaNota());
			}
			
			System.out.println("================= Lista Recuperacao =================");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println(aluno.getNome() + " com média de "+aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso nao permitido!");
		}
	}
}
