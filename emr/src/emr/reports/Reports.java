package emr.reports;

import java.util.ArrayList;
import java.util.Scanner;
import emr.Main;
import emr.records.Records;
import emr.records.Patient;
import emr.emr.Emr;

public class Reports {

	static Scanner input = new Scanner(System.in);

	public static void report() {

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
				numberPatientsReport(Records.patients);
				break;
			case 2:
				appointmentNumberReport(Records.patients);
				break;
			case 3:
				detailsPatientsReport(Records.patients);
				break;
			case 4:
				Emr.listPatients(Records.patients);
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);
	
}
	
	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||               REPORTS              ||";
		menu += "\n||-1 - Return                         ||";
		menu += "\n|| 0 - Exit                           ||";
		menu += "\n|| 1 - Number of Patients             ||";
		menu += "\n|| 2 - Number of Appointments         ||";
		menu += "\n|| 3 - Data Patients                  ||";
		menu += "\n|| 4 - List Patients                  ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}
	
	private static void numberPatientsReport(ArrayList<Patient> patients) {
		byte patientsNumber=0;
		for(byte count=0;count<patients.size();count++) {
			patientsNumber+=1;
		}
		
		System.out.println("Number of registered patients: "+patientsNumber);
	}
	
	private static void appointmentNumberReport(ArrayList<Patient> patients) {
		byte appointmentNumber=0;
		for(byte count=0;count<patients.size();count++) {
			for(byte count2=0;count2<patients.get(count).appointments.size();count2++) {
				appointmentNumber+=1;
			}
		}
		
		System.out.println("Number of registered appointment:"+appointmentNumber);
	}
	
	private static void detailsPatientsReport(ArrayList<Patient> patients) {
		
		Emr.listPatients(patients);
		System.out.println("Select a patient: ");
		byte option = input.nextByte();
		
		byte appointmentNumber=0;
		for(byte count=0;count<patients.get(option).appointments.size();count++) {
			appointmentNumber+=1;
		}
		
		System.out.println("Full name: "+patients.get(option).getName());
		System.out.println("CPF: "+patients.get(option).getCpf());
		System.out.println("Mother name: "+patients.get(option).getNameMother());
		System.out.println("Name Father: "+patients.get(option).getNameFather());
		System.out.println("Adress: "+patients.get(option).getAddress());
		System.out.println("Genre: "+patients.get(option).getGenre());
		System.out.println("Birth date: "+patients.get(option).getBirth());
		System.out.println("Appointment Number: "+appointmentNumber);
		
		
	}
	
}
