package br.com.financeSystem.backend.models;

import java.time.LocalDate;

public class Transaction {
	private boolean paid;
	private LocalDate datePaid;
	private String description;
	private String category;
	private String type;
	private String isCard;
	private float value;
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(boolean paid, LocalDate datePaid, String description, String category, String type,
			String isCard, float value) {
		super();
		this.paid = paid;
		this.datePaid = datePaid;
		this.description = description;
		this.category = category;
		this.type = type;
		this.isCard = isCard;
		this.value = value;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public LocalDate getDatePaid() {
		return datePaid;
	}

	public void setDatePaid(LocalDate datePaid) {
		this.datePaid = datePaid;
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

	public Number getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIsCard() {
		return isCard;
	}

	public void setIsCard(String isCard) {
		this.isCard = isCard;
	}
	
}
