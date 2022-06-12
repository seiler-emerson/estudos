package br.com.entra21.emr.backend.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
	private String anamnesis;   //anamnese
	private String prescription;  //receituario
	private String certificate; //atestado
	private String forwarding;  //encaminhamento
	private String medicalRelease;  //alta medica
	private LocalDate date;
	private LocalTime hour;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Appointment(String anamnesis, String prescription, String certificate, String forwarding,
			String medicalRelease, LocalDate date, LocalTime hour) {
		super();
		this.anamnesis = anamnesis;
		this.prescription = prescription;
		this.certificate = certificate;
		this.forwarding = forwarding;
		this.medicalRelease = medicalRelease;
		this.date = date;
		this.hour = hour;
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
}
