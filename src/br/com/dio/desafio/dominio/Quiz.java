package br.com.dio.desafio.dominio;

public class Quiz extends Conteudo {

    private int numPerguntas;

    public Quiz() {
    }

    @Override
    public double calcularXp() {
        return XP_Padrao * numPerguntas;
    }

    public int getNumPerguntas() {
        return numPerguntas;
    }

    public void setNumPerguntas(int numPerguntas) {
        this.numPerguntas = numPerguntas;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", numPerguntas=" + numPerguntas +
                '}';
    }
}