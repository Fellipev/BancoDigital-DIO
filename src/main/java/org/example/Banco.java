package org.example;

import org.example.Conta;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    public Banco() {

        this.contas = new ArrayList<>();
    }

    public Banco (ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public Conta adicionar (Conta conta) {

        if(conta != null) {
            this.contas.add(conta);
        }

        return conta;
    }

    public Conta DeleteByAgenciaAndNumero (int Agencia, int numero) {
        Conta contaADeletar = null;

        for (Conta c : this.contas) {
            if(c.getAgencia() == Agencia && c.getNumero() == numero) {
                contaADeletar = c;
                break;
            }
        }

        this.contas.remove(contaADeletar);
        return contaADeletar;
    }

    public void listaDeContas(){

        for(Conta c : this.contas) {
            System.out.println(c.getInfo());
        }
    }
}
