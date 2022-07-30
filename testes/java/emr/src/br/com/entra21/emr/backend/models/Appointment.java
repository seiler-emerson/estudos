package br.com.entra21.emr.backend.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
	private String anamnesis;	//TODO - Atributos
	private String prescription;
	private String certificate;
	private String forwarding;
	private String medicalRelease;
	private LocalDate date;	//TODO - Dates
	private LocalTime hour;
	private Doctor doctor;
	
	public Appointment() {
		super();
	}
	
	public Appointment(String anamnesis, String prescription, String certificate, String forwarding, //TODO - Construtores
			String medicalRelease, LocalDate date, LocalTime hour, Doctor doctor) {
		super();
		this.anamnesis = anamnesis;
		this.prescription = prescription;
		this.certificate = certificate;
		this.forwarding = forwarding;
		this.medicalRelease = medicalRelease;
		this.date = date;
		this.hour = hour;
		this.doctor = doctor;
	}
	
	public String getAnamnesis() {
		return anamnesis;
	}
	
	public void setAnamnesis(String anamnesis) {
		this.anamnesis = anamnesis;
	}
	
	public String getPrescription() {
		return prescription;
	}
	
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	public String getCertificate() {
		return certificate;
	}
	
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	public String getForwarding() {
		return forwarding;
	}
	
	public void setForwarding(String forwarding) {
		this.forwarding = forwarding;
	}
	
	public String getMedicalRelease() {
		return medicalRelease;
	}
	
	public void setMedicalRelease(String medicalRelease) {
		this.medicalRelease = medicalRelease;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalTime getHour() {
		return hour;
	}
	
	public void setHour(LocalTime hour) {
		this.hour = hour;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public static void createMessage(String name) {	//TODO - Metodos especificos
		System.out.println("The appointment registration "+name+" was successful!");
	}
	
	public static void editMessage(String name) {
		System.out.println("The appointment selected "+name+" was successful!");
	}
	
	public static void deleteMessage(String name) {
		System.out.println("The appointment selected "+name+" was successfully deleted!");
	}
}
