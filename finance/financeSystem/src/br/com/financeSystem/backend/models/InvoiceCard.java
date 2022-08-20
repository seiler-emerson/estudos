package br.com.financeSystem.backend.models;

import java.util.ArrayList;

public class InvoiceCard {
	public ArrayList<TransactionCard> transactions;
	public String card;
	
	public InvoiceCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceCard(ArrayList<TransactionCard> transactions, String card) {
		super();
		this.transactions = transactions;
		this.card = card;
	}

	public ArrayList<TransactionCard> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<TransactionCard> transactions) {
		this.transactions = transactions;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}
	
	
	
}
