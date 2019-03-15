package com.aceleradora.conversor;

public enum Moeda {

    DOLAR_AMERICANO("USD"),
    REAL_BRASILEIRO("BRL");

    Moeda(String codigo) {
        this.codigo = codigo;
    }

    private String codigo;

    public String getCodigo() {
        return codigo;
    }
}
