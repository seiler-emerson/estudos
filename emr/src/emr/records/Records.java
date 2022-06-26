package emr.records;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import emr.Main;
import emr.emr.Appointment;

public class Records {

	static Scanner input = new Scanner(System.in);

	public static ArrayList<Patient> patients = new ArrayList<>(); // contem a lista de pacientes - verificar para inserir dentro de um metodo talvez
	public static ArrayList<Doctor> doctors = new ArrayList<>();
	
	public static void record() {
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
				System.out.println("PATIENT RECORD");
				patientRecord(patients);
				break;
			case 2:
				System.out.println("DOCTOR RECORD");
				doctorRecord(doctors);
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);

	}

	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||              CADASTROS             ||";
		menu += "\n||-1 - Return                         ||";
		menu += "\n|| 0 - Exit                           ||";
		menu += "\n|| 1 - Registrar Patiente             ||";
		menu += "\n|| 2 - Registrar Medico               ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}

	public static void patientRecord(ArrayList<Patient> patients) {

		String name;
		String cpf;
		String nameMother;
		String nameFather;
		String adress;
		String genre; 
		byte day;
		byte month;
		short year;

		System.out.println("Enter the patient's name:");
		name = input.next();

		System.out.println("Enter the patient's CPF:");
		cpf = input.next();

		System.out.println("Enter the name of the patient's mother:");
		nameMother = input.next();

		System.out.println("Enter the name of the patient's father:");
		nameFather = input.next();

		System.out.println("Enter the patient's address:");
		adress = input.next();

		System.out.println("Enter the patient's gender:");
		genre = input.next();

		System.out.println("Enter the patient's day of birth:");
		day = input.nextByte();

		System.out.println("Enter the patient's month of birth:");
		month = input.nextByte();

		System.out.println("Enter the patient's year of birth:");
		year = input.nextShort();

		Patient patient = new Patient(name, cpf, nameMother, nameFather, adress, genre, LocalDate.of(year, month, day)); 
		patient.setAppointments(new ArrayList<>());
		patients.add(patient);

		patient.registrationRecord(name);
	}

	public static void doctorRecord(ArrayList<Doctor> doctors) {
		
		// CRIANDO VARIAVEIS PARA RECEBER DADOS
		String name;
		String cpf;
		String nameMother;
		String nameFather;
		String adress;
		String genre;
		byte day;
		byte month;
		short year;
		String specialty;
		String medicalLicense;

		// CAPTURANDO DADOS
		System.out.println("Enter the doctor's name:");
		name = input.next();

		System.out.println("Enter the doctor's CPF:");
		cpf = input.next();

		System.out.println("Enter the name of the doctor's mother:");
		nameMother = input.next();

		System.out.println("Enter the name of the doctor's father:");
		nameFather = input.next();

		System.out.println("Enter the doctor's address:");
		adress = input.next();

		System.out.println("Enter the doctor's gender:");
		genre = input.next();

		System.out.println("Enter the doctor's date of birth:");
		day = input.nextByte();

		System.out.println("Enter the doctor's month of birth:");
		month = input.nextByte();

		System.out.println("Enter the doctor's year of birth:");
		year = input.nextShort();
		
		System.out.println("What is the doctor's specialty?");
		specialty = input.next();
		
		System.out.println("What is the doctor's medical license?");
		medicalLicense = input.next();

		Doctor doctor = new Doctor(name, cpf, nameMother, nameFather, adress, genre, LocalDate.of(year, month, day), specialty, medicalLicense); // NECESSARIO DEIXAR O nomeMedico dinamico para n ficar tudo com msm nome

		doctors.add(doctor);

	}
	
	public static void preRecord(ArrayList<Patient> patients, ArrayList<Doctor> doctors) {
		if(patients.size()==0) {
				
			//Patients
			Patient nomePaciente1 = new Patient("Sheldon Li Cooper", "010.110.010-01", "Mary Cooper", "George Cooper", "Av Los Robles Avenue, 2311 Pasadena", "m", LocalDate.of(1980, 2, 26));
			nomePaciente1.setAppointments(new ArrayList<>());
			patients.add(nomePaciente1);
			Appointment atendimento1 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente1.appointments.add(atendimento1);
			Appointment atendimento6 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente1.appointments.add(atendimento6);
			
			Patient nomePaciente2 = new Patient("Joana da Silva", "456.456.456-77", "Julia Garcia", "Joao da Silca", "Rua 456, Decimal, Numerais", "f", LocalDate.of(1985, 6, 13));
			nomePaciente2.setAppointments(new ArrayList<>());
			patients.add(nomePaciente2);
			Appointment atendimento2 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente2.appointments.add(atendimento2);
			
			Patient nomePaciente3 = new Patient("Cleber Silveira", "456.956.316-11", "Carla Silva Garcia", "Olindio Silveira", "Rua 456", "m", LocalDate.of(1995, 4, 13));
			nomePaciente3.setAppointments(new ArrayList<>());
			patients.add(nomePaciente3);
			Appointment atendimento3 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente3.appointments.add(atendimento3);
			
			Patient nomePaciente4 = new Patient("Silvana Github", "256.256.312-21", "Olivia Github", "Linus Github", "Rua Versionamento, Git, Online", "f", LocalDate.of(2003, 10, 6));
			nomePaciente4.setAppointments(new ArrayList<>());
			patients.add(nomePaciente4);
			Appointment atendimento4 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente4.appointments.add(atendimento4);
			
			Patient nomePaciente5 = new Patient("Joao da Silva", "123.123.123-33", "Maria da Silva", "Jose da Silva", "Rua 123, Centro, Numerais", "m", LocalDate.of(1945, 2, 1));
			nomePaciente5.setAppointments(new ArrayList<>());
			patients.add(nomePaciente5);
			Appointment atendimento5 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente5.appointments.add(atendimento5);
			
			
			//MEDICOS
			Doctor nomeMedico1 = new Doctor("Rafael da Silva", "145.345.345-34", "Julia Silva", "Carlos da Silva", "Rua Barao", "m", LocalDate.of(1975, 3, 30), "Clinico Geral", "123456-9");
			doctors.add(nomeMedico1);
			
			Doctor nomeMedico2 = new Doctor("Lizabel Balta", "745.468.345-84", "Carla Balta", "Clovis Balta", "Rua Conselheiro, 3476, Rocio Pequeno", "f", LocalDate.of(1986, 9, 14), "Obstetra", "9836745-9");
			doctors.add(nomeMedico2);
		}
	}

}