package br.com.entra21.emr.backend.login.area;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.login.area.emr.MenuEMR;
import br.com.entra21.emr.backend.login.area.reports.MenuReports;

public class MenuPrincipal extends Menu {

	public MenuPrincipal(String title, ArrayList<String> options) {
		super(title, options);
	}
	
	@Override
	public byte captureOption() {

		byte opcao = super.captureOption();
		switch (opcao) {
		case 1:  
			new MenuEMR("ELECTRONIC MEDICAL RECORD", new ArrayList<String>(Arrays.asList("Patient", "Doctor","Appointment"))).playMenu();
			break; 
		case 2:  
			new MenuReports("REPORTS", new ArrayList<String>(Arrays.asList("Number of Patients", "Details Patients", "Number of Appointments", "Data Patients", "List Patients"))).playMenu();
			break;
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
			break;
		}
		return opcao;
	}

}