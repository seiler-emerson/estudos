package br.com.financeSystem.backend;

import java.time.LocalDate;
import java.util.HashMap;

import br.com.financeSystem.backend.models.Transaction;

public class Repository {

	public static HashMap<String, Transaction> transactions = new HashMap<>();
	
	public static void generateTransactions() {
		transactions.put("001", new Transaction("001", true, LocalDate.of(2022,07,23), "Agua", "Necessidades Básicas", "Expense", "Cartao", 42));
		transactions.put("002", new Transaction("002", true, LocalDate.of(2022,07,23), "Salario", "Necessidades Básicas", "Income", "-", 1242));
		transactions.put("003", new Transaction("003", false, LocalDate.of(2022,07,23), "Mercado", "Necessidades Básicas", "Expense", "-", 12));
		transactions.put("004", new Transaction("004", false, LocalDate.of(2022,07,23), "Freelancer", "Necessidades Básicas", "Income", "-", 3442));
		transactions.put("005", new Transaction("005", true, LocalDate.of(2022,07,23), "Energia", "Necessidades Básicas", "Expense", "Cartao", 102));
		transactions.put("006", new Transaction("006", true, LocalDate.of(2022,07,23), "Agua", "Necessidades Básicas", "Income", "-", 142));
	}
}
