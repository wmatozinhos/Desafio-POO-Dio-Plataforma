package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{

    private int cargaHoraria;

    private Certificado certificado;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public void finalizar(Dev dev) {
        dev.getCertificados().add(certificado);
        certificado.getDevs().add(dev);
    }

    public Curso() {
        certificado = new Certificado(this, LocalDate.now());
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
