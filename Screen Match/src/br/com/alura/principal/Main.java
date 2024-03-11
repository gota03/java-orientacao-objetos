package br.com.alura.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Vingadores", 2013);
        filme.setDuracaoEmMinutos(220);

        Filme filme2 = new Filme("Kingsman", 2017);
        filme2.setDuracaoEmMinutos(160);

        filme.exibeFichaTecnica();
        filme.avaliaFilme(8.0);
        filme.avaliaFilme(6.5);
        filme.avaliaFilme(9.0);
        System.out.println("Total de avaliações: "+filme.getTotalDeAvaliacao());

        System.out.println(filme.pegaMedia());

        Serie serie = new Serie("Dark", 2019);
        serie.exibeFichaTecnica();
        serie.setTemporadas(3);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(65);
        System.out.println("Duração para maratonar dark: "+serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(2);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacao(450);
        filtro.filtra(episodio);

        Filme filme3 = new Filme("Batman", 2020);
        filme3.setDuracaoEmMinutos(160);
        filme3.avaliaFilme(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme: "+listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.getFirst().toString());

    }
}
