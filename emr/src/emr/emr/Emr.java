package emr.emr;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import emr.Main;
import emr.records.Records;
import emr.records.Patient;

public class Emr extends Patient {

	static Scanner input = new Scanner(System.in);
	public static void emr() {

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
				System.exit(1);
				break;
			case 1:
				System.out.println("NOVO ATENDIMENTO SELECIONADO");
				
				appointmentRecord(Records.patients);
				break;
			case 2:
				System.out.println("CONSULTA DE PRONTUARIO SELECIONADA");
				consultEMR(Records.patients);
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);

	
}
	
	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||             PRONTUARIO             ||";
		menu += "\n||-1 - Return                         ||";
		menu += "\n|| 0 - Exit                           ||";
		menu += "\n|| 1 - New Appointment                ||";
		menu += "\n|| 2 - Consult EMR                    ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}
	
	public static void listPatients(ArrayList<Patient> patients) {
		
		for(byte count=0;count<patients.size();count++) {
			System.out.println(count+" - "+patients.get(count).getName());
		}
	}
	
	private static void consultEMR(ArrayList<Patient> patients) {
		listPatients(patients);
		System.out.println("Select the patient number.");
		byte index = input.nextByte();
		
		System.out.println("ELECTRONIC MEDICAL RECORD");
		System.out.println("Patient Name: "+patients.get(index).getName());
		System.out.println("CPF: "+patients.get(index).getCpf());
		System.out.println("Mother Name "+patients.get(index).getNameMother());
		System.out.println("Father Name "+patients.get(index).getNameFather());
		System.out.println("Adress "+patients.get(index).getAddress());
		System.out.println("Genre "+patients.get(index).getGenre());
		System.out.println("Birth date: "+patients.get(index).getBirth());
		if(patients.get(index).appointments == null) {			
			System.out.println("Nenhum atendimento realizado");			
		} else {	
			for(byte count=0;count<patients.get(index).appointments.size();count++) {
				System.out.println("APPOINTMENTS "+(count+1));
				System.out.println("Service date: "+patients.get(index).getAppointments().get(count).getDate());
				System.out.println("Service time: "+patients.get(index).getAppointments().get(count).getHour());
				System.out.println("Anamnesi :"+patients.get(index).getAppointments().get(count).getAnamnesis());
				System.out.println("Prescription :"+patients.get(index).getAppointments().get(count).getPrescription());
				System.out.println("Certificate/Declaration :"+patients.get(index).getAppointments().get(count).getCertificate());
				System.out.println("Forwarding :"+patients.get(index).getAppointments().get(count).getForwarding());
				System.out.println("Medical release :"+patients.get(index).getAppointments().get(count).getMedicalRelease());
			} 
		}		
	}
	
	
	
	public static void appointmentRecord(ArrayList<Patient> patients) {
		listPatients(patients);
		
		System.out.println("Select the patient number.");
		byte index = input.nextByte();
		System.out.println("You selected the patient"+patients.get(index).getName());
		
		LocalDate appointmentDate = LocalDate.now();
		LocalTime appointmentHour = LocalTime.now();
		String anamnesis = anamnesisRecord(index);
		String prescription = prescriptionRecord(index);
		String certificate = certificateRecord(index);
		String forwarding = forwardingRecord(index);
		String medicalRelease = medicalReleaseRecord(index);
				
		Appointment appointment = new Appointment(anamnesis, prescription, certificate, forwarding, medicalRelease, appointmentDate, appointmentHour);   
		patients.get(index).appointments.add(appointment);
					
	}
	
	public static String anamnesisRecord(byte index) {
		System.out.println("Describe the patient's history:");
		String anamnesisDescription = input.next();
		
		return anamnesisDescription;
	}
	
	public static String prescriptionRecord(byte index) {
		System.out.println("Medical prescription required?");
		System.out.println("1 - YES");
		System.out.println("2 - NO");
		byte option = input.nextByte();
		String prescriptionDescription = null;
		
		if(option == 1) {
			System.out.println("Report Medical prescription:");
			prescriptionDescription = input.next();
		};
		
		return prescriptionDescription;
	}
	
	public static String certificateRecord(byte index) {
		System.out.println("Certificate/declaration required?");
		System.out.println("1 - YES");
		System.out.println("2 - NO");
		byte option = input.nextByte();
		String certificate = null;
		
		if(option == 1) {
			System.out.println("Report the certificate:");
			certificate = input.next();
		};
		
		return certificate;
	}
	
	public static String forwardingRecord(byte index) {
		System.out.println("Forwarding require?");
		System.out.println("1 - YES");
		System.out.println("2 - NO");
		byte option = input.nextByte();
		String forwarding = null;
		
		if(option == 1) {
			System.out.println("Report the forwarding:");
			forwarding = input.next();
		};
		
		return forwarding;
	}
	
	public static String medicalReleaseRecord(byte index) {
		System.out.println("Report the medical release: ");
		String medicalRelease = input.next();
		
		return medicalRelease;
	}
}
