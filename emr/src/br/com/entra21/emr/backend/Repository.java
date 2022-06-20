package br.com.entra21.emr.backend;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;

import br.com.entra21.emr.backend.login.area.emr.crud.TypeUser;
import br.com.entra21.emr.backend.models.Appointment;
import br.com.entra21.emr.backend.models.Doctor;
import br.com.entra21.emr.backend.models.Patient;
import br.com.entra21.emr.backend.models.User;

public class Repository {

	public static HashMap<String, Patient> patients = new HashMap<>();	//TODO - HashMap
	public static HashMap<String, Doctor> doctors = new HashMap<>();
	public static HashMap<String, User> users = new HashMap<>();
	public static HashSet<String> states = new HashSet<String>();	//TODO - HashSet
	
	
	//PATIENTS
	public static void generateDataPatients() {
		patients.put("036.869.260-40", new Patient("Sheldon Cooper", "036.869.260-40", "Mary Cooper", "George Cooper", "Av Los Robles Avenue, 2311 Pasadena", "m", LocalDate.of(1980, 2, 26)));		
		patients.put("502.680.680-54", new Patient("Joana da Silva", "502.680.680-54", "Julia Garcia", "Joao da Silca", "Rua 456, Decimal, Numerais", "f", LocalDate.of(1985, 6, 13)));
		patients.put("163.514.890-16", new Patient("Cleber Silveira", "163.514.890-16", "Carla Silva Garcia", "Olindio Silveira", "Rua 456", "m", LocalDate.of(1995, 4, 13)));
		patients.put("763.323.270-65", new Patient("Silvana Github", "763.323.270-65", "Olivia Github", "Linus Github", "Rua Versionamento, Git, Online", "f", LocalDate.of(2003, 10, 6)));
		patients.put("296.131.660-09", new Patient("Joao da Silva", "296.131.660-09", "Maria da Silva", "Jose da Silva", "Rua 123, Centro, Numerais", "m", LocalDate.of(1945, 2, 1)));
	}
	
	//DOCTORS
	public static void generateDataDoctors() {
		doctors.put("745.468.345-84", new Doctor("Lizabel Balta", "745.468.345-84", "Carla Balta", "Clovis Balta", "Rua Conselheiro, 3476, Rocio Pequeno", "female", LocalDate.of(1986, 9, 14), "Obstetra", "9836745-9", "pr"));
		doctors.put("145.345.345-34", new Doctor("Rafael da Silva", "145.345.345-34", "Julia Silva", "Carlos da Silva", "Rua Barao", "male", LocalDate.of(1975, 3, 30), "Clinico Geral", "123456-9", "rr"));
		doctors.put("343.335.329-81", new Doctor("Carlos Francesconi", "343.335.329-81", "Elisandra Francesconi", "Mateus Francesconi", "Rua Irati", "male", LocalDate.of(1965, 3, 13), "Cardiologista", "32455-9", "sc"));
	}
	
	//APPOINTMENTS
	public static void generateDataAppointments() {
		//TODO - Instanciar objetos
		patients.get("036.869.260-40").appointments.add(new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10), doctors.get("145.345.345-34")));
		patients.get("036.869.260-40").appointments.add(new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2021, 12, 11), LocalTime.of(22, 06), doctors.get("343.335.329-81")));
		patients.get("502.680.680-54").appointments.add(new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2012, 2, 1), LocalTime.of(15, 19), doctors.get("745.468.345-84")));
		patients.get("502.680.680-54").appointments.add(new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2020, 5, 5), LocalTime.of(10, 10), doctors.get("145.345.345-34")));
		patients.get("163.514.890-16").appointments.add(new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2013, 4, 11), LocalTime.of(03, 15), doctors.get("343.335.329-81")));
		patients.get("163.514.890-16").appointments.add(new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2012, 10, 15), LocalTime.of(12, 01), doctors.get("745.468.345-84")));
		patients.get("763.323.270-65").appointments.add(new Appointment("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2003, 2, 1), LocalTime.of(10, 16), doctors.get("145.345.345-34")));
		patients.get("763.323.270-65").appointments.add(new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 6, 12), LocalTime.of(01, 45), doctors.get("343.335.329-81")));
		patients.get("296.131.660-09").appointments.add(new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2015, 12, 11), LocalTime.of(02, 17), doctors.get("145.345.345-34")));
		patients.get("296.131.660-09").appointments.add(new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2002, 2, 1), LocalTime.of(00, 10), doctors.get("145.345.345-34")));
		patients.get("296.131.660-09").appointments.add(new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2017, 12, 1), LocalTime.of(05, 10), doctors.get("745.468.345-84")));
		patients.get("296.131.660-09").appointments.add(new Appointment("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2018, 12, 14), LocalTime.of(15, 00), doctors.get("145.345.345-34")));
	}
	
	public static void generateDataStates() {
		states.add("ac");
		states.add("al");
		states.add("ap");
		states.add("am");
		states.add("ba");
		states.add("ce");
		states.add("es");
		states.add("go");
		states.add("ma");
		states.add("mt");
		states.add("ms");
		states.add("mg");
		states.add("pa");
		states.add("pb");
		states.add("pr");
		states.add("pe");
		states.add("pi");
		states.add("rj");
		states.add("rn");
		states.add("rd");
		states.add("ro");
		states.add("rr");
		states.add("sc");
		states.add("sp");
		states.add("se");
		states.add("to");
		states.add("df");
		
	}
	
	public static void generateDataLogin() {
		users.put("admin", new User("admin", 123, LocalDate.of(2022, 6, 19), LocalTime.of(19, 57), TypeUser.ADMIN));
		users.put("doctor", new User("doctor", 123, LocalDate.of(2022, 6, 19), LocalTime.of(16, 42), TypeUser.DOCTOR));
		users.put("user", new User("user", 123, LocalDate.of(2022, 6, 19), LocalTime.of(1, 18), TypeUser.USER));
		users.put("test", new User("test", 123, LocalDate.of(2022, 6, 19), LocalTime.of(1, 18), TypeUser.USER));
	}

	public static void generateDataBase() {
		generateDataPatients(); 			//Banco de dados Pacientes
		generateDataDoctors();				//Banco de dados Médicos
		generateDataAppointments();
		generateDataStates();
		generateDataLogin();
	}
	
}
