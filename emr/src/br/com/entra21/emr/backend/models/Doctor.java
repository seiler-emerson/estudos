package br.com.entra21.emr.backend.models;

import java.time.LocalDate;

public class Doctor extends Person{
	private String specialty;
	private String medicalLicense;
	private String stateLicense;
	
	public Doctor() {
		super();
	}
	
	public Doctor(String name, String cpf, String nameMother, String nameFather, String address, String genre, LocalDate birth, String specialty, String medicalLicense, String stateLicense) { //TODO - novos construtores com base na super classe
		super(name, cpf, nameMother, nameFather, address, genre, birth);
		this.specialty = specialty;
		this.medicalLicense = medicalLicense;
		this.stateLicense = stateLicense;
	}
	
	public Doctor(String name, String cpf, String nameMother, String nameFather, String address, String genre,
			LocalDate birth) {
		super(name, cpf, nameMother, nameFather, address, genre, birth);
	}
	
	
	public Doctor(String specialty, String medicalLicense) {
		super();
		this.specialty = specialty;
		this.medicalLicense = medicalLicense;
	}
	
	
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getMedicalLicense() {
		return medicalLicense;
	}
	public void setMedicalLicense(String medicalLicense) {
		this.medicalLicense = medicalLicense;
	}
	
	public String getStateLicense() {
		return stateLicense;
	}

	public void setStateLicense(String stateLicense) {
		this.stateLicense = stateLicense;
	}

	public static void createMessage(String name) {		//TODO - Polimorfismo - Sobrescrever para: Fazer de forma especifica
		System.out.println("The doctor registration "+name+" was successful!");
	}
	
	public static void editMessage() {	//TODO - Polimorfismo - Fazer completamente de forma especifica
		System.out.println("List for check the edition!");
	}
	public static void editMessage(String name) {
		System.out.println("The doctor edition "+name+" was successful!");
	}
	
	
	public static void deleteMessage(String name) {	//TODO - Polimorfismo - Sobrescrever para: Aproveitar o comportamento e fazer um complemento
		deleteMessage();
		System.out.println("Check the list to see if "+name+" was actually deleted!");
	}
	
}
