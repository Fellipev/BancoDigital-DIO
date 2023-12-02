package org.example;

import org.example.exceptions.SaldoInsuficienteException;

import java.sql.SQLOutput;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(1515, 001, 100.50);
//        cc.sacar(50.50);


        ContaPoupanca cp = new ContaPoupanca(1515, 002,200.99);
//        cp.depositar(300);
//        cp.sacar(100);

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        Banco banco = new Banco(contas);

        System.out.println("-- LISTA INICIAL --\n");
        banco.listaDeContas();
        banco.adicionar(new ContaCorrente(1313, 001, 2000));
        System.out.println("-- LISTA COM ADICAO --\n");
        banco.listaDeContas();
        banco.DeleteByAgenciaAndNumero(1515, 001);
        System.out.println("-- LISTA COM REMOCAO --\n");
        banco.listaDeContas();
    }
}