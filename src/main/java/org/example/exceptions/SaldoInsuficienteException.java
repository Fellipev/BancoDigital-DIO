package org.example.exceptions;

public class SaldoInsuficienteException extends Exception {
    private String msg;

    public SaldoInsuficienteException(String msg) {
        this.msg = msg;
    }
    @Override
    public String getMessage() {
        return msg;
    }
}
