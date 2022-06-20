package br.com.entra21.emr.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import br.com.entra21.emr.backend.anottations.NotImplemented;
import br.com.entra21.emr.backend.login.area.MenuPrincipal;
import br.com.entra21.emr.backend.login.area.emr.crud.LoginCRUD;
import br.com.entra21.emr.backend.models.User;

public class Principal {

	static Scanner input = new Scanner(System.in);
	private static HashMap<String, User> users = Repository.users;
	
	public static void login() {	
		byte countTry=0;
		
		while(!captureLogin() && countTry<=3) {
			System.out.println("Invalid Login or password! Try again!");
			countTry+=1;
			captureLogin();
		}
		if(countTry>3) {
			System.out.println("You failed to login 3 times. Exiting...");
			System.exit(1);
		}
		
		
//		if(isValidLogin && countTry<=3) {
//			System.out.println("LOGIN REALIZADO");
//		} else if (!isValidLogin && countTry<=3) {
//			System.out.println("Invalid Login or password! Try again!");
//			countTry+=1;
//		} else {
//			System.out.println("You failed to login 3 times. Exiting...");
//			System.exit(1);
//		}
		
		
		
		
		//new MenuPrincipal("MENU PRINCIPAL", new ArrayList<String>(Arrays.asList("Electronic Medical Record", "Reports"))).playMenu();
	}

	@NotImplemented
	public static void record() {
		new LoginCRUD().playMenu();
	}

	@NotImplemented
	public static void recoverPassword() {
		new LoginCRUD().details(users);
	}

	public static void viewAboutInfo() {
		System.out.println("\n========================================================");
		System.out.println("==================== ABOUT PROJECT =====================\n");
		System.out.println("Project developed by the TEAM VERMELHO");
		System.out.println("About the project");
		System.out.println("\tIt is a system used to manage the attendance of a clinic.");
		System.out.println("\tIt has functionalities to manage patients with their");
		System.out.println("\trespective medical records, which in turn store their attendances.\n");
	}
	
	public static boolean captureLogin() {
		boolean validLogin = false;
		
		System.out.println("Please insert your login: ");
		String login = input.next();
		System.out.println("Please insert your password: ");
		String passwordString = input.next();
		Integer password = Integer.parseInt(passwordString);
		if(login.equals(users.get(login).getUser()) && password.equals(users.get(login).getPassword())) {
			System.out.println("ENTROU!");
			validLogin = true;
		} else {
			validLogin = false;
		}
		return validLogin;
	}
}
