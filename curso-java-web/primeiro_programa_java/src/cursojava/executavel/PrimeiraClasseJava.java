package cursojava.executavel;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {

		try {
			
//			File file = new File("arquivo.txt");
//			Scanner scanner = new Scanner(file);

			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe o senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

//				List<Aluno> alunos = null;

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {
					// new Aluno() é uma INSTANCIA (criacao de objeto)
					// aluno1 é uma referencia para o objeto aluno

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
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
				aluno1.setIdade(Integer.valueOf(idade));
//				aluno1.setDataNascimento(dataNascimento);
//				aluno1.setRegistroGeral(rg);
//				aluno1.setNumeroCpf(cpf);
//				aluno1.setNomeMae(nomeMae);
//				aluno1.setNomePai(nomePai);
//				aluno1.setDataMatricula(dataMatricula);
//				aluno1.setSerieMatriculado(serie);
//				aluno1.setNomeEscola(nomeEscola);

					for (int pos = 1; pos <= 1; pos++) {
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
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("================= Lista Aprovados =================");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(aluno.getNome() + " com média de " + aluno.getMediaNota());
				}

				System.out.println("================= Lista Reprovados =================");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(aluno.getNome() + " com média de " + aluno.getMediaNota());
				}

				System.out.println("================= Lista Recuperacao =================");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(aluno.getNome() + " com média de " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso nao permitido!");
			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			// Imprime no console o erro
			e.printStackTrace();

			// Mensagem do erro ou causa
			System.out.println("Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Metodo de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro de conversao de numero" + saida.toString());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro de NullPointerException"+ e.getClass());

		} catch (Exception e) { //Captura todas as excecoes nao prev
			e.printStackTrace(); //imprime no console
			JOptionPane.showMessageDialog(null, "Erro inesperado "+ e.getClass().getName());

		}
	}
}
