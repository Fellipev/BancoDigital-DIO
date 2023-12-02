package org.example;

import org.example.exceptions.SaldoInsuficienteException;

public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public Conta (int agencia, int numero, double saldo) {

        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    public Conta(double valor) {
        this.saldo = valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return this.saldo;
    }

    public void setValor(double valor) {

        this.saldo = valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Valor do saque = " + valor + "\n" + toString());
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para efetuar o saque.");
        }
    }

    public void depositar(double valor) {

        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Valor do deposito = " + valor + "\n" + toString());
        }
    }
    @Override

    public String toString() {
        return "Saldo da conta = " + this.saldo;
    }

    public String getInfo(){
        return "Conta";
    }
}
