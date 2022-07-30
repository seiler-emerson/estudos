package br.com.entra21.emr.backend.login.area.reports;

import java.util.HashMap;

import br.com.entra21.emr.backend.Repository;
import br.com.entra21.emr.backend.anottations.Description;
import br.com.entra21.emr.backend.anottations.Implemented;
import br.com.entra21.emr.backend.models.Patient;

public class Reports {

	private static HashMap<String, Patient> patients = Repository.patients;
	
	@Description(value = "Metode list total patients")
	@Implemented
	public static void totalPatients() {
		byte patientsNumber=0;
		for(byte count=0;count<patients.size();count++) {
			patientsNumber+=1;
		}
		System.out.println("Number of registered patients: "+patientsNumber);
	}
	
	@Description(value = "Metode list total appointments")
	@Implemented
	public static void totalAppointments(HashMap<String, Patient> patients) {
		byte totalAppointments = 0;
		for (Patient patient : patients.values()) {
			for(byte count=0;count<patient.getAppointments().size();count++) {
				totalAppointments+=1;
			}
		}
		System.out.println("Number of registered appointment: "+ totalAppointments);
	}
	
 }
