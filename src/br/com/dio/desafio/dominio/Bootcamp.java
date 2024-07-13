package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private final String nome;
    private final String descricao;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private final Set<Dev> devsInscritos = new HashSet<>();
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    // Construtor para inicializar 'nome' e 'descricao'
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return nome.equals(bootcamp.nome) &&
                descricao.equals(bootcamp.descricao) &&
                dataInicial.equals(bootcamp.dataInicial) &&
                dataFinal.equals(bootcamp.dataFinal) &&
                devsInscritos.equals(bootcamp.devsInscritos) &&
                conteudos.equals(bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", devsInscritos=" + devsInscritos +
                ", conteudos=" + conteudos +
                '}';
    }

    // Adiciona um Dev ao Bootcamp
    public void adicionarDev(Dev dev) {
        devsInscritos.add(dev);
    }

    // Remove um Dev do Bootcamp
    public void removerDev(Dev dev) {
        devsInscritos.remove(dev);
    }

    // Adiciona um Conteúdo ao Bootcamp
    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    // Remove um Conteúdo do Bootcamp
    public void removerConteudo(Conteudo conteudo) {
        conteudos.remove(conteudo);
    }
}
