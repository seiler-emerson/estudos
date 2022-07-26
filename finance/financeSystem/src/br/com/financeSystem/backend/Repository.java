package br.com.financeSystem.backend;

import java.time.LocalDate;
import java.util.HashMap;


import br.com.financeSystem.backend.models.Category;
import br.com.financeSystem.backend.models.Transaction;

public class Repository {

	public static HashMap<String, Transaction> transactions = new HashMap<>();
	public static Category categoryList = new Category();
	
	public static void generateTransactions() {
		
		transactions.put("001", new Transaction("001", true, LocalDate.of(2022,07,23), "Agua", categoryList.readCategory(0), "Expense", false, 42));
		transactions.put("002", new Transaction("002", true, LocalDate.of(2022,07,23), "Salario", "Necessidades Básicas", "Income", false, 1242));
		transactions.put("003", new Transaction("003", false, LocalDate.of(2022,07,23), "Mercado", "Necessidades Básicas", "Expense", false, 12));
		transactions.put("004", new Transaction("004", false, LocalDate.of(2022,07,23), "Freelancer", "Necessidades Básicas", "Income", false, 3442));
		transactions.put("005", new Transaction("005", true, LocalDate.of(2022,07,23), "Livros", categoryList.readCategory(1), "Expense", false, 102));
		transactions.put("006", new Transaction("006", true, LocalDate.of(2022,07,23), "Agua", "Necessidades Básicas", "Income", false, 142));
	}
	
	public static void generateCategory() {
		categoryList.addCategory("Gastos Fixos");
		categoryList.addCategory("Educacao");
		String teste = categoryList.readCategory(0);
//		System.out.println(teste);
	}
}