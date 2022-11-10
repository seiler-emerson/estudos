package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		 
		aluno1.setNome(nome);
		
		System.out.println("O nome do aluno é "+aluno1.getNome());
	}

}
