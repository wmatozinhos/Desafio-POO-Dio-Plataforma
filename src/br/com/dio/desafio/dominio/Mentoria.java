package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {



    private LocalDate date;


    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_Padrao + 20d;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "descricao='" + getDescricao() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", Data=" + getDate() +
                '}';
    }
}
