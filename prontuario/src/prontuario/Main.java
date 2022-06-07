package prontuario;


import java.util.Scanner;
import prontuario.cadastros.Cadastros;
import prontuario.prontuario.eletronico.ProntuarioEletronico;
import prontuario.relatorios.Relatorios;


public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Cadastros.preCadastro(Cadastros.pacientes, Cadastros.medicos);
		byte option;

		do {

			System.out.println(displayMenu());
			option = input.nextByte();
			System.out.println("");

			switch (option) {
			case 0:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			case 1:
				// Acessar prontuario
				ProntuarioEletronico.prontuario();
				break;
			case 2:
				// Acessar cadastros
				Cadastros.cadastro();
				break;
			case 3:
				// Acessar relatorios
				Relatorios.relatorio();
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);
		

	}
	
	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||              BEM VINDO             ||";
		menu += "\n|| 0 - Exit                           ||";
		menu += "\n|| 1 - Prontuario Eletronico          ||";
		menu += "\n|| 2 - Cadastros                      ||";
		menu += "\n|| 3 - Relatorios                     ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}
	
}
