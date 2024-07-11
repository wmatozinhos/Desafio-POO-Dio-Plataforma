package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        setModulos(this.cargaHoraria);
    }

    /*@Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }*/

    @Override
    protected void setModulos(int modulos) {
        super.modulos = modulos/2;
    }

    @Override
    public String toString() {
        return "\nCarga horaria: " + getCargaHoraria() + "\nTitulo: " + getTitulo()
                + "\nDescrição: " + getDescricao() + "\nModulos: " + getModulos()
                + "\nCarga horaria Concluida: " + getCargaHorariaConcluida() + "\n\n";
    }

    
}
