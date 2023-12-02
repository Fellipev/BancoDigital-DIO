package org.example;

public class ContaPoupanca extends Conta {

    private String tipoConta = "Conta poupanca";
    public ContaPoupanca(double valor) {
        super(valor);
    }

    public ContaPoupanca(int agencia, int numero, double saldo) {

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
