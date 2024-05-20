import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.exceptions.EmptyCollectionException;

import java.time.LocalDate;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Bootcamp javaBootcamp = new Bootcamp();
        javaBootcamp.setNome("Bootcamp Java Developer");
        javaBootcamp.setDescricao("Descrição Bootcamp Java Developer");

        try {
            for(int c = 1; c <= 5; c++) {
                System.out.println("qual tipo de conteudo quer adicionar ? \n curso = 1 | mentoria = 2");
                int conteudoType = scanner.nextInt();
                scanner.nextLine();

                if(conteudoType == 1) {
                    Curso curso1 = new Curso();
                    setConteudoInfo("curso", curso1);
                    curso1.setCargaHoraria(8);
                    javaBootcamp.getConteudos().add(curso1);

                } else if(conteudoType == 2) {
                    Mentoria mentoria = new Mentoria();
                    setConteudoInfo("mentoria", mentoria);
                    mentoria.setData(LocalDate.now().plusDays(20));
                    javaBootcamp.getConteudos().add(mentoria);

                }else {
                    throw new RuntimeException("this conteudo does not exist in the options");
                }
            }

            Set<Dev> devSet = new HashSet<>();
            for(int d = 1; d <= 5; d++) {
                System.out.println("nome do dev n°"+ d);
                String nomeDev = scanner.next();

                Dev dev = new Dev();
                dev.setNome(nomeDev);
                dev.inscreverBootcamp(javaBootcamp);

                devSet.add(dev);
            }
            javaBootcamp.setDevsInscritos(devSet);

            for(Dev dev : devSet) {
                System.out.println("Conteúdos Inscritos por: " + dev.getNome() + "\n" + dev.getConteudosInscritos());
                dev.progredir();
                System.out.println("-");
                System.out.println("Conteúdos Inscritos por: " + dev.getNome() + "\n" + dev.getConteudosInscritos());
                System.out.println("Conteúdos Concluídos por: " + dev.getNome() + "\n" + dev.getConteudosConcluidos());
                System.out.println("XP: " + dev.calcularTotalXp());
                System.out.println("-------");
            }
        }catch (EmptyCollectionException e) {
            e.getMessage();
            e.printStackTrace();
        }

    }

    public static void setConteudoInfo(String conteudoType ,Conteudo conteudo) {
        System.out.println("titulo do " + conteudoType);
        String titulo = scanner.nextLine();

        System.out.println("descrição do " + conteudoType);
        String cursoDescription = scanner.nextLine();

        conteudo.setTitulo(titulo);
        conteudo.setDescricao(cursoDescription);
    }
}
