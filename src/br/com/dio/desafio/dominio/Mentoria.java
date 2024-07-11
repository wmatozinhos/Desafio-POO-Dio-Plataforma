package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private int cargaHoraria;
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        setModulos(this.cargaHoraria);
    }

    @Override
    public String toString() {
        return 
                "\nTitulo: " + getTitulo() + 
                "\nDescrição: " + getDescricao() + 
                "\nData: " + data +
                '\n';
    }

    @Override
    protected void setModulos(int modulos) {
        super.modulos = modulos/2;
    }
}
