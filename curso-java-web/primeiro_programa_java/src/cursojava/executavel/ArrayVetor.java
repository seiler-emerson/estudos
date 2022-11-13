package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		double[] notas = {8.8,9.8,7.0};
		double[] notasLogica = {8.5,6.8,9.0};
		
		/* CRIANDO ALUNO */
		Aluno aluno = new Aluno();
		aluno.setNome("Joao");
		aluno.setNomeEscola("Java School");
		
		/* DISCIPLINA */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplaina("Java");
		disciplina.setNota(notas);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplaina("Logica");		
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);

		
		double[] notas2 = {4.8,3.4,9.0};
		double[] notasLogica2 = {9.5,2.8,9.9};
		
		/* CRIANDO ALUNO */
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Carlos");
		aluno2.setNomeEscola("Java School");
		
		/* DISCIPLINA */
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplaina("Java");
		disciplina3.setNota(notas2);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplaina("Logica");		
		disciplina4.setNota(notasLogica2);
		
		aluno2.getDisciplinas().add(disciplina3);
		aluno2.getDisciplinas().add(disciplina4);
		
		/* ======================================================================== */

		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome aluno:" + arrayAlunos[pos].getNome());
			
			for(Disciplina disc: arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome disciplina: "+ disc.getDisciplaina());
				
				for(int posNota = 0 ; posNota < disc.getNota().length ; posNota++) {
					System.out.println("Nota "+ posNota+ " = "+disc.getNota()[posNota]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Aluno: "+aluno.getNome());
		System.out.println("======= DISCIPLINAS DO ALUNO =======");
		for(Disciplina disc: aluno.getDisciplinas()) {
			System.out.println("Disciplinas: "+disc.getDisciplaina());
			System.out.println("As notas da disciplina sao: ");
			
			double notaMax = 0;
			double notaMin = 0;
			for( int posNota = 0; posNota < disc.getNota().length; posNota++) {
				System.out.println("Nota "+posNota+" = "+disc.getNota()[posNota]);
				
				if(posNota == 0 ) {
					notaMax = disc.getNota()[posNota];
				} else {
					if (disc.getNota()[posNota] > notaMax) {
						notaMax = disc.getNota()[posNota];
					}
				}
				
				if(posNota == 0 ) {
					notaMin = disc.getNota()[posNota];
				} else {
					if (disc.getNota()[posNota] < notaMin) {
						notaMin = disc.getNota()[posNota];
					}
				}
			}
			System.out.println("A maior nota da disciplina "+disc.getDisciplaina()+" e ="+notaMax);
			System.out.println("A menor nota da disciplina "+disc.getDisciplaina()+" e ="+notaMin);

		}
		
		*/
		/* ======================================================================== */
		
//		double[] valores = {9.6, 8.9, 5.8, 100};
		
//		String[] valores1 = {"alex", "90", "Curso Java","email@email.com"};

//		String[] valores = new String[4];
//		valores[0] = "alex";
//		valores[1] = "90";
//		valores[2] = "Curso Java";
//		valores[3] = "email@email.com";
//
//		for(int pos = 0; pos < valores.length; pos++) {
//			System.out.println("Valores "+ (pos+1) + " e = " + valores[pos]);
//		}
		
		/* Array pode ser de todos os tipos de dados e objetos */
		
//		String posicoes = JOptionPane.showInputDialog("Quantas posicoes o Array deve ter?");
		
		
		/* Array precisa ter a quantidade de posicoes definidas */
//		double[] notas = new double[Integer.parseInt(posicoes)];
		
		/* Atribuir valores nas posicoes do array */
//		notas[0] = 7.8;
//		notas[1] = 8.7;
//		notas[2] = 9.7;
//		notas[3] = 9.9;
		
//		for (int pos = 0; pos < notas.length; pos++) {
//			String valor = JOptionPane.showInputDialog("Qual o valor da posicao "+(pos)+"?");
//			notas[pos] =  Double.valueOf(valor);
//		}
//
//		for(int pos = 0; pos < notas.length; pos++) {
//			System.out.println("Nota "+ (pos+1) + " e = " + notas[pos]);
//		}
		
		
		
	}
}
