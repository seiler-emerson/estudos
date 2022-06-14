package br.com.entra21.emr.backend.login.area.emr.crud;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.Repository;
import br.com.entra21.emr.backend.anottations.Description;
import br.com.entra21.emr.backend.anottations.Implemented;
import br.com.entra21.emr.backend.models.Appointment;
import br.com.entra21.emr.backend.models.Patient;

public class PatientCRUD extends Menu implements ICrud<Patient> {

	private HashMap<String, Patient> patients = Repository.patients;
	private static ArrayList<String> options = new ArrayList<String>(
			Arrays.asList("Create Patient", "List Patients", "Update Patient", "Delete Patient", "Details Patient"));
	
	public PatientCRUD() {
		super("PATIENTS", options);
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();
		switch (option) {
		case 1:
			System.out.println("CREATING PATIENT");
			create();
			break;
		case 2:
			System.out.println("LISTING PATIENT");
			list(patients);
			break;
		case 3:
			System.out.println("UPDATING PATIENT");
			update(captureKey());
			break;
		case 4:
			System.out.println("DELETING PATIENT");
			delete(captureKey());
			break;
		case 5:
			System.out.println("DETAILING PATIENT");
			details(patients);
			break;
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
			break;
		}
		return option;
	}
	
	@Implemented
	@Description(value = "Scans the HashMap of patients and lists it.")
	@Override
	public void list(HashMap<String, Patient> patients) {
		System.out.println("========================================================");
		System.out.println("PATIENTS LIST");
		for (Patient patient : patients.values()) {
			System.out.println("\t" + patient.getName() + " - "+((patient.appointments) != null? (patient.appointments.size()):"0")+" appointment(s) - CPF: "+patient.getCpf());
		}
		System.out.println("\nPATIENTS TOTAL: " + patients.size() + " patients ");
	}

	@Implemented
	@Description(value = "Checks if the patient exists, if not, creates a new patient.")
	@Override
	public void create() {
		Patient newPatient = captureValues();
		if (search(newPatient) == null) {
			patients.put(newPatient.getCpf(), newPatient);
			newPatient.setAppointments(new LinkedList<>());
			Patient.createMessage(newPatient.getName());
		} else {
			System.out.println("The patient with cpf "+newPatient.getCpf()+" is already registered");
		}
	}

	@Implemented
	@Description(value = "Receives a patient and returns his key, in this case his CPF.")
	@Override
	public Patient search(Patient key) {
		return patients.get(key.getCpf());
	}
	
	@Implemented
	@Description(value = "Checks if the patient exists, if it exists, it calls the editValues() method, sending the cpf and the list of patient care. As a result, personal data is changed.")
	@Override
	public void update(Patient key) {
		Patient currentPatient = search(key);
		if (currentPatient == null) {
			System.out.println("The selected patient does not exist: "+ key.getCpf());
		} else {
			patients.put(key.getCpf(), editValues(key.getCpf(), patients.get(key.getCpf()).getAppointments()));
			System.out.println("Updated data...");
			Patient.editMessage(currentPatient.getName());
		}
	}

	@Implemented
	@Description(value = "Checks if the patient exists, if it exists, if it exists, removes the patient from the HashMap, through its key, in this case the CPF.")
	@Override
	public void delete(Patient key) {
		Patient currentPatient = search(key);
		
		if (currentPatient == null) {
			System.out.println("The selected patient does not exist: " + key.getCpf());
		} else {
			patients.remove(key.getCpf());
			System.out.println("Deleted data...");
			Patient.deleteMessage(currentPatient.getName());
		}

	}
	
	@Implemented
	@Description(value = "Lists patients for consultation, creates a temporary patient, asks the user for the cpf of the patient that he wants to manipulate and sets this cpf in the temporary patient.")
	@Override
	public Patient captureKey() {
		list(patients);
		Patient capturePatient = new Patient();
		
		System.out.println("Inform the patient CPF:");
		capturePatient.setCpf(super.getInput().next());
		return capturePatient;
	}

	@Implemented
	@Description(value = "Method for capturing the patient's personal data.")
	@Override
	public Patient captureValues() {
		
		Patient patient = new Patient();
		
		System.out.println("Enter the patient's name:");
		patient.setName(getInput().nextLine());
		patient.setName(getInput().nextLine());
		
		System.out.println("Enter the patient's CPF:");
		patient.setCpf(getInput().next());			
		
		System.out.println("Enter the name of the patient's mother:");
		patient.setNameMother(getInput().nextLine());
		patient.setNameMother(getInput().nextLine());
		
		System.out.println("Enter the name of the patient's father:");
		patient.setNameFather(getInput().nextLine());
		
		System.out.println("Enter the patient's address:");
		patient.setAddress(getInput().nextLine());
		
		System.out.println("Enter the patient's gender:");
		patient.setGenre(getInput().next());
		
		System.out.println("Enter your date of birth in yyyy-mm-dd format");
		LocalDate birthDate = LocalDate.parse(getInput().next());
		patient.setBirth(birthDate);
		
		return patient;
	}
	
	@Implemented
	@Description(value = "Method for capturing the patient's personal data for edit. Receives the cpf, coming from the temporary patient created in the consultation (data transition form) and the list of appointments.")
	public Patient editValues(String cpf, LinkedList<Appointment> appointments) {
		
		Patient patient = new Patient();
		patient.setCpf(cpf);
		patient.setAppointments(appointments);

		System.out.println("Enter the patient's name:");
		patient.setName(getInput().nextLine());		
		patient.setName(getInput().nextLine());
		
		System.out.println("Enter the name of the patient's mother:");
		patient.setNameMother(getInput().nextLine());
		
		System.out.println("Enter the name of the patient's father:");
		patient.setNameFather(getInput().nextLine());
		
		System.out.println("Enter the patient's address:");
		patient.setAddress(getInput().nextLine());
		
		System.out.println("Enter the patient's gender:");
		patient.setAddress(getInput().nextLine());
		
		System.out.println("Enter your date of birth in yyyy-mm-dd format");
		LocalDate birthDate = LocalDate.parse(getInput().next());
		patient.setBirth(birthDate);
		
		return patient;
	}
	
	@Implemented
	@Description(value = "Method for listing the patient's personal data.")
	@Override
	public void details(HashMap<String, Patient> patients) {
		list(patients);
		System.out.println("Select a patient for CPF: ");
		String option = getInput().next();
		System.out.println(option);
		
		System.out.println("Full name: "+patients.get(option).getName());
		System.out.println("CPF: "+patients.get(option).getCpf());
		System.out.println("Mother name: "+patients.get(option).getNameMother());
		System.out.println("Name Father: "+patients.get(option).getNameFather());
		System.out.println("Adress: "+patients.get(option).getAddress());
		System.out.println("Genre: "+patients.get(option).getGenre());
		System.out.println("Birth date: "+patients.get(option).getBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Appointment Number: "+patients.get(option).appointments.size());
		if(patients.get(option).appointments == null) {			
			System.out.println("The patient has no previous appointments.");			
		} else {	
			listAppointments(patients, option);
		}
	}
	
	@Implemented
	@Description(value = "Method for listing and detailing patient care.")
	public static void listAppointments(HashMap<String, Patient> patients, String option) {
		for(byte count=0;count<patients.get(option).appointments.size();count++) {
			System.out.println("\nAPPOINTMENTS "+(count+1));
			System.out.println("Service date: "+patients.get(option).getAppointments().get(count).getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			System.out.println("Service time: "+patients.get(option).getAppointments().get(count).getHour());
			System.out.println("Anamnesi :"+patients.get(option).getAppointments().get(count).getAnamnesis());
			System.out.println("Prescription :"+patients.get(option).getAppointments().get(count).getPrescription());
			System.out.println("Certificate/Declaration :"+patients.get(option).getAppointments().get(count).getCertificate());
			System.out.println("Forwarding :"+patients.get(option).getAppointments().get(count).getForwarding());
			System.out.println("Medical release :"+patients.get(option).getAppointments().get(count).getMedicalRelease());
			System.out.println("Doctor responsible: "+patients.get(option).getAppointments().get(count).getDoctor().getName());
		} 
	}

}