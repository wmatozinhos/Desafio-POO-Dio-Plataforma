package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
        } else {
            throw new IllegalArgumentException("Carga horária deve ser positiva.");
        }
    }

    @Override
    public double calcularXp() {
        return 0;
    }
}
