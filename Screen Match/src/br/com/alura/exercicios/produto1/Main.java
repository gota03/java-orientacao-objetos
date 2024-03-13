package br.com.alura.exercicios.produto1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Telefone", 1500.00, 3);
        Produto produto2 = new Produto("Notebook", 4000.00, 5);
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Arroz", 30.00, 3, "Segunda");
        ProdutoPerecivel produtoPerecivel2 = new ProdutoPerecivel("Açucar", 24.90, 7, "Quinta");
        produtos.add(produto1);
        produtos.add(produto2);
        System.out.println(produtos.toString());
        produtos.add(produtoPerecivel1);
        produtos.add(produtoPerecivel2);
        System.out.println(produtos.toString());
    }
}
