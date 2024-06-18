package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;


    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_Padrao * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cragaHoraria) {
        this.cargaHoraria = cragaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" +getTitulo() + '\'' +
                ", descricao='" +getDescricao() + '\'' +
                ", cargaHoraria=" +getCargaHoraria() +
                '}';
    }


}
