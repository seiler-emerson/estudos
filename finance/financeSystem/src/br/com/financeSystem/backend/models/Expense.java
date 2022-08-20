package br.com.financeSystem.backend.models;

import java.time.LocalDate;

public class Expense extends Transaction {

	private float value;

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expense(boolean paid, LocalDate datePayment, String description, String category, String account, float value) {
		super(paid, datePayment, description, category, account);
		// TODO Auto-generated constructor stub
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	
}
