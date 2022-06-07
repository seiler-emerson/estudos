package prontuario.relatorios;

import java.util.Scanner;
import prontuario.Main;

public class Relatorios {

	static Scanner input = new Scanner(System.in);

	public static void relatorio() {

		byte option;

		do {

			System.out.println(displayMenu());
			option = input.nextByte();
			System.out.println("");

			switch (option) {
			case -1:
				Main.main(null);
				break;
			case 0:
				System.out.println("Exiting...");
				System.exit(2);
				break;
			case 1:
				System.out.println("RELATORIO - NUMERO DE PACIENTES CADASTRADOS");
				break;
			case 2:
				System.out.println("RELATORIO - NUMERO DE CONSULTAS MEDICAS REALIZADAS");
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);

	}

	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||              RELATORIOS            ||";
		menu += "\n||-1 - Return                         ||";
		menu += "\n|| 0 - Exit                           ||";
		menu += "\n|| 1 - Numero de Pacientes            ||";
		menu += "\n|| 2 - Numbero de Consultas           ||";
		menu += "\n|| 3 - Dados Pacientes                ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}

}