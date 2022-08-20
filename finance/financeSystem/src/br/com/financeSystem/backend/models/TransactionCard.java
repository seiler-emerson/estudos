package br.com.financeSystem.backend.models;

import java.time.LocalDate;

public class TransactionCard extends Transaction{
	
	private float value;
	private String card;
	private String invoiceCard;
	public TransactionCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionCard(boolean paid, LocalDate datePayment, String description, String category, String account, float value, String card, String invoiceCard) {
		super(paid, datePayment, description, category, account);
		// TODO Auto-generated constructor stub
	}
	public TransactionCard(float value, String card, String invoiceCard) {
		super();
		this.value = value;
		this.card = card;
		this.invoiceCard = invoiceCard;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getInvoiceCard() {
		return invoiceCard;
	}
	public void setInvoiceCard(String invoiceCard) {
		this.invoiceCard = invoiceCard;
	}
	
	
	
}
