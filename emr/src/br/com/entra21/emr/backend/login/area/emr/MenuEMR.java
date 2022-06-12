package br.com.entra21.emr.backend.login.area.emr;

import java.util.ArrayList;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.login.area.emr.crud.AppointmentCRUD;
import br.com.entra21.emr.backend.login.area.emr.crud.DoctorCRUD;
import br.com.entra21.emr.backend.login.area.emr.crud.PatientCRUD;

// RESPONSAVEL POR GERENCIAR OS MENUS DE PACIENTES, MEDICOS E ATENDIMENTOS

public class MenuEMR extends Menu {

	public MenuEMR(String title, ArrayList<String> options) {
		super(title, options);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public byte captureOption() {

		byte opcao = super.captureOption();
		switch (opcao) {
		case 1:  
			//new MenuEMR("PATIENTS", new ArrayList<String>(Arrays.asList("Create Patient", "Read Patient","Update Patient","Delete Patient", "Details Patient"))).playMenu();
			new PatientCRUD().playMenu();
			break;
		case 2: 
			//new MenuEMR("DOCTORS", new ArrayList<String>(Arrays.asList("Create Doctor", "Read Doctor","Update Doctor","Delete Doctor", "Details Doctor"))).playMenu();
			new DoctorCRUD().playMenu();
			break;
		case 3:
			//new MenuEMR("APPOINTMENS", new ArrayList<String>(Arrays.asList("Create Appointment", "Read Appointment","Update Appointment","Delete Appointment"))).playMenu();
			new AppointmentCRUD().playMenu();
			break;
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
			break;
		}
		return opcao;
	}

}