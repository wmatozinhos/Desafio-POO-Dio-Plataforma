package Model;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return super.toString() + " | Data: " + data;
	}

	@Override
	public double calcularXP() { return XP_PADRAO + 20; }
	
	
	
	
	
}
