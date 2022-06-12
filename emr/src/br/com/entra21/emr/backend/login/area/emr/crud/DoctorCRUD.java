package br.com.entra21.emr.backend.login.area.emr.crud;




import java.util.HashMap;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.Repository;
import br.com.entra21.emr.backend.models.Doctor;

public class DoctorCRUD extends Menu implements ICrud<Doctor> {

	private HashMap<String, Doctor> doctors = Repository.doctors;
	
	public DoctorCRUD() {
		super("DOCTOR", options);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public byte captureOption() {

		byte opcao = super.captureOption();
		switch (opcao) {
		case 1:
			// CREATE
			System.out.println("criando");
			break;
		case 2:
			// READ
			break;
		case 3:
			// UPDATE
			break;
		case 4:
			// DETELE
			break;
		case 5:
			// DETAILS
			break;
		default:
			System.out.println("Opção inválida para o menu de " + super.getTitle());
			break;
		}
		return opcao;
	}

	@Override
	public void list(HashMap<String, Doctor> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Doctor search(Doctor key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Doctor key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Doctor key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Doctor captureKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor captureValues() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void details(HashMap<String, Doctor> doctors) {
		
	}
	

}
