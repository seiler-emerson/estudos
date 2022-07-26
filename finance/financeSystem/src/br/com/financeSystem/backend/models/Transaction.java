package br.com.financeSystem.backend.models;

import java.time.LocalDate;

public class Transaction {
	private String key; 
	private boolean paid;
	private LocalDate datePaid;
	private String description;
	private String category;
	private String type;
	private boolean isCard;
//	private String card;
	private float value;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(String key, boolean paid, LocalDate datePaid, String description, String category, String type,
			boolean isCard, float value) {
		super();
		this.key = key;
		this.paid = paid;
		this.datePaid = datePaid;
		this.description = description;
		this.category = category;
		this.type = type;
		this.isCard = isCard;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
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

	public boolean getIsCard() {
		return isCard;
	}

	public void setIsCard(boolean isCard) {
		this.isCard = isCard;
	}
	
}
