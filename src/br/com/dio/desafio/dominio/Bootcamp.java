package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    // Getters e setters omitidos para brevidade

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                '}';
    }

    public void setNome(String string) {
       
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }

    public void setDescricao(String string) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setDescricao'");
    }

    public Object getConteudos() {
      
        throw new UnsupportedOperationException("Unimplemented method 'getConteudos'");
    }
}
