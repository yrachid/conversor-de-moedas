package com.aceleradora.conversor;

public enum Moeda {

    DOLAR_AMERICANO("USD"),
    REAL_BRASILEIRO("BRL"),
    PESO_CHILENO("CLP");










    private String codigo;

    Moeda(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}