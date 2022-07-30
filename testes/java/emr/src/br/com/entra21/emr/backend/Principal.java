package br.com.entra21.emr.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import br.com.entra21.emr.backend.anottations.Description;
import br.com.entra21.emr.backend.anottations.Implemented;
import br.com.entra21.emr.backend.anottations.NotImplemented;
import br.com.entra21.emr.backend.login.area.MenuPrincipal;
import br.com.entra21.emr.backend.login.area.emr.crud.LoginCRUD;
import br.com.entra21.emr.backend.login.area.emr.crud.TypeUser;
import br.com.entra21.emr.backend.login.area.reports.MenuReports;
import br.com.entra21.emr.backend.models.User;

public class Principal {

	static Scanner input = new Scanner(System.in);
	private static HashMap<String, User> users = Repository.users;
	
	public static void login() {	
		byte countTry=1;
		while(!captureLogin() && countTry<4) {	//TODO - while
			if(countTry==3) {
				System.out.println("You failed to login 3 times. Exiting...");
				System.exit(0);
			} else {				
				System.out.println("Invalid Login or password! Try again!");
				countTry+=1;
			}	
		}
	}

	@Implemented //TODO - Annotation
	public static void record() {
		new LoginCRUD().playMenu();
	}

	@NotImplemented
	@Description(value = "The implemented method just lists all logins and passwords.")
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
	
	@Implemented
	@Description(value = "Validation login, for 3 wrong attempts the system shuts down..")
	public static boolean captureLogin() {	// TODO - Metodo com retorno
		boolean validLogin = false;
		try {	//TODO - Exceptions
			System.out.println("Please insert your login: ");
			String login = input.next();
			System.out.println("Please insert your password: ");
			String passwordString = input.next(); //TODO - Variaveis
			Integer password = Integer.parseInt(passwordString);	//TODO - Wrapper
			
			if(login.equals(users.get(login).getUser()) && password.equals(users.get(login).getPassword())) {	//TODO - if
				mountMenu(users.get(login).getTypeUser());
				validLogin = true;
			} else {	//TODO - else
				validLogin = false;
			}
		} catch (NullPointerException e) {
			validLogin = false;;
		}
		return validLogin;
	}
	
	
	public static void mountMenu(Enum<TypeUser> userEnum) {	//TODO - Metodo com parâmetro
		if(userEnum == TypeUser.ADMIN) {
			new MenuPrincipal("MENU PRINCIPAL", new ArrayList<String>(Arrays.asList("Electronic Medical Record", "Reports"))).playMenu();
		} else if (userEnum == TypeUser.DOCTOR) {	//TODO - else if
			new MenuPrincipal("MENU PRINCIPAL", new ArrayList<String>(Arrays.asList("Electronic Medical Record", "Reports"))).playMenu();
		} else if (userEnum == TypeUser.USER) {
			new MenuReports("REPORTS", new ArrayList<String>(Arrays.asList("Number of Patients", "Number of Appointments", "List Patients", "List Doctors"))).playMenu();
		} else {
			System.out.println("How did you get here?");
		}
	}
}
