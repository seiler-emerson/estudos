package br.com.financeSystem.backend.login.area.finance;

import java.util.ArrayList;

import br.com.financeSystem.backend.Menu;
import br.com.financeSystem.backend.login.area.crud.TransactionCRUD;

public class MenuFinance extends Menu {
	
	public MenuFinance(String title, ArrayList<String> options) {
		super(title, options);
	}
	
	@Override
	public String captureOption() {
		
		String option = super.captureOption();
		switch (option) {
		case "1":
			new TransactionCRUD().playMenu();
			break;
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
		}
		return option;
	}
}