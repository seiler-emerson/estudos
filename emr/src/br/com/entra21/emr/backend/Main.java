package br.com.entra21.emr.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<String> options;
	
	public static void main(String[] args) {
		
		Repository.generateDataBase();

		
		byte option;
		do {
			System.out.println(displayMenu());
			Repository.generateDataBase();  //metodo gerador de dados
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Exiting...");
				break;
			case 1: 
				Principal.login();
				
				break;
			case 2: 
				// METODO DE CADASTRO DE NOVOS USUARIOS
				break;
			case 3: 
				// METODO DE RECUPERACAO DE SENHA
				break;
			case 4: 
				Principal.viewAboutInfo();
				break; 
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);
		System.out.println("Thanks! ");

	}

	private static String displayMenu() {
		
		if(options==null) {
			options = new ArrayList<>(Arrays.asList("Login","Record User","I forgot my password","About"));
			
		}
		
 
		String menu = "========================================================";
		menu += "\n========================================================";
		menu += "\nWelcome to Electronic Medical Record";
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



