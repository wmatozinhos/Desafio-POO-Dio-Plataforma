package br.com.dio.desafio.dominio;
import java.util.Comparator;
public class ComparatorPorXP implements Comparator<Dev>{
    @Override
    public int compare(Dev a1, Dev a2) {
        return Double.compare(a1.calcularTotalXp(), a2.calcularTotalXp());
    }
}