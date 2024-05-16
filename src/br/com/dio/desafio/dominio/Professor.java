package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {
    private String nome;
    private String stack;
    private Set<Curso> cursosPalestrados = new LinkedHashSet<>();
    private Set<Mentoria> mentoriasPalestradas = new LinkedHashSet<>();

    public Professor(String nome, String stack) {
        this.nome = nome;
        this.stack = stack;
        this.cursosPalestrados = new LinkedHashSet<>();
        this.mentoriasPalestradas = new LinkedHashSet<>();
    }

    public void adicionarCurso(Curso curso){
        cursosPalestrados.add(curso);
    }

    public void removerCurso(Curso curso){
        cursosPalestrados.remove(curso);
    }

    public void adicionarMentoria(Mentoria mentoria){
        mentoriasPalestradas.add(mentoria);
    }

    public void removerMentoria(Mentoria mentoria){
        mentoriasPalestradas.remove(mentoria);
    }
    
    public void exibirCursosPalestrados(){
        System.out.println(cursosPalestrados);
    }

    public void exibirMentoriasPalestradas(){
        System.out.println(mentoriasPalestradas);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Set<Curso> getCursosPalestrados() {
        return cursosPalestrados;
    }

    public void setCursosPalestrados(Set<Curso> cursosPalestrados) {
        this.cursosPalestrados = cursosPalestrados;
    }

    public Set<Mentoria> getMentoriasPalestradas() {
        return mentoriasPalestradas;
    }

    public void setMentoriasPalestradas(Set<Mentoria> mentoriasPalestradas) {
        this.mentoriasPalestradas = mentoriasPalestradas;
    }
}
