package br.com.alura.exercicios.produto1;

public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }
    @Override
    public String toString() {
        return "\nProduto: " + this.nome + "\n" +
                "Preço: " + this.preco + "\n" +
                "Quantidade: " + this.qtd
                ;
    }
}
