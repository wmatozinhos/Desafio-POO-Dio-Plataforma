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

                // Criando um segundo bootcamp
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Web Developer");
        bootcamp2.setDescricao("Descrição Bootcamp Web Developer");
        // Adicionando conteúdos ao bootcamp2
        Curso curso3 = new Curso();
        curso3.setTitulo("curso HTML");
        curso3.setDescricao("descrição curso HTML");
        curso3.setCargaHoraria(6);

        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(mentoria);  // Reutilizando a mentoria existente

        // Inscrevendo um desenvolvedor em ambos os bootcamps
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.inscreverBootcamp(bootcamp2);

        // Verificando os conteúdos inscritos para cada bootcamp
        System.out.println("Conteúdos Inscritos Maria (Bootcamp Java Developer): " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Maria (Bootcamp Web Developer): " + devMaria.getConteudosInscritos());

    
        devMaria.progredir();  
        devMaria.progredir();  
        devMaria.progredir();  
        devMaria.progredir();  

        // Verificando conteúdos concluídos e XP após tentar progredir além do último conteúdo
        System.out.println("Conteúdos Concluídos Maria (Bootcamp Java Developer): " + devMaria.getConteudosConcluidos());
        System.out.println("XP Maria (Bootcamp Java Developer): " + devMaria.calcularTotalXp());

        System.out.println("XP Maria (Bootcamp Java Developer): " + devMaria.calcularTotalXp());



    }

}
