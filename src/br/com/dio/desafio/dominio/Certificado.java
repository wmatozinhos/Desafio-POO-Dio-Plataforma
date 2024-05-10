package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Certificado {
    private LocalDate dataConclusao;
    private Curso curso;
    private Set<Dev> devs = new LinkedHashSet<>();;

    public Certificado() {
    }

    public Certificado(Curso curso, LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
        this.curso = curso;
    }

    public Certificado(Curso curso, LocalDate dataConclusao, Set<Dev> devs) {
        this.dataConclusao = dataConclusao;
        this.curso = curso;
        this.devs = devs;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Certificado)) return false;
        Certificado that = (Certificado) o;
        return Objects.equals(dataConclusao, that.dataConclusao) && Objects.equals(curso, that.curso) && Objects.equals(devs, that.devs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataConclusao, curso, devs);
    }

    @Override
    public String toString() {
        return "Certificado{" +
                "dataConclusao=" + dataConclusao +
                ", curso=" + curso +
                '}';
    }
}
