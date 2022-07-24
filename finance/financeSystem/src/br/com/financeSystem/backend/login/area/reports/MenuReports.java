package br.com.financeSystem.backend.login.area.reports;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.financeSystem.backend.Menu;
import br.com.financeSystem.backend.login.area.finance.MenuFinance;

public class MenuReports extends Menu {
	
	
	public MenuReports(String title, ArrayList<String> options ) {
		super(title, options);
	}
	
	@Override
	public String captureOption() {
		
		String option = super.captureOption();
		switch (option) {
		case "1":
			
			break;
		case "2":
			
			break;
		default:
			System.out.println("Select a valid option"+super.getTitle());
			break;
		}
		return option;
	}
}
