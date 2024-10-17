import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do curso de java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println("\n Detalhes do curso 1: " +curso1);
        System.out.println("\n Detalhes do curso 2: "+ curso2);
        System.out.println("\n Detalhes da Mentoria: "+mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("\n-------------------------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-/-");
        System.out.println("Conteúdos INSCRITOS Camila:" + devCamila.getConteudosInscritos());
        System.out.println("-/-");
        System.out.println("Conteúdos CONCLUIDOS Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("\n-------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos INSCRITOS João:" + devJoao.getConteudosInscritos());
        System.out.println("-/-");
        System.out.println("Conteúdos CONCLUIDOS João:" + devJoao.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("\n-------------------------------------------------------------");

        Dev devRorras = new Dev();
        devRorras.setNome("Rorras");
        devRorras.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rorras:" + devRorras.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos CONCLUIDOS Rorras:" + devRorras.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP:" + devRorras.calcularTotalXp());

    }

}
