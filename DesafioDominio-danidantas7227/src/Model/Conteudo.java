package Model;

public abstract class Conteudo {

	private String titulo, descricao;
	protected static final double XP_PADRAO = 10;
	
	
	public Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public abstract double calcularXP();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + " | Descrição: " + descricao;
	}
	
	
	
}
