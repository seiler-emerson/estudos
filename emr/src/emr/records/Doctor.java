package emr.records;

import java.time.LocalDate;

public class Doctor extends Person{
	private String specialty;
	private String medicalLicense;
	
	public Doctor() {
		super();
	}
	
	public Doctor(String name, String cpf, String nameMother, String nameFather, String address, String genre, LocalDate birth) {
		super(name, cpf, nameMother, nameFather, address, genre, birth);
	}
	
	public Doctor(String name, String cpf, String nameMother, String nameFather, String address, String genre, LocalDate birth, String specialty, String medicalLicense) {
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
	
}
