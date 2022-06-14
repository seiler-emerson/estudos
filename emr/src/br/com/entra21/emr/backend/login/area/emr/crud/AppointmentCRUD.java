package br.com.entra21.emr.backend.login.area.emr.crud;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.Repository;
import br.com.entra21.emr.backend.anottations.Description;
import br.com.entra21.emr.backend.anottations.Implemented;
import br.com.entra21.emr.backend.anottations.NotImplemented;
import br.com.entra21.emr.backend.models.Appointment;
import br.com.entra21.emr.backend.models.Doctor;
import br.com.entra21.emr.backend.models.Patient;

public class AppointmentCRUD extends Menu {
	
	private HashMap<String, Patient> patients = Repository.patients;
	public static HashMap<String, Doctor> doctors = Repository.doctors;
	
	private static ArrayList<String> options = new ArrayList<String>(
			Arrays.asList("Create Appointment", "List Appointment", "Update Appointment", "Delete Appointment", "Details Appointment"));
	
	public AppointmentCRUD() {
		super("APPOINTMENTS", options);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public byte captureOption() {

		byte opcao = super.captureOption();
		switch (opcao) {
		case 1:
			create(patients);
			break;
		case 2:
			listAppointments(patients);
			break;
		case 3:
			update(patients);
			break;
		case 4:
			delete(patients);
			break;
		case 5:
			details(patients);
			break;
		default:
			System.out.println("Opção inválida para o menu de " + super.getTitle());
			break;
		}
		return opcao;
	}
	
	@Implemented
	public void listAppointments(HashMap<String, Patient> patients) {
		System.out.println("========================================================");
		System.out.println("APPOINTMENTS LIST");
		
		byte totalAppointments = 0;
		System.out.println("\tNº -    Date   -  Hour - Patient Name - CPF");
		for (Patient patient : patients.values()) {
			for(byte count=0;count<patient.getAppointments().size();count++) {
				System.out.println("\t"+count+" - "+patient.getAppointments().get(count).getDate()+" - "+ patient.getAppointments().get(count).getHour().format(DateTimeFormatter.ofPattern("HH:mm"))+" - "+patient.getName()+" - "+patient.getCpf() );
				totalAppointments+=1;
			}
		}
		System.out.println("\nAPPOINTMENTS TOTAL: " + totalAppointments + " appointments ");
	}
	
	@Implemented
	public void listPatients(HashMap<String, Patient> patients) {
		System.out.println("========================================================");
		System.out.println("PATIENTS LIST");
		for (Patient patient : patients.values()) {
			System.out.println("\t" + patient.getName() + " - "+((patient.appointments) != null? (patient.appointments.size()):"0")+" appointment(s) - CPF: "+patient.getCpf());
		}
		System.out.println("\nPATIENTS TOTAL: " + patients.size() + " patients ");
	}
	
	@Implemented
	public void create(HashMap<String, Patient> patients) {
		listPatients(patients);
		System.out.println("Select the patient CPF:");
		String key = getInput().next();
		System.out.println("You selected the patient "+patients.get(key).getName());
		
		Appointment newAppointment = new Appointment();
		captureValues(newAppointment);
		patients.get(key).appointments.add(newAppointment);	
	}
	
	public void update(HashMap<String, Patient> patients) {
		listAppointments(patients);
		System.out.println("Select the patient CPF:");
		String keyPatient = getInput().next();
		System.out.println("You selected the patient "+patients.get(keyPatient).getName());
		System.out.println("Select the patient APPOINTMENT of patient selected:");
		byte keyAppointment = getInput().nextByte();
		captureValues(patients.get(keyPatient).getAppointments().get(keyAppointment)); //verificar
//		captureValues(selectAppointment());
		
	}
	
	public void delete(HashMap<String, Patient> patients) {
		listAppointments(patients);
		System.out.println("Select the patient CPF:");
		String keyPatient = getInput().next();
		System.out.println("You selected the patient "+patients.get(keyPatient).getName());
		System.out.println("Select the patient APPOINTMENT of patient deleted:");
		byte keyAppointment = getInput().nextByte();
		patients.get(keyPatient).getAppointments().remove(keyAppointment);
	}
	
	
	@Implemented
	public void details(HashMap<String, Patient> patients) {
		
		listAppointments(patients);
		System.out.println("Select the patient CPF:");
		String keyPatient = getInput().next();
		System.out.println("You selected the patient "+patients.get(keyPatient).getName());
		System.out.println("Select the patient APPOINTMENT of patient appointments detais:");
		byte keyAppointment = getInput().nextByte();
		
		
		System.out.println("\nAPPOINTMENTS");
		System.out.println("Doctor responsible: "+patients.get(keyPatient).getAppointments().get(keyAppointment).getDoctor().getName());
		System.out.println("Patient Name: "+patients.get(keyPatient).getName());
		System.out.println("Patient CPF: "+patients.get(keyPatient).getCpf());
		System.out.println("Service date: "+patients.get(keyPatient).getAppointments().get(keyAppointment).getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Service time: "+patients.get(keyPatient).getAppointments().get(keyAppointment).getHour().format(DateTimeFormatter.ofPattern("HH:mm")));
		System.out.println("Anamnesi: "+patients.get(keyPatient).getAppointments().get(keyAppointment).getAnamnesis());
		System.out.println("Prescription: "+patients.get(keyPatient).getAppointments().get(keyAppointment).getPrescription());
		System.out.println("Certificate/Declaration: "+patients.get(keyPatient).getAppointments().get(keyAppointment).getCertificate());
		System.out.println("Forwarding: "+patients.get(keyPatient).getAppointments().get(keyAppointment).getForwarding());
		System.out.println("Medical release: "+patients.get(keyPatient).getAppointments().get(keyAppointment).getMedicalRelease());
	}
	
	public void captureValues(Appointment newAppointment) {
		
		newAppointment.setDoctor(captureDoctor());
		newAppointment.setDate(LocalDate.now());
		newAppointment.setHour(LocalTime.now());
		newAppointment.setAnamnesis(getInput().nextLine());
		newAppointment.setPrescription(prescription());
		newAppointment.setCertificate(certificate());
		newAppointment.setForwarding(forwarding());
		newAppointment.setMedicalRelease(medicalRelease());
	}
	
	@Description(value = "Method for capturing the patient's prescription.")
	@NotImplemented //TRY CAT PARA OPCAO DIFERENTE
	public String prescription() {
		System.out.println("Medical prescription required?");
		System.out.println("1 - YES");
		System.out.println("2 - NO");
		byte option = getInput().nextByte();
		String prescription = null;
		
		if(option == 1) {
			System.out.println("Report Medical prescription:");
			prescription = getInput().nextLine();	//Two because nextLine Bug.
			prescription = getInput().nextLine();
		};
		
		return prescription;
	}
	
	@Description(value = "Method for capturing the patient's certificate.")
	@NotImplemented //TRY CAT PARA OPCAO DIFERENTE
	public String certificate() {
		System.out.println("Certificate/declaration required?");
		System.out.println("1 - YES");
		System.out.println("2 - NO");
		byte option = getInput().nextByte();
		String certificate = null;
		
		if(option == 1) {
			System.out.println("Report the certificate:");
			certificate = getInput().nextLine();	//Two because nextLine Bug.
			certificate = getInput().nextLine();
		};
		
		return certificate;
	}
	
	@Description(value = "Method for capturing the patient's forwarding.")
	@NotImplemented //TRY CAT PARA OPCAO DIFERENTE
	public String forwarding() {
		System.out.println("Forwarding require?");
		System.out.println("1 - YES");
		System.out.println("2 - NO");
		byte option = getInput().nextByte();
		String forwarding = null;
		
		if(option == 1) {
			System.out.println("Report the forwarding:");
			forwarding = getInput().nextLine();	//Two because nextLine Bug.
			forwarding = getInput().nextLine();
		};
		
		return forwarding;
	}
	
	@Description(value = "Method for capturing the patient's medical release.")
	@Implemented
	public String medicalRelease() {
		System.out.println("Report the medical release: ");
		String medicalRelease = getInput().nextLine();	//Two because nextLine Bug.
		medicalRelease = getInput().nextLine();
		
		return medicalRelease;
	}
	
	public Doctor captureDoctor() {
		new DoctorCRUD().list(doctors);
		
		System.out.println("Inform the doctor CPF:");
		Doctor captureDoctor = doctors.get(super.getInput().next());
		
		return captureDoctor;
	}
	
}
