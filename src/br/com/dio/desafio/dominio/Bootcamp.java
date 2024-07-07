package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    /*
     * Pesquisa por nome e retorna todas as informações de inscricao e conclusão dos
     * cursos
     */
    public Set<Dev> pesquisarPorNome(String nome) {
        return devsInscritos.stream()
                .filter(dev -> dev.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toSet());
    }

    /*
     * Pesquisar por nome e retorna lista de mentorias em andamento pelo aluno
     * informado
     */
    public void retornaMentoriasPorNome(String nome) {
        Optional<Dev> devEncontrado = devsInscritos.stream()
                .filter(dev -> dev.getNome().equalsIgnoreCase(nome))
                .findFirst();

        devEncontrado.ifPresent(dev -> {
            if (!dev.getConteudosInscritos().isEmpty()) {
                System.out.println("Mentoria(s) em andamento do(a) aluno(a) " + dev.getNome() + ".:");
                dev.getConteudosInscritos().stream()
                        .filter(conteudo -> conteudo instanceof Mentoria)
                        .map(conteudo -> ((Mentoria) conteudo).getTitulo())
                        .forEach(System.out::println);
            } else {
                System.out.println("Aluno matriculado, mas atualmente nenhuma mentoria em aberto!");
            }
        });

        if (!devEncontrado.isPresent()) {
            System.out.println("Nenhum aluno encontrado com o nome '" + nome + "'.");
        }
    }

    /* Lista dos alunos matriculados ordenados por nome */
    public void exibirListaAlunosPorNome() {
        Set<Dev> ordenadoPorNome = new TreeSet<>(devsInscritos);
        System.out.println("Lista alunos matriculados.:");
        ordenadoPorNome.stream().forEach(a -> System.out.println(" * " + a.getNome()));
    }

    /* Exibir alunos comparando por XP */
    public void exibirAlunosPorXP() {
        Set<Dev> alunosSetOrdenadoPorXP = new TreeSet<>(new ComparatorPorXP());
        if (!devsInscritos.isEmpty()) {
            alunosSetOrdenadoPorXP.addAll(devsInscritos);
        } else {
            throw new RuntimeException("Bootcamp está vazio!");
        }

        alunosSetOrdenadoPorXP.forEach(d -> {
            double totalXp = d.calcularTotalXp();
            System.out.println("*" + d.getNome() + " -> " + "XP.:" + totalXp);
        });
    }

    /* Remover aluno do bootcamp */
    public void removerAluno(String nome) {
        Dev alunoParaRemover = null;
        if (!devsInscritos.isEmpty()) {
            for (Dev a : devsInscritos) {
                if (a.getNome() == nome) {
                    alunoParaRemover = a;
                    break;
                }
            }
            devsInscritos.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Aluno não encontrado");
        } else {
            System.out.println("Matrícula de " + alunoParaRemover.getNome() + " cancelada com sucesso!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao)
                && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal)
                && Objects.equals(devsInscritos, bootcamp.devsInscritos)
                && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
