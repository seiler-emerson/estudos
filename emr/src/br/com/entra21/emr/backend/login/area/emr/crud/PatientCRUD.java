package br.com.entra21.emr.backend.login.area.emr.crud;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.Repository;
import br.com.entra21.emr.backend.models.Appointment;
import br.com.entra21.emr.backend.models.Patient;

public class PatientCRUD extends Menu implements ICrud<Patient> {

	private HashMap<String, Patient> patients = Repository.patients;

	public PatientCRUD() {
		super("PATIENTS", options);
	}

	@Override
	public byte captureOption() {

		byte option = super.captureOption();
		switch (option) {
		case 1:
			// Create a new patient
			create();
			break;
		case 2:
			// Read patients
			list(patients);
			break;
		case 3:
			// Update patient
			System.out.println("UPDATING PATIENT");
			update(captureKey());
			break;
		case 4:
			// Delete patient
			delete(captureKey());
			break;
		case 5:
			// Details of patient
			details(patients);
			break;
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
			break;
		}
		return option;
	}

	@Override
	public void list(HashMap<String, Patient> patients) {
		System.out.println("========================================================");
		System.out.println("PATIENTS LIST");
		for (Patient patient : patients.values()) {
			System.out.println("\t" + patient.getName() + " - "+((patient.appointments) != null? (patient.appointments.size()):"0")+" appointment(s) - CPF: "+patient.getCpf());
		}
		System.out.println("\nPATIENTS TOTAL: " + patients.size() + " patients ");
	}

	@Override
	public void create() {
		Patient newPatient = captureValues();
		if (search(newPatient) == null) {
			patients.put(newPatient.getCpf(), newPatient);
			newPatient.setAppointments(new ArrayList<>());
		} else {
			System.out.println("The patient with cpf "+newPatient.getCpf()+" is already registered");
		}
	}

	@Override
	public Patient search(Patient key) {
		return patients.get(key.getCpf());
	}
	

	@Override
	public void update(Patient key) {
		Patient currentPatient = search(key);
		if (currentPatient == null) {
			System.out.println("The selected patient does not exist: "+ key.getCpf());
		} else {
			patients.put(key.getCpf(), editValues(key.getCpf(), patients.get(key.getCpf()).getAppointments()));
			System.out.println("Updated data...");
		}

	}

	@Override
	public void delete(Patient key) {
		Patient currentPatient = search(key);
		
		if (currentPatient == null) {
			System.out.println("The selected patient does not exist: " + key.getCpf());
		} else {
			patients.remove(key.getCpf());
			System.out.println("Deleted data...");
		}

	}

	@Override
	public Patient captureKey() {
		list(patients);
		Patient capturePatient = new Patient();
		
		System.out.println("Inform the patient CPF:");
		capturePatient.setCpf(super.getInput().next());
		return capturePatient;
	}

	@Override
	public Patient captureValues() {
		
		Patient patient = new Patient();
		
		System.out.println("Enter the patient's name:");
		patient.setName(getInput().next());
				
		System.out.println("Enter the patient's CPF:");
		patient.setCpf(getInput().next());			
		
		System.out.println("Enter the name of the patient's mother:");
		patient.setNameMother(getInput().next());
		
		System.out.println("Enter the name of the patient's father:");
		patient.setNameFather(getInput().next());
		
		System.out.println("Enter the patient's address:");
		patient.setAddress(getInput().next());
		
		System.out.println("Enter the patient's gender:");
		patient.setGenre(getInput().next());
		
//		System.out.println("Enter the patient's day of birth:");
//		byte dayBirth = getInput().nextByte();
//		
//		System.out.println("Enter the patient's month of birth:");
//		byte monthBirth = getInput().nextByte();
//		
//		System.out.println("Enter the patient's year of birth:");
//		short yearBirth = getInput().nextShort();
		
		System.out.println("Enter your date of birth in yyyy-mm-dd format");
		LocalDate birthDate = LocalDate.parse(getInput().next());
		patient.setBirth(birthDate);
		
		return patient;
	}
	
	public Patient editValues(String cpf, ArrayList<Appointment> appointments) {
		
		Patient patient = new Patient();
		patient.setCpf(cpf);
//		patient.setAppointments(new ArrayList<>());
		patient.setAppointments(appointments);
//		for(byte i=0;i<patient.appointments.size();i++) {
//			System.out.println(appointments.get(i));
//		}
		
		System.out.println("Enter the patient's name:");
		patient.setName(getInput().next());		
		
		System.out.println("Enter the name of the patient's mother:");
		patient.setNameMother(getInput().next());
		
		System.out.println("Enter the name of the patient's father:");
		patient.setNameFather(getInput().next());
		
		System.out.println("Enter the patient's address:");
		patient.setAddress(getInput().next());
		
		System.out.println("Enter the patient's gender:");
		patient.setGenre(getInput().next());
		
		System.out.println("Enter the patient's day of birth:");
		byte dayBirth = getInput().nextByte();
		
		System.out.println("Enter the patient's month of birth:");
		byte monthBirth = getInput().nextByte();
		
		System.out.println("Enter the patient's year of birth:");
		short yearBirth = getInput().nextShort();
		
		patient.setBirth(LocalDate.of(yearBirth, monthBirth, dayBirth));
		
		return patient;
	}
	
	@Override
	public void details(HashMap<String, Patient> patients) {
		list(patients);
		System.out.println("Select a patient: ");
		String option = getInput().next();
		System.out.println(option);
		
		System.out.println("Full name: "+patients.get(option).getName());
		System.out.println("CPF: "+patients.get(option).getCpf());
		System.out.println("Mother name: "+patients.get(option).getNameMother());
		System.out.println("Name Father: "+patients.get(option).getNameFather());
		System.out.println("Adress: "+patients.get(option).getAddress());
		System.out.println("Genre: "+patients.get(option).getGenre());
		System.out.println("Birth date: "+patients.get(option).getBirth());
		System.out.println("Appointment Number: "+patients.get(option).appointments.size());
		if(patients.get(option).appointments == null) {			
			System.out.println("The patient has no previous appointments.");			
		} else {	
			for(byte count=0;count<patients.get(option).appointments.size();count++) {
				System.out.println("\nAPPOINTMENTS "+(count+1));
				System.out.println("Service date: "+patients.get(option).getAppointments().get(count).getDate());
				System.out.println("Service time: "+patients.get(option).getAppointments().get(count).getHour());
				System.out.println("Anamnesi :"+patients.get(option).getAppointments().get(count).getAnamnesis());
				System.out.println("Prescription :"+patients.get(option).getAppointments().get(count).getPrescription());
				System.out.println("Certificate/Declaration :"+patients.get(option).getAppointments().get(count).getCertificate());
				System.out.println("Forwarding :"+patients.get(option).getAppointments().get(count).getForwarding());
				System.out.println("Medical release :"+patients.get(option).getAppointments().get(count).getMedicalRelease());
			} 
		}
	}

}
