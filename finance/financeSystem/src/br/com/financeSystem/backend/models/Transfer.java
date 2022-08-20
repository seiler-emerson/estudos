package br.com.financeSystem.backend.models;

import java.time.LocalDate;

public class Transfer {
	
	private LocalDate dateTransfer;
	private String originAccount;
	private String destinyAccount;
	
	public Transfer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transfer(LocalDate dateTransfer, String originAccount, String destinyAccount) {
		super();
		this.dateTransfer = dateTransfer;
		this.originAccount = originAccount;
		this.destinyAccount = destinyAccount;
	}

	public LocalDate getDateTransfer() {
		return dateTransfer;
	}

	public void setDateTransfer(LocalDate dateTransfer) {
		this.dateTransfer = dateTransfer;
	}

	public String getOriginAccount() {
		return originAccount;
	}

	public void setOriginAccount(String originAccount) {
		this.originAccount = originAccount;
	}

	public String getDestinyAccount() {
		return destinyAccount;
	}

	public void setDestinyAccount(String destinyAccount) {
		this.destinyAccount = destinyAccount;
	}
	
	
}
