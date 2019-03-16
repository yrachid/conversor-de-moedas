package com.aceleradora.conversor;

import java.math.BigDecimal;
import java.util.Objects;

public class ValorMonetario {

    private final Moeda moeda;
    private final BigDecimal valor;

    public ValorMonetario(Moeda moeda, BigDecimal valor) {
        this.moeda = moeda;
        this.valor = valor;
    }

    public BigDecimal getValorEmDolarAmericano() {
       return valor.multiply(moeda.getEquivalenciaAoDolarAmericano());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValorMonetario that = (ValorMonetario) o;
        return moeda == that.moeda &&
                Objects.equals(valor, that.valor);
    }

    @Override
    public String toString() {
        return moeda.toString() + valor;
    }
}
