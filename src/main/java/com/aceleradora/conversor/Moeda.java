package com.aceleradora.conversor;

import java.math.BigDecimal;
import java.util.stream.Stream;

public enum Moeda {

    DOLAR_AMERICANO("USD", new BigDecimal("1")),
    REAL_BRASILEIRO("BRL", new BigDecimal("0.26")),
    PESO_CHILENO("CLP", new BigDecimal("0.001493"));

    Moeda(String codigo, BigDecimal equivalenciaNuc) {
        this.codigo = codigo;
        this.equivalenciaNuc = equivalenciaNuc;
    }

    private String codigo;

    private BigDecimal equivalenciaNuc;

    public String getCodigo() {
        return codigo;
    }

    public BigDecimal getEquivalenciaNuc() {
        return equivalenciaNuc;
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
