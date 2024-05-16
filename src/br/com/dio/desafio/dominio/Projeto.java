package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Projeto {
    private String nome;
    private String descricao;
    private Set<String> tecnologias = new LinkedHashSet<>();
    private List<Dev> membros = new ArrayList<>();

    public void adicionarProjeto(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarMembros(Dev dev){
        membros.add(dev);
    }
    
    public void removerMembros(Dev dev){
        membros.remove(dev);
    }

    public void adicionarTec(String tech){
        tecnologias.add(tech);
    }

    public void removeTec(String tech){
        tecnologias.remove(tech);
    }

    public int obterNumeroMembros(){
       return membros.size();
    }

    public void obterTecnologiasUtilizadas(){
        System.out.println(tecnologias);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public List<Dev> getMembros() {
        return membros;
    }
    
    public void setMembros(List<Dev> membros) {
        this.membros = membros;
    }

    public Set<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(Set<String> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
