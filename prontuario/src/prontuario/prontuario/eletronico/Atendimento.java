package prontuario.prontuario.eletronico;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {
	private String anamnese;
	private String receituario;
	private String atestado;
	private String encaminhamento;
	private String alta;
	private LocalDate data;
	private LocalTime hora;
	
	public Atendimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Atendimento(String anamnese, String receituario, String atestado, String encaminhamento, String alta,
			LocalDate data, LocalTime hora) {
		super();
		this.anamnese = anamnese;
		this.receituario = receituario;
		this.atestado = atestado;
		this.encaminhamento = encaminhamento;
		this.alta = alta;
		this.data = data;
		this.hora = hora;
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

	public String getAtestado() {
		return atestado;
	}

	public void setAtestado(String atestado) {
		this.atestado = atestado;
	}

	public String getEncaminhamento() {
		return encaminhamento;
	}

	public void setEncaminhamento(String encaminhamento) {
		this.encaminhamento = encaminhamento;
	}

	public String getAlta() {
		return alta;
	}

	public void setAlta(String alta) {
		this.alta = alta;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	
	
	
	
}
