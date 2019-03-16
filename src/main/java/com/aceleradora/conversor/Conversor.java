package com.aceleradora.conversor;

import com.aceleradora.conversor.entrada.Interpretador;

import static java.math.RoundingMode.CEILING;

public class Conversor {

    private final Interpretador interpretador;

    public Conversor(Interpretador interpretador) {
        this.interpretador = interpretador;
    }

    public ValorMonetario converter(String entrada) throws Exception {
        Conversao conversao = interpretador.interpretar(entrada);

        return new ValorMonetario(
                conversao.getMoedaDeSaida(),
                conversao.getValorEmNuc().divide(conversao.getMoedaDeSaida().getEquivalenciaNuc(), CEILING)
        );
    }
}
