package com.aceleradora.conversor;

public class ValorMonetario {

    private final Moeda moeda;
    private final double valor;

    public ValorMonetario(Moeda moeda, double valor) {
        this.moeda = moeda;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValorMonetario that = (ValorMonetario) o;
        return Double.compare(that.valor, valor) == 0 &&
                moeda == that.moeda;
    }

    @Override
    public String toString() {
        return moeda.toString() + valor;
    }
}
