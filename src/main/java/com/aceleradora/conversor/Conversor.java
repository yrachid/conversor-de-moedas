package com.aceleradora.conversor;

public class Conversor {

    public String validador(String entrada) {

        return entrada;
    }

    public String getMoedaEntrada(String entrada){

        String codigoMoedaOriginal = entrada.substring(0, 3);

        return codigoMoedaOriginal;
    }

    public double retornaValor(String entrada) {

        int indiceEspaco = entrada.indexOf(" ");

        String valor = entrada.substring(3, indiceEspaco);

        double valorFinal = Double.parseDouble(valor);

        return valorFinal;
    }

    public String[] getMoedasSaida(String entrada) {

        int indiceEspaco = entrada.indexOf(" ");
        int tamanhoEntrada = entrada.length();
        String moedas = entrada.substring(indiceEspaco, tamanhoEntrada);
        String[] arrayMoedas = moedas.trim().split(" ");

        return  arrayMoedas;
    }
}
