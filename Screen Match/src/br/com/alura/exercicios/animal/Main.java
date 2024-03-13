package br.com.alura.exercicios.animal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        if(cachorro instanceof Animal){
            Animal animal = (Animal) cachorro;
        }


    }
}
