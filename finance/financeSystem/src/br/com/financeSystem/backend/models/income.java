package br.com.financeSystem.backend.models;

import java.time.LocalDate;

public class income extends Transaction {

	private float value;

	public income() {
		super();
		// TODO Auto-generated constructor stub
	}

	public income(boolean paid, LocalDate datePayment, String description, String category, String account, float value) {
		super(paid, datePayment, description, category, account);
		// TODO Auto-generated constructor stub
	}

	public income(float value) {
		super();
		this.value = value;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}


	
	
}
