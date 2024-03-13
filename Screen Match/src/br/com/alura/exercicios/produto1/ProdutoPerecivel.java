package br.com.alura.exercicios.produto1;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int qtd, String dataValidade) {
        super(nome, preco, qtd);
        this.dataValidade = dataValidade;
    }
}
