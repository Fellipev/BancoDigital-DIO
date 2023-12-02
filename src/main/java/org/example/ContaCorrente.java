package org.example;

public class ContaCorrente extends Conta {

    private String tipoConta = "Conta Corrente";

    public ContaCorrente(double valor) {
        super(valor);
    }

    public ContaCorrente(int agencia, int numero, double saldo) {

        super(agencia, numero, saldo);
    }

    @Override
    public String toString() {
        return "Tipo da conta = " + this.tipoConta + "\n" + super.toString();
    }
    @Override

    public String getInfo() {

        return "Tipo da conta = " + this.tipoConta + "\nAgencia = " + super.getAgencia() + "\nNumero = " + super.getNumero();
    }
}
