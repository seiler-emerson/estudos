package br.com.entra21.emr.backend;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedList;

import br.com.entra21.emr.backend.models.Appointment;
import br.com.entra21.emr.backend.models.Doctor;
import br.com.entra21.emr.backend.models.Patient;

public class Repository {

	public static HashMap<String, Patient> patients = new HashMap<>();
	public static HashMap<String, Doctor> doctors = new HashMap<>();
	
	
	//PATIENTS
	public static void generateDataPatients() {
		patients.put("001", new Patient("Sheldon", "001", "Mary Cooper", "George Cooper", "Av Los Robles Avenue, 2311 Pasadena", "m", LocalDate.of(1980, 2, 26)));
		patients.get("001").setAppointments(new LinkedList<>());
		
		patients.put("002", new Patient("Joana da Silva", "002", "Julia Garcia", "Joao da Silca", "Rua 456, Decimal, Numerais", "f", LocalDate.of(1985, 6, 13)));
		patients.get("002").setAppointments(new LinkedList<>());
		
		patients.put("003", new Patient("Cleber Silveira", "003", "Carla Silva Garcia", "Olindio Silveira", "Rua 456", "m", LocalDate.of(1995, 4, 13)));
		patients.get("003").setAppointments(new LinkedList<>());
		
		patients.put("004", new Patient("Silvana Github", "004", "Olivia Github", "Linus Github", "Rua Versionamento, Git, Online", "f", LocalDate.of(2003, 10, 6)));
		patients.get("004").setAppointments(new LinkedList<>());
		
		patients.put("005", new Patient("Joao da Silva", "005", "Maria da Silva", "Jose da Silva", "Rua 123, Centro, Numerais", "m", LocalDate.of(1945, 2, 1)));
		patients.get("005").setAppointments(new LinkedList<>());
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
		
		Appointment atendimento2 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2021, 12, 11), LocalTime.of(22, 06));
		patients.get("001").appointments.add(atendimento2);
		
		Appointment atendimento3 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2012, 2, 1), LocalTime.of(15, 19));
		patients.get("002").appointments.add(atendimento3);
		
		Appointment atendimento4 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2020, 5, 5), LocalTime.of(10, 10));
		patients.get("002").appointments.add(atendimento4);
		
		Appointment atendimento5 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2013, 4, 11), LocalTime.of(03, 15));
		patients.get("003").appointments.add(atendimento5);
		
		Appointment atendimento6 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2012, 10, 15), LocalTime.of(12, 01));
		patients.get("003").appointments.add(atendimento6);
		
		Appointment atendimento7 = new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2003, 2, 1), LocalTime.of(10, 16));
		patients.get("004").appointments.add(atendimento7);
		
		Appointment atendimento8 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 6, 12), LocalTime.of(01, 45));
		patients.get("004").appointments.add(atendimento8);
		
		Appointment atendimento9 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2015, 12, 11), LocalTime.of(02, 17));
		patients.get("005").appointments.add(atendimento9);
		
		Appointment atendimento10 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2002, 2, 1), LocalTime.of(00, 10));
		patients.get("005").appointments.add(atendimento10);
		
		Appointment atendimento11 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2017, 12, 1), LocalTime.of(05, 10));
		patients.get("005").appointments.add(atendimento11);
		
		Appointment atendimento12 = new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2018, 12, 14), LocalTime.of(15, 00));
		patients.get("005").appointments.add(atendimento12);
		
	}

	public static void generateDataBase() {
		generateDataPatients(); 			//Banco de dados Pacientes
		generateDataDoctors();			//Banco de dados Médicos
		generateDataAppointments();
	}
	
}
