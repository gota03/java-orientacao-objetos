package br.com.alura.exercicios.contabancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(01, 10.00);
        ContaBancaria conta2 = new ContaBancaria(02, 20.00);
        ContaBancaria conta3 = new ContaBancaria(03, 15.00);
        ContaBancaria conta4 = new ContaBancaria(04, 10.00);
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        ContaBancaria contaMaiorSaldo = contas.getFirst();
        System.out.println(contaMaiorSaldo);
        for(ContaBancaria item : contas){
           if(item.getSaldo() > contaMaiorSaldo.getSaldo()){
               contaMaiorSaldo = item;
           }
        }
        System.out.println("A conta com maior saldo é a conta: "+contaMaiorSaldo.getNumero());
        System.out.printf("Saldo: R$%.2f", contaMaiorSaldo.getSaldo());
    }
}
