package com.aceleradora.conversor;

import java.util.stream.Stream;

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

    public static Moeda porCodigo(String codigo) throws Exception {
       return Stream
               .of(values())
               .filter(moeda -> moeda.getCodigo()
                       .equals(codigo))
               .findFirst()
               .orElseThrow(() -> new Exception("Moeda nao suportada: " + codigo));
    }

    @Override
    public String toString() {
        return codigo;
    }
}
