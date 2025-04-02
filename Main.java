import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Cursos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Aprenda Java do zero.");
        cursoJava.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso de JavaScript");
        cursoJS.setDescricao("Aprenda JavaScript do zero.");
        cursoJS.setCargaHoraria(4);

        // Criando Mentoria
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Tire suas dúvidas sobre Java.");
        mentoriaJava.setData(LocalDate.now());

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoriaJava);

        // Criando e Inscrevendo Dev Wellington
        Dev devWellington = new Dev();
        devWellington.setNome("Wellington");
        devWellington.inscreverBootcamp(bootcamp);

        // Resultado para Wellington
        System.out.println("========== Dados do Desenvolvedor: Wellington ==========");
        System.out.println("Conteúdos Inscritos:");
        System.out.println(devWellington.getConteudosInscritos());
        devWellington.progredir();
        devWellington.progredir();
        System.out.println("\nConteúdos Inscritos Após Progresso:");
        System.out.println(devWellington.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos:");
        System.out.println(devWellington.getConteudosConcluidos());
        System.out.println("\nXP Total:");
        System.out.println(devWellington.calcularTotalXp());
        System.out.println("=======================================================\n");

        // Criando e Inscrevendo Dev João
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        // Resultado para João
        System.out.println("========== Dados do Desenvolvedor: João ==========");
        System.out.println("Conteúdos Inscritos:");
        System.out.println(devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("\nConteúdos Inscritos Após Progresso:");
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos:");
        System.out.println(devJoao.getConteudosConcluidos());
        System.out.println("\nXP Total:");
        System.out.println(devJoao.calcularTotalXp());
        System.out.println("================================================\n");
    }
}