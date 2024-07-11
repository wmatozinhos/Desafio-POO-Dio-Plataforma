package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    protected int modulos;
    protected int cargaHorariaConcluida = 0;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

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

    public int getModulos() {
        return modulos;
    }

    protected abstract void setModulos(int modulos);

    public int getCargaHorariaConcluida() {
        return cargaHorariaConcluida;
    }

    public void setCargaHorariaConcluida() {
        this.cargaHorariaConcluida +=2;
    }

    public Boolean isCargaHorariaConcluida(int cargaHoraria ){
        if ( ((cargaHoraria > 0)) & cargaHoraria == this.cargaHorariaConcluida)
            return true;
        return false;
    }
}
