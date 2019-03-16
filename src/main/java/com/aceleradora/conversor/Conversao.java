package com.aceleradora.conversor;

import java.math.BigDecimal;
import java.util.Objects;

public class Conversao {

    private final ValorMonetario valorDeEntrada;
    private final Moeda moedaDeSaida;

    public Conversao(ValorMonetario valorDeEntrada, Moeda moedaDeSaida) {
        this.valorDeEntrada = valorDeEntrada;
        this.moedaDeSaida = moedaDeSaida;
    }

    public BigDecimal getValorEmDolarAmericano() {
       return valorDeEntrada.getValorEmDolarAmericano();
    }

    public Moeda getMoedaDeSaida() {
        return moedaDeSaida;
    }

    @Override
    public String toString() {
        return "Conversao{" +
                "valorDeEntrada=" + valorDeEntrada +
                ", moedaDeSaida=" + moedaDeSaida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conversao conversao = (Conversao) o;
        return Objects.equals(valorDeEntrada, conversao.valorDeEntrada) &&
                moedaDeSaida == conversao.moedaDeSaida;
    }
}
