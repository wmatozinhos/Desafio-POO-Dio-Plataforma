package br.com.dio.desafio.dominio;

public class LivesYouTube extends Conteudo{

    private int presencaMarcada;

    @Override
    public double calcularXp() {
        return XP_PADRAO * presencaMarcada;
    }

    public LivesYouTube() {
    }


    public int getPresentaMarcada() {
        return presencaMarcada;
    }

    public void setPresentaMarcada(int presencaMarcada) {
        this.presencaMarcada = presencaMarcada;
    }

    @Override
    public String toString() {
        return "Live{" + getTitulo() + " (" + presencaMarcada + " horas) - " + getDescricao();
    }
}
