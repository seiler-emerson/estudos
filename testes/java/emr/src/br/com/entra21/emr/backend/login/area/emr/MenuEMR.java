package br.com.entra21.emr.backend.login.area.emr;

import java.util.ArrayList;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.anottations.Description;
import br.com.entra21.emr.backend.anottations.Implemented;
import br.com.entra21.emr.backend.login.area.emr.crud.AppointmentCRUD;
import br.com.entra21.emr.backend.login.area.emr.crud.DoctorCRUD;
import br.com.entra21.emr.backend.login.area.emr.crud.PatientCRUD;

@Implemented
@Description(value = "Responsible for managing the menus of patients, doctors and appointments.")
public class MenuEMR extends Menu {

	public MenuEMR(String title, ArrayList<String> options) {
		super(title, options);
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