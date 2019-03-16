package com.aceleradora.conversor.entrada;

import com.aceleradora.conversor.Conversao;
import com.aceleradora.conversor.ValorMonetario;

import java.math.BigDecimal;

import static com.aceleradora.conversor.Moeda.porCodigo;

public class Interpretador {

    private final Tokenizador tokenizador;

    public Interpretador(Tokenizador tokenizador) {
        this.tokenizador = tokenizador;
    }

    public Conversao interpretar(String entrada) throws Exception {
        Tokens tokens = tokenizador.tokenizar(entrada);

        ValorMonetario valorDeEntrada = new ValorMonetario(
                porCodigo(tokens.getMoedaEntrada()),
                new BigDecimal(tokens.getValor()));

        return new Conversao(
                valorDeEntrada,
                porCodigo(tokens.getMoedaSaida())
        );
    }

}
