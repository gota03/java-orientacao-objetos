package br.com.alura.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme = new Filme("Vingadores", 2013);
        filme.avaliaFilme(7);
        Filme filme2 = new Filme("Kingsman", 2017);
        filme2.avaliaFilme(8);
        Filme filme3 = new Filme("Batman", 2020);
        filme3.avaliaFilme(8);
        Serie serie = new Serie("Dark", 2019);
        serie.avaliaFilme(10);
        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filme);
        listaDeAssistidos.add(filme2);
        listaDeAssistidos.add(filme3);
        listaDeAssistidos.add(serie);

        for (Titulo item : listaDeAssistidos){
            System.out.println(item.getNome());
            if(item instanceof Filme filme1 && filme1.getClassificacao() > 2){
                System.out.println("Classificação: " + filme1.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Ryan Gosling");
        buscaPorArtista.add("Emma Stone");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
    }
}
