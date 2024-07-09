package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class Ultils {
    public static void exibirOpcoes() {
        System.out.println("1 - Cadastrar Curso");
        System.out.println("2 - Cadastrar Mentoria");
        System.out.println("3 - Cadastrar Bootcamp");
        System.out.println("4 - Inscrever Dev no Bootcamp");
        System.out.println("5 - Progredir Dev no Bootcamp");
        System.out.println("6 - Exibir Devs Inscritos no Bootcamp");
        System.out.println("7 - Exibir Devs Progresso no Bootcamp");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void pausar() {
        System.out.println("\nPressione Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
    public static void iniciarMenu() {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Bootcamp bootcamp = new Bootcamp();
        Mentoria mentoria = new Mentoria();
        Dev devCamila = new Dev();
        Dev devJoao = new Dev();

        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            clearConsole();
            exibirOpcoes();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    clearConsole();
                    curso1.setTitulo("curso java");
                    curso1.setDescricao("descrição curso java");
                    curso1.setCargaHoraria(8);

                    curso2.setTitulo("curso js");
                    curso2.setDescricao("descrição curso js");
                    curso2.setCargaHoraria(4);
                    System.out.println("Curso Cadastrado com Sucesso!");
                    System.out.println("Curso: " + curso1.getTitulo());
                    System.out.println("Descrição: " + curso1.getDescricao());
                    System.out.println("Carga Horária: " + curso1.getCargaHoraria());
                    System.out.println("-------------------------//-----------------------------------------");
                    System.out.println("Curso: " + curso2.getTitulo());
                    System.out.println("Descrição: " + curso2.getDescricao());
                    System.out.println("Carga Horária: " + curso2.getCargaHoraria());
                    pausar();
                    break;
                case 2:
                    clearConsole();
                    mentoria.setTitulo("mentoria de java");
                    mentoria.setDescricao("descrição mentoria java");
                    mentoria.setData(LocalDate.now());
                    System.out.println("Mentoria Cadastrada com Sucesso!");
                    System.out.println("Mentoria: " + mentoria.getTitulo());
                    System.out.println("Descrição: " + mentoria.getDescricao());
                    System.out.println("Data: " + mentoria.getData());
                    pausar();
                    break;
                case 3:
                    clearConsole();
                    bootcamp.setNome("Bootcamp Java Developer");
                    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
                    bootcamp.getConteudos().add(curso1);
                    bootcamp.getConteudos().add(curso2);
                    bootcamp.getConteudos().add(mentoria);
                    System.out.println("Bootcamp Cadastrado com Sucesso!");
                    System.out.println("Bootcamp: " + bootcamp.getNome());
                    System.out.println("Descrição: " + bootcamp.getDescricao());
                    System.out.println("Conteúdos: " + bootcamp.getConteudos());
                    pausar();
                    break;
                case 4:
                    clearConsole();
                    devCamila.setNome("Camila");
                    devCamila.inscreverBootcamp(bootcamp);
                    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
                    System.out.println("-");
                    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
                    System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
                    System.out.println("XP:" + devCamila.calcularTotalXp());

                    System.out.println("-------");

                    devJoao.setNome("Joao");
                    devJoao.inscreverBootcamp(bootcamp);
                    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
                    devJoao.progredir();
                    System.out.println("-");
                    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
                    System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
                    System.out.println("XP:" + devJoao.calcularTotalXp());
                    pausar();
                    break;
                case 5:
                    clearConsole();
                    devCamila.progredir();
                    devCamila.progredir();
                    System.out.println("-");
                    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
                    System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
                    System.out.println("XP:" + devCamila.calcularTotalXp());
                    devJoao.progredir();
                    System.out.println("-");
                    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
                    System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
                    System.out.println("XP:" + devJoao.calcularTotalXp());
                    pausar();
                    break;
                case 6:
                    clearConsole();
                    // Exibir Devs Inscritos no Bootcamp
                    bootcamp.getDevsInscritos().forEach(dev -> {
                        System.out.println("Nome: " + dev.getNome());
                        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
                        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
                        System.out.println("XP: " + dev.calcularTotalXp());
                        System.out.println("-------------------------------------------------");
                    });
                    pausar();
                    break;
                case 7:
                    clearConsole();
                    System.out.println("XP Camila: " + devCamila.calcularTotalXp());
                    System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
                    System.out.println("XP João: " + devJoao.calcularTotalXp());
                    System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
                    pausar();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    clearConsole();
                    System.out.println("Opção inválida. Tente novamente.");
                    pausar();
                    break;
            }
        }

        scanner.close();
    }

}
