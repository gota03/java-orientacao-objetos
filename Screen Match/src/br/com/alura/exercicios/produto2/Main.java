package br.com.alura.exercicios.produto2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 1500.00);
        Produto produto2 = new Produto("Notebook", 2000.00);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        double somaProdutos = 0.0;
        for(Produto item : produtos){
            somaProdutos += item.getPreco();
        }
        double mediaPreco = somaProdutos/produtos.size();
        System.out.printf("Preço médio: R$%.2f",mediaPreco);
    }
}
