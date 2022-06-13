package br.com.entra21.emr.backend.models;

import java.time.LocalDate;
import java.util.LinkedList;


public class Patient extends Person {
	public LinkedList<Appointment> appointments;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(String name, String cpf, String nameMother, String nameFather, String address, String genre,
			LocalDate birth) {
		super(name, cpf, nameMother, nameFather, address, genre, birth);
		// TODO Auto-generated constructor stub
	}

	public Patient(LinkedList<Appointment> appointments) {
		super();
		this.appointments = appointments;
	}

	public LinkedList<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(LinkedList<Appointment> appointments) {
		this.appointments = appointments;
	}

	public void registrationRecord(String name) {
		System.out.println("The patient registration "+name+" was successful!");
	}
	
	public void editedRecord(String name) {
		System.out.println("The patient record "+name+" was successful!");
	}
	
	public void deletedRecord(String name) {
		System.out.println("The patient record "+name+" was successfully deleted!");
	}
	
	
}
