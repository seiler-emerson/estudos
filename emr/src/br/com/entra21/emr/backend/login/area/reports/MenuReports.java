package br.com.entra21.emr.backend.login.area.reports;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.Repository;
import br.com.entra21.emr.backend.login.area.emr.crud.PatientCRUD;
import br.com.entra21.emr.backend.models.Patient;

public class MenuReports extends Menu {
	private HashMap<String, Patient> patients = Repository.patients;
	public MenuReports(String title, ArrayList<String> options) {
		super(title, options);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public byte captureOption() {

		byte opcao = super.captureOption();
		switch (opcao) {
		case 1:  
			//numero de pacientes
			break;
		case 2: 
			//numero de atendimentos
			break;
		case 3: 
			//dados pacientes
			break;
		case 4: 
			// lista de pacientes
			System.out.println("LISTA PACIENTES");
			
			break; 
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
			break;
		}
		return opcao;
	}
	
}