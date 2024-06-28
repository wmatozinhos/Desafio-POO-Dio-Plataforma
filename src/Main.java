import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Description Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Description JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java Mentor");
        mentoria.setDescricao("Description Mentor");
        mentoria.setData(LocalDate.now());

        LivesYouTube live1 = new LivesYouTube();
        live1.setTitulo("Live Java Polimorfismo");
        live1.setDescricao("descrição live java polimorfismo");
        live1.setPresentaMarcada(8);

        LivesYouTube live2 = new LivesYouTube();
        live2.setTitulo("Live Java Herança");
        live2.setDescricao("descrição live java herança");
        live2.setPresentaMarcada(8);

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(live1);
        bootcamp.getConteudos().add(live2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");

        Dev devCedric = new Dev();
        devCedric.setNome("Cedric");
        devCedric.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cedric:" + devCedric.getConteudosInscritos());
        devCedric.progredir();
        devCedric.progredir();
        devCedric.progredir();
        devCedric.progredir();
        devCedric.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos devCedric:" + devCedric.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos devCedric:" + devCedric.getConteudosConcluidos());
        System.out.println("XP:" + devCedric.calcularTotalXp());

    }

}
