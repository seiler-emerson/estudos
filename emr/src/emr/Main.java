package emr;

import java.util.Scanner;

import emr.records.Records;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Records.preRecord(Records.patients, Records.doctors);
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
				// Access emr
				emr.emr.Emr.emr();
				break;
			case 2:
				// Acess record
				Records.record();
				break;
			case 3:
				// Acessa report
				
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);
		

	}
	
	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||               WELCOME              ||";
		menu += "\n||-1 - Exit                           ||";
		menu += "\n|| 1 - Electronic Medical Record      ||";
		menu += "\n|| 2 - Records                        ||";
		menu += "\n|| 3 - Reports                        ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}
	
}
