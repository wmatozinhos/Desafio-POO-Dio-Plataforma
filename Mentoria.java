package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    // Implementação do método abstrato
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; // XP adicional para mentoria
    }

    // Getters e Setters
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}