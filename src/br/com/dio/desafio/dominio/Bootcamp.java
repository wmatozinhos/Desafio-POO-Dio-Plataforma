package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(LocalDate dataInicial, LocalDate dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public void inscreverDev(Dev dev) {
        Deque<Dev> devsInscritos = null;
        if (!devsInscritos.contains(dev)) {
            devsInscritos.add(dev);
            dev.inscreverBootcamp(this);
        }
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public boolean validarDatas() {
        return dataFinal.isAfter(dataInicial);
    }

    public void setNome(String bootcampJavaDeveloper) {
    }

    public void setDescricao(String s) {
    }

    public void setDataInicial(LocalDate now) {
    }

    public void setDataFinal(LocalDate localDate) {
    }
}

