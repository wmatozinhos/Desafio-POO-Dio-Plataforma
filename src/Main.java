import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

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
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
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
        System.out.println("-");

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
        System.out.println("-");

        System.out.println("Curso: " + curso1.getTitulo());
        System.out.println("Carga horária: " + curso1.getCargaHoraria() + " horas");
        System.out.println("XP ganho com o curso: " + curso1.calcularXP());
        System.out.println("-");

        System.out.println("Curso: " + curso2.getTitulo());
        System.out.println("Carga horária: " + curso2.getCargaHoraria() + " horas");
        System.out.println("XP ganho com o curso: " + curso2.calcularXP());
        System.out.println("-");

        System.out.println(mentoria.getTitulo());
        System.out.println("Data de início da mentoria: " + mentoria.getData());
        System.out.println("XP ganho com a mentoria: " + mentoria.calcularXP());
        System.out.println("-");

        System.out.println(bootcamp.getNome());
        System.out.println("Início do bootcamp: " + bootcamp.getDataInicial());
        System.out.println("Prazo final para conclusão do bootcamp: " + bootcamp.getDataFinal());
        System.out.println("Devs inscritos: " + devJoao.getNome() + " e " + devCamila.getNome());
        System.out.println("Cursos oferecidos: " + bootcamp.getConteudos());
    }
}
