package br.com.financeSystem.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);
	private static ArrayList<String> options;
	
	public static void main(String[] args) {
		
		String option;
		do {		
			System.out.println(displayMenu());
			
//			Metode for generate Database
			Repository.generateCategory();
			Repository.generateTransactions();
			
			option = input.next();
			
			switch(option) {
			case "0":
				System.out.println("Exiting...");
				break;
			case "1":
				Principal.login();
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}
		} while (!option.equals("0"));
		System.out.println("Bye bye...");
		
	}
	
	private static String displayMenu() {
		
		if(options == null) {
			options = new ArrayList<>(Arrays.asList("Login"));
		}
		
		String menu = "========================================================";
		menu += "\n========================================================";
		menu += "\nWelcome to Finance System";
		menu += "\n\t0 - Exit";
		for (int option = 0; option < options.size(); option++) {
			menu += "\n\t"+(option+1)+" - "+options.get(option);
		} 
		menu += "\n========================================================";
		menu += "\nSelect an option: ";
		menu += "\n========================================================";

		return menu;
	}
		
	

}
