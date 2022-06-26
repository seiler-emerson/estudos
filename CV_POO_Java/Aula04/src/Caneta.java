
public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta() {
		this.tampar();
		this.cor = "Azul";
	}
	public Caneta(String modelo, String cor, float ponta) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Cor: "+this.cor);
		System.out.println("Tampada: "+this.tampada);
	}
	
}
	
