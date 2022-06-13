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
			new PatientCRUD().playMenu();
			break;
		case 2: 
			new DoctorCRUD().playMenu();
			break;
		case 3:
			new AppointmentCRUD().playMenu();
			break;
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
			break;
		}
		return opcao;
	}
}