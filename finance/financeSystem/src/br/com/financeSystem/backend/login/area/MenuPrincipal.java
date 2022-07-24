package br.com.financeSystem.backend.login.area;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.financeSystem.backend.Menu;
import br.com.financeSystem.backend.login.area.finance.MenuFinance;
import br.com.financeSystem.backend.login.area.reports.MenuReports;

public class MenuPrincipal extends Menu{
	
	public MenuPrincipal(String title, ArrayList<String>options) {
		super(title, options);
	}
	
	@Override
	public String captureOption() {
		
		String option = super.captureOption();
		switch (option) {
		case "1":
			new MenuFinance("System Finance", new ArrayList<String>(Arrays.asList("Transaction"))).playMenu();
			break;
		case "2":
			new MenuReports("Reports Balance", new ArrayList<String>(Arrays.asList("Incomes","Expenses","Balance"))).playMenu();
			break;
		default:
			System.out.println("Select a valid option"+super.getTitle());
			break;
		}
		return option;
	}
}
