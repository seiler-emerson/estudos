package br.com.financeSystem.backend.models;

import java.time.LocalDate;

public class Transaction { 
	private boolean paid;
	private LocalDate datePayment;
	private String description;
	private String category;
	private String account;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(boolean paid, LocalDate datePayment, String description, String category, String account) {
		super();
		this.paid = paid;
		this.datePayment = datePayment;
		this.description = description;
		this.category = category;
		this.account = account;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public LocalDate getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(LocalDate datePayment) {
		this.datePayment = datePayment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	
	
}
