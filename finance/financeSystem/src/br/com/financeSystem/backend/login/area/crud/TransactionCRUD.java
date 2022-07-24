package br.com.financeSystem.backend.login.area.crud;

import java.time.LocalDate;
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
			create();
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
		Transaction newTransaction = captureValues();
		if(search(newTransaction) == null) {
			transactions.put(newTransaction.getKey(), newTransaction);
		} else {
			System.out.println("Essa transação ja foi registrada.");
		}
		
	}

	@Override
	public Transaction search(Transaction key) {
		return transactions.get(key.getKey());
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
		Transaction transaction = new Transaction();
		System.out.println("Digite a chave");
		transaction.setKey(getInput().nextLine());
		transaction.setKey(getInput().nextLine());
		
		System.out.println("Foi pago? 1 = pago | 2 = não pago");
		byte option = getInput().nextByte();
		switch (option) {
		case 1:
			transaction.setPaid(true);
			break;
		case 2:
			transaction.setPaid(false);
			break;
		default:
			System.out.println("Invalid Option");;
		}
		
		System.out.println("Digite a data do pagamento: Formato yyyy-mm-dd");
		transaction.setDatePaid(LocalDate.parse(getInput().next()));
		
		System.out.println("Digite a descrição do pagamento:");
		transaction.setDescription(getInput().nextLine());
		transaction.setDescription(getInput().nextLine());
		
		System.out.println("Digite a categoria");
		transaction.setDescription(getInput().nextLine());
		
		System.out.println("Income/Expense");
		transaction.setType(getInput().nextLine());
		
		System.out.println("Compra no cartão? Qual? ");
		transaction.setType(getInput().nextLine());
		
		System.out.println("Valor");
		transaction.setValue(getInput().nextFloat());
		
		
		return transaction;
	}

	@Override
	public void details(Transaction complete) {
		// TODO Auto-generated method stub
		
	}

}
