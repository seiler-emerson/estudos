package br.com.entra21.emr.backend.login.area.emr.crud;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.Repository;
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
			update();
			break;
		case 4:
			// Delete patient
			detele();
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
			System.out.println("\t" + patient.getName() + " - "+patient.appointments.size()+" appointment(s)");
		}
		System.out.println("\nPATIENTS TOTAL: " + patients.size() + " patients ");
	}

	@Override
	public void create() {
		Patient newPatient = captureValues();
		if (search(newPatient) == null) {
			patients.put(newPatient.getName(), newPatient);
		} else {
			System.out.println("The patient with cpf "+newPatient.getCpf()+" is already registered");
		}
	}

	@Override
	public Patient search(Patient key) {
		// TODO Auto-generated method stub
		return patients.get(key.getName());
	}
	

	@Override
	public void update() {
		list(patients);
		System.out.println("Select a patient: ");
		String option = getInput().next();
		System.out.println(option);
		
		if (patients.get(option).getName() == null) {
			System.out.println("The selected patient does not exist: " + option);
		} else {
			patients.put(option, captureValues());
			if(patients.get(option).appointments.size() > 0) {
				// ADICIONAR ATENDIMENTOS PARA O NOME EDITADO
			}
			System.out.println("Updated data...");
		}

	}

	@Override
	public void detele() {
		list(patients);
		System.out.println("Select a patient: ");
		String option = getInput().next();
		System.out.println(option);
		
		if (patients.get(option).getName() == null) {
			System.out.println("The selected patient does not exist: " + option);
		} else {
			patients.remove(option);
			System.out.println("Deleted data...");
		}

	}

	@Override
	public Patient captureKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient captureValues() {
		Patient newPatient = new Patient();
		
		System.out.println("Enter the patient's name:");
		newPatient.setName(getInput().next());
		
		System.out.println("Enter the patient's CPF:");
		newPatient.setCpf(getInput().next());
		
		System.out.println("Enter the name of the patient's mother:");
		newPatient.setNameMother(getInput().next());
		
		System.out.println("Enter the name of the patient's father:");
		newPatient.setNameFather(getInput().next());
		
		System.out.println("Enter the patient's address:");
		newPatient.setAddress(getInput().next());
		
		System.out.println("Enter the patient's gender:");
		newPatient.setGenre(getInput().next());
		
		System.out.println("Enter the patient's day of birth:");
		byte dayBirth = getInput().nextByte();
		
		System.out.println("Enter the patient's month of birth:");
		byte monthBirth = getInput().nextByte();
		
		System.out.println("Enter the patient's year of birth:");
		short yearBirth = getInput().nextShort();
		
		newPatient.setBirth(LocalDate.of(yearBirth, monthBirth, dayBirth));
		
		newPatient.setAppointments(new ArrayList<>());
	
		return newPatient;
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
