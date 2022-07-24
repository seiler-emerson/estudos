package br.com.financeSystem.backend.login.area.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.financeSystem.backend.Menu;
import br.com.financeSystem.backend.Repository;
import br.com.financeSystem.backend.models.Transaction;

public class TransactionCRUD extends Menu implements ICrud<Transaction>{

	private HashMap<String, Transaction> transactions = Repository.transactions;
	private static ArrayList<String> options = new ArrayList<String>(Arrays.asList("Add Transaction", "List Transaction", "Update Transaction", "Delete Transaction", "Details Transaction"));
	
	public TransactionCRUD() {
		super("TRANSACTIONS", options);
		// TODO Auto-generated constructor stub
	}

	public String captureOption() {
		
		String option = super.captureOption();
		switch (option) {
		case "1":
			System.out.println("ADD TRANSACTION");
			break;
		case "2":
			System.out.println("LIST TRANSACTION");
			list(transactions);
			break;
		case "3":
			System.out.println("UPDATE TRANSACTION");
			break;
		case "4":
			System.out.println("DELETE TRANSACTION");
			break;
		case "5":
			System.out.println("DETAILING TRANSACTION");
			break;
		default:
			System.out.println("Select a valid option for menu "+ super.getTitle());
		}
		return option;
	}
	
	
	@Override
	public void list(HashMap<String, Transaction> transactions) {
		System.out.println("========================================================");
		System.out.println("Transaction List");
		System.out.println("\t Paid? - 		Date - Description - Category - Type - Value");
		for (Transaction transaction : transactions.values()) {
			System.out.println("\t "+transaction.isPaid()+ " - "+transaction.getDatePaid()+ " - "+transaction.getDescription()+ " - "+transaction.getCategory()+ " - "+transaction.getType()+ " - R$ "+transaction.getValue());
		}
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction search(Transaction key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Transaction key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Transaction key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction captureKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction captureValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void details(Transaction complete) {
		// TODO Auto-generated method stub
		
	}

}
