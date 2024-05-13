package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private final Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            conteudosInscritos.remove(conteudo);
            conteudosConcluidos.add(conteudo);
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void setNome(String camila) {
    }

    public String calcularTotalXp() {
        return "";
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
    }

}