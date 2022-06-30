package br.com.banco;

public class ContaBanco {
	public short numeroConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public void abrirConta() {
		this.status = true;
		if(this.tipo.equals("cc")) {
			this.saldo += 50;
		} else {
			this.saldo += 150;
		}
	}
	
	public void fecharConta() {
		if(saldo>0) {
			System.out.println("Necessário sacar o dinheiro da conta!");
		} else if(saldo<0) {
			System.out.println("Necessario pagar o saldo devedor!");
		} else {
			System.out.println("Conta encerrada");
			this.status = false;
		}
	}
	
	public void depositar(float valor) {
		if(this.status == true) {
			this.saldo += valor;
		} else {
			System.out.println("Conta fechada, nao e possivel depositar!");
		}
	}
	
	public void sacar(float valor) {
		if(this.status == true && this.saldo > 0) {
			this.saldo -= valor;
		} else {
			System.out.println("Conta fechada, nao e possivel sacar!");
		}
	}
	
	public void pagarMensalidade() {
		if(this.tipo == "cc") {
			this.saldo -= 12;
		} else {
			this.saldo -= 20;
		}
	}
	
	public void status() {
		System.out.println("Dono:"+this.dono);
		System.out.println("Numero conta: "+this.numeroConta);
		System.out.println("Tipo conta: "+this.tipo);
		System.out.println("Aberta: "+this.status);
		System.out.println("Saldo: "+this.saldo);
	}
	
	public ContaBanco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaBanco(short numeroConta, String tipo, String dono, float saldo, boolean status) {
		super();
		this.numeroConta = numeroConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}

	public short getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(short numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo += saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
}
