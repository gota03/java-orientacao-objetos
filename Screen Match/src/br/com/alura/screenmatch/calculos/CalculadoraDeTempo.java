package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo){
        System.out.println(titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
    public int getTempoTotal() {
        return this.tempoTotal;
    }
}
