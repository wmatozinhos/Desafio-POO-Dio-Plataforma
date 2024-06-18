import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());


        Quiz quiz = new Quiz();
        quiz.setTitulo("Quiz de Java");
        quiz.setDescricao("Quiz para testar conhecimentos em Java");
        quiz.setNumPerguntas(10);
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descriçao Bootcamp java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(quiz);

        Dev dev = new Dev();
        dev.setNome("Tallia");
        dev.inscreverBootcamp(bootcamp);

        dev.progredir();
        dev.progredir();
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("Conteudos inscritos: " + dev.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + dev.getConteudoConcluidos());


        System.out.println("Conteudos Concluidos: " + dev.getConteudoConcluidos());
//
//        Dev jessi = new Dev();
//        dev.setNome("jessi");
//        jessi.inscreverBootcamp(bootcamp);
//        jessi.progredir();
//        jessi.progredir();
//        System.out.println("Conteudos inscritos: " + jessi.getConteudoInscritos());
//        System.out.println("Conteudos Concluidos: " + jessi.getConteudoConcluidos());
//        System.out.println("Xps Jessi:: " + jessi.calcularTotalXp());







    }
}