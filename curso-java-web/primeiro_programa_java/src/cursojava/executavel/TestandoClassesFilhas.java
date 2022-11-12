package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Joao");
		aluno.setIdade(16);
		aluno.pessoaMaiorIdade();

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1231234214");
		diretor.setNome("Carlos");
		diretor.setIdade(50);
		diretor.pessoaMaiorIdade();

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administracao");
		secretario.setNome("Alfredo");
		secretario.setNumeroCpf("234245352");
		secretario.setIdade(18);
		secretario.pessoaMaiorIdade();

		System.out.println(
				aluno.getNome() + " é maior idade? " + aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(secretario.getNome() + " é maior idade? " + secretario.pessoaMaiorIdade());
		System.out.println(diretor.getNome() + " é maior idade? " + diretor.pessoaMaiorIdade());

		System.out.println("Salario aluno e = " + aluno.salario());
		System.out.println("Salario secretario e = " + secretario.salario());
		System.out.println("Salario diretor e = " + diretor.salario());

		teste(aluno);
		teste(secretario);
		teste(diretor);
	}

	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa e demais = " + pessoa.getNome() + " e o salario e " + pessoa.salario());
	}
}
