package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Titulo;

public class FiltroRecomendacao {
    private String recomendacao;
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao()>4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Muito bem avaliado");
        }else{
            System.out.println("Assista depois");
        }

    }
}
