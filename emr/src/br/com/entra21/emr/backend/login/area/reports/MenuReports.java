package br.com.entra21.emr.backend.login.area.reports;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.Repository;
import br.com.entra21.emr.backend.login.area.emr.crud.DoctorCRUD;
import br.com.entra21.emr.backend.login.area.emr.crud.PatientCRUD;
import br.com.entra21.emr.backend.models.Doctor;
import br.com.entra21.emr.backend.models.Patient;

public class MenuReports extends Menu {
	private HashMap<String, Patient> patients = Repository.patients;
	private HashMap<String, Doctor> doctors = Repository.doctors;
	
	public MenuReports(String title, ArrayList<String> options) {
		super(title, options);
	}
	
	@Override
	public byte captureOption() {

		byte opcao = super.captureOption();
		switch (opcao) {
		case 1:  
			System.out.println("TOTAL PATIENTS");
			Reports.totalPatients();
			break;
		case 2: 
			System.out.println("TOTAL APPOINTMENTS");
			Reports.totalAppointments(patients);
			break;
		case 3: 
			System.out.println("PATIENTS LIST");
			new PatientCRUD().list(patients);
			break;
		case 4: 
			new DoctorCRUD().list(doctors);
			break;
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
			break;
		}
		return opcao;
	}
	
	
	
}