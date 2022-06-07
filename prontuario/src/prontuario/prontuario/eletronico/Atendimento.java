package prontuario.prontuario.eletronico;

public class Atendimento {
	private String anamnese;
	private String receituario;
	private String documentos;
	private String alta;
	
	public Atendimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Atendimento(String anamnese, String receituario, String documentos, String alta) {
		super();
		this.anamnese = anamnese;
		this.receituario = receituario;
		this.documentos = documentos;
		this.alta = alta;
	}

	public String getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(String anamnese) {
		this.anamnese = anamnese;
	}

	public String getReceituario() {
		return receituario;
	}

	public void setReceituario(String receituario) {
		this.receituario = receituario;
	}


	public String getDocumentos() {
		return documentos;
	}



	public void setDocumentos(String documentos) {
		this.documentos = documentos;
	}



	public String getAlta() {
		return alta;
	}



	public void setAlta(String alta) {
		this.alta = alta;
	}
	
	
	
	
}
