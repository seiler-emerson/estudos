package br.com.entra21.emr.backend;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	private Scanner input ;
	private String title;
	private ArrayList<String> options;
	
	
	
	public Menu(String title, ArrayList<String> options) {
		super();
		this.input= new Scanner(System.in);
		this.title = title;
		this.options = options;
	}
	
	public void playMenu() {
		do {
			System.out.println("\n========================================================");
			System.out.println("\t\tMENU "+this.title);
			System.out.println("-1 = Finish System");
			System.out.println(" 0 = Return");
			
			if (options != null && !options.isEmpty()) {
				for (int count = 0; count < options.size(); count++) {
					System.out.println(" " + (count + 1) + " = " + options.get(count));
				}
			} else {
				System.out.println("Where are the items on this menu?");
			}
			System.out.println("========================================================");
			System.out.println("Select an option:");
			System.out.println("========================================================");
			
		

		} while (captureOption() != 0);
	}
	
	public byte captureOption() {
		byte option;
		option = input.nextByte();

		switch (option) {

		case -1:
			System.exit(-1);
			break;
		case 0:
			System.out.println("Menu "+ this.title+" closed");
			break;
		}
		return option;
	}

	public String getTitle() {
		return title;
	}

	public Scanner getInput() {
		return input;
	}
 
}

