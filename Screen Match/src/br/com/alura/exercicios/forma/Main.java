package br.com.alura.exercicios.forma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.00);
        Quadrado quadrado = new Quadrado(2.00);
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);
        for(Forma item : formas){
            System.out.println(item.calcularArea());
        }
    }
}
