package com.aceleradora.conversor;


import static com.aceleradora.conversor.Moeda.moedaDisponivel;

public class Conversor {


    public static String validador(String entrada) {

        String codigoMoedaOriginal = entrada.substring(0, 3);

        int indiceEspaco = entrada.indexOf(" ");
        String codigoMoedaDestino = entrada.substring(indiceEspaco + 1, indiceEspaco + 4);

        if (!moedaDisponivel(codigoMoedaOriginal) && (!moedaDisponivel(codigoMoedaDestino))) {
            return "EnumMoeda indisponivel: " + codigoMoedaOriginal + codigoMoedaDestino;
        }

        return entrada;
    }

    public double retornaValor(String entrada){

        int indiceEspaco = entrada.indexOf(" ");

        String valor = entrada.substring(3, indiceEspaco);

        double valorFinal = Double.parseDouble(valor);

        return valorFinal;
    }

    public String moedaOriginal(String entrada){

        String codigoMoedaOriginal = entrada.substring(0, 3);

        return codigoMoedaOriginal;
    }
    public String moedaDestino(String entrada){

        int indiceEspaco = entrada.indexOf(" ");

        String codigoMoedaDestino = entrada.substring(indiceEspaco + 1, indiceEspaco + 4);

        return codigoMoedaDestino;

    }
}
