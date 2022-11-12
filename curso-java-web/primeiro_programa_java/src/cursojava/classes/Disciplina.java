package cursojava.classes;

import java.util.Objects;

public class Disciplina {

	private double nota;
	private String disciplaina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplaina() {
		return disciplaina;
	}

	public void setDisciplaina(String disciplaina) {
		this.disciplaina = disciplaina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplaina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplaina, other.disciplaina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplaina=" + disciplaina + "]";
	}
}
