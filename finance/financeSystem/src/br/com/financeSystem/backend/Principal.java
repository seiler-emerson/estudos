package br.com.financeSystem.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.financeSystem.backend.login.area.MenuPrincipal;

public class Principal {

	static Scanner input = new Scanner(System.in);
	
	public static void login() {
		new MenuPrincipal("MENU PRINCIPAL", new ArrayList<String>(Arrays.asList("Finance System"))).playMenu();
	}
	
	
}