package com.aceleradora.conversor.entrada;

import com.aceleradora.conversor.Moeda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TokenizadorDeEntrada {

    private static final Pattern PADRAO_ENTRADA = Pattern.compile("(?<moedaOriginal>[A-Z]{3})(?<valor>\\d+\\.?\\d*)\\s(?<moedaSaida>[A-Z]{3})");

    public Tokens tokenizar(String entrada) throws Exception {

        Matcher matcher = PADRAO_ENTRADA.matcher(entrada);

        if (matcher.matches()) {

            String moedaOriginal = matcher.group("moedaOriginal");
            String valor = matcher.group("valor");
            String moedaSaida = matcher.group("moedaSaida");

            if (moedaInvalida(moedaOriginal)) {
                throw new Exception("Moeda invalida: " + moedaOriginal);
            }

            if (moedaInvalida(moedaSaida)) {
                throw new Exception("Moeda invalida: " + moedaSaida);
            }

            return new Tokens(moedaOriginal, valor, moedaSaida);
        }

        throw new Exception("Entrada invalida");
    }

    private boolean moedaInvalida(String codigo) {
        return Stream
                .of(Moeda.values())
                .noneMatch(moeda -> moeda.getCodigo().equals(codigo));
    }
}
