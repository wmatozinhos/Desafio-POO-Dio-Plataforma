package Model;

public class Curso extends Conteudo{

	private int cargaHoraria;

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return super.toString() + " | Carga Horária:" + cargaHoraria;
	}

	@Override
	public double calcularXP() { return XP_PADRAO * cargaHoraria; }
  	
	
	
	
	
}
