import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Aprenda os fundamentos da programação em Java.");
        cursoJava.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso de JavaScript");
        cursoJS.setDescricao("Introdução ao JavaScript e conceitos de programação web.");
        cursoJS.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Sessão de dúvidas ao vivo sobre Java.");
        mentoriaJava.setData(LocalDate.now().plusDays(10));

        Mentoria mentoriaJS = new Mentoria();
        mentoriaJS.setTitulo("Mentoria de JavaScript");
        mentoriaJS.setDescricao("Sessão de dúvidas ao vivo sobre JavaScript.");
        mentoriaJS.setData(LocalDate.now().plusDays(20));

        LocalDate dataInicial = LocalDate.now();
        LocalDate dataFinal = LocalDate.now().plusDays(45);

        Bootcamp bootcamp = new Bootcamp(dataInicial, dataFinal);
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprofunde-se em Java e JavaScript com um programa intensivo.");
        bootcamp.setDataInicial(LocalDate.now());
        bootcamp.setDataFinal(LocalDate.now().plusDays(45));

        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoJS);
        bootcamp.adicionarConteudo(mentoriaJava);
        bootcamp.adicionarConteudo(mentoriaJS);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}

