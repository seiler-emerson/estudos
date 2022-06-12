package br.com.entra21.emr.backend;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.entra21.emr.backend.anottations.NotImplemented;
import br.com.entra21.emr.backend.login.area.MenuPrincipal;

public class Principal {

	public static void login() {
		new MenuPrincipal("MENU PRINCIPAL", new ArrayList<String>(Arrays.asList("Electronic Medical Record", "Reports"))).playMenu();
	}

	@NotImplemented
	public static void record() {
		// CADASTRO DE USUARIOS 
	}

	@NotImplemented
	public static void recoverPassword() {
		//RECUPERACAO DE SENHA DE USUARIO
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
}
