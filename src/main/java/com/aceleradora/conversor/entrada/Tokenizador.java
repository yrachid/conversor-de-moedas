package com.aceleradora.conversor.entrada;

public class Tokenizador {

    public Tokens tokenizar(String entrada) {

        int indiceEspaco = entrada.indexOf(" ");

        String moedaOriginal = entrada.substring(0, 3);
        String valor = entrada.substring(3, indiceEspaco);
        String moedaSaida = entrada.substring(indiceEspaco + 1, indiceEspaco + 4);

        return new Tokens(moedaOriginal, valor, moedaSaida);
    }
}
