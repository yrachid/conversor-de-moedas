package com.aceleradora.conversor;

import com.aceleradora.conversor.entrada.Interpretador;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.RoundingMode.CEILING;

public class Conversor {

    private final Interpretador interpretador;

    private static final RoundingMode ARREDONDA_PARA_CIMA = CEILING;

    public Conversor(Interpretador interpretador) {
        this.interpretador = interpretador;
    }

    public ValorMonetario converter(String entrada) throws Exception {
        Conversao conversao = interpretador.interpretar(entrada);

        return new ValorMonetario(
                conversao.getMoedaDeSaida(),
                converteValorParaMoedaDeSaida(conversao)
        );
    }

    private BigDecimal converteValorParaMoedaDeSaida(Conversao conversao) {
        BigDecimal valorOriginalEmDolarAmericano = conversao.getValorEmDolarAmericano();

        BigDecimal taxaDeConversaoDaMoedaDeSaida = conversao.getMoedaDeSaida().getEquivalenciaAoDolarAmericano();

        return valorOriginalEmDolarAmericano.divide(taxaDeConversaoDaMoedaDeSaida, ARREDONDA_PARA_CIMA);
    }
}
