package br.com.entra21.emr.backend;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

import br.com.entra21.emr.backend.models.Appointment;
import br.com.entra21.emr.backend.models.Doctor;
import br.com.entra21.emr.backend.models.Patient;

public class Repository {

	public static HashMap<String, Patient> patients = new HashMap<>();
	public static HashMap<String, Doctor> doctors = new HashMap<>();
	public static HashMap<String, Appointment> appointments = new HashMap<>();
	
	
	//PATIENTS
	public static void generateDataPatients() {
		patients.put("001", new Patient("Sheldon", "001", "Mary Cooper", "George Cooper", "Av Los Robles Avenue, 2311 Pasadena", "m", LocalDate.of(1980, 2, 26)));
		patients.get("001").setAppointments(new ArrayList<>());
		
		patients.put("002", new Patient("Joana da Silva", "002", "Julia Garcia", "Joao da Silca", "Rua 456, Decimal, Numerais", "f", LocalDate.of(1985, 6, 13)));
		patients.get("002").setAppointments(new ArrayList<>());
		
		patients.put("003", new Patient("Cleber Silveira", "003", "Carla Silva Garcia", "Olindio Silveira", "Rua 456", "m", LocalDate.of(1995, 4, 13)));
		patients.get("003").setAppointments(new ArrayList<>());
		
		patients.put("004", new Patient("Silvana Github", "004", "Olivia Github", "Linus Github", "Rua Versionamento, Git, Online", "f", LocalDate.of(2003, 10, 6)));
		patients.get("004").setAppointments(new ArrayList<>());
		
		patients.put("005", new Patient("Joao da Silva", "005", "Maria da Silva", "Jose da Silva", "Rua 123, Centro, Numerais", "m", LocalDate.of(1945, 2, 1)));
		patients.get("005").setAppointments(new ArrayList<>());
	}
	
	//DOCTORS
	public static void generateDataDoctors() {
		doctors.put("Rafael da Silva", new Doctor("Rafael da Silva", "145.345.345-34", "Julia Silva", "Carlos da Silva", "Rua Barao", "m", LocalDate.of(1975, 3, 30), "Clinico Geral", "123456-9"));
		doctors.put("Lizabel Balta", new Doctor("Lizabel Balta", "745.468.345-84", "Carla Balta", "Clovis Balta", "Rua Conselheiro, 3476, Rocio Pequeno", "f", LocalDate.of(1986, 9, 14), "Obstetra", "9836745-9"));
	}
	
	//APPOINTMENTS
	public static void generateDataAppointments() {
		Appointment atendimento1 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
		patients.get("001").appointments.add(atendimento1);
		
		Appointment atendimento2 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
		patients.get("001").appointments.add(atendimento2);
		
		Appointment atendimento3 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
		patients.get("002").appointments.add(atendimento3);
		
		Appointment atendimento4 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
		patients.get("003").appointments.add(atendimento4);
		
		Appointment atendimento5 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
		patients.get("004").appointments.add(atendimento5);
		
		Appointment atendimento6 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
		patients.get("005").appointments.add(atendimento6);
		
		
	}
	
	public static void exibir() {
		
		System.out.println("LENDO UM PACIENTE\n");
		
		System.out.println("Full name: "+patients.get("001").getName());
		System.out.println("CPF: "+patients.get("001").getCpf());
		System.out.println("Mother name: "+patients.get("001").getNameMother());
		System.out.println("Name Father: "+patients.get("001").getNameFather());
		System.out.println("Adress: "+patients.get("001").getAddress());
		System.out.println("Genre: "+patients.get("001").getGenre());
		System.out.println("Birth date: "+patients.get("001").getBirth());
		System.out.println("Appointment Number: "+patients.get("001").getAppointments().size());
		
	}

	public static void generateDataBase() {
		generateDataPatients(); 			//Banco de dados Pacientes
		generateDataDoctors();			//Banco de dados Médicos
		generateDataAppointments();
		//Repository.exibir();
	}
	
}
