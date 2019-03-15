package com.aceleradora.conversor.entrada;

import java.util.Objects;

public class Tokens {

    private final String moedaEntrada;
    private final String valor;
    private final String moedaSaida;

    public Tokens(String moedaEntrada, String valor, String moedaSaida) {
        this.moedaEntrada = moedaEntrada;
        this.valor = valor;
        this.moedaSaida = moedaSaida;
    }

    public String getMoedaEntrada() {
        return moedaEntrada;
    }

    public String getValor() {
        return valor;
    }

    public String getMoedaSaida() {
        return moedaSaida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tokens tokens = (Tokens) o;
        return Objects.equals(moedaEntrada, tokens.moedaEntrada) &&
                Objects.equals(valor, tokens.valor) &&
                Objects.equals(moedaSaida, tokens.moedaSaida);
    }
}
