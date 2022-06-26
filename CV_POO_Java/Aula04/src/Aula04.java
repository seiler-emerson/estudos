
public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.setModelo("BIC");
		c1.setPonta(0.5f);
		c1.status();

		System.out.println("Tenho uma caneta "+ c1.getModelo()+" de ponta "+c1.getPonta());
	
		Caneta c2 = new Caneta("NIC", "Amarela", 0.8f);
		c2.status();

		System.out.println("Tenho uma caneta "+ c2.getModelo()+" de ponta "+c2.getPonta());
	
		
		Caneta c3 = new Caneta("VIC", "Verde", 1.5f);
		c3.status();

		System.out.println("Tenho uma caneta "+ c3.getModelo()+" de ponta "+c3.getPonta());
	
	
	}

}
