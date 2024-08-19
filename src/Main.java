import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as informações do Dev:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Tempo de Experiência (em anos): ");
        int tempoDeExperiencia = scanner.nextInt();

        scanner.nextLine(); // Consumir o newline deixado pelo nextInt()

        System.out.print("Nível de Experiência (Junior, Pleno, Senior): ");
        String nivelDeExperiencia = scanner.nextLine();

        System.out.print("Disponibilidade Imediata (true/false): ");
        boolean disponibilidadeImediata = scanner.nextBoolean();

        // Criando e configurando o Dev
        Dev dev = new Dev();
        dev.setNome(nome);
        dev.setTempoDeExperiencia(tempoDeExperiencia);
        dev.setNivelDeExperiencia(nivelDeExperiencia);
        dev.setDisponibilidadeImediata(disponibilidadeImediata);

        // Simular a inscrição e progresso no Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

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

        dev.inscreverBootcamp(bootcamp);
        dev.progredir(); // Simular progresso
        dev.progredir(); // Simular mais progresso

        // Verificar e adicionar o Dev à lista FosterAJuniorDevASAPStart
        dev.verificarEAdicionarDev();

        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP Total: " + dev.calcularTotalXp());

        scanner.close();

    }

}