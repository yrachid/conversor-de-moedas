package com.aceleradora.conversor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double BRL_CLP = 174.36;
        double BRL_EUR = 0.24;
        double BRL_USD = 0.27;

        double USD_CLP = 651.43;
        double USD_EUR = 0.88;
        double USD_BRL = 3.74;

        double EUR_CLP = 738.98;
        double EUR_BRL = 4.24;
        double EUR_USD = 1.13;

        double CLP_EUR = 0.0014;
        double CLP_USD = 0.0015;
        double CLP_BRL = 0.0057;

        Conversor conversor = new Conversor();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome da moeda junto com o valor e a moeda que você quer converter. Exemplo: 'USD100 BRL'.");
        String entrada = input.nextLine();

        String codigoMoedaOriginal = entrada.substring(0, 3);

        int indiceEspaco = entrada.indexOf(" ");
        String codigoMoedaDestino = entrada.substring(indiceEspaco + 1, indiceEspaco + 4);

        String valor = entrada.substring(3, indiceEspaco);
        Double d = new Double("6.35");

        double converte = d.parseDouble(valor);
        System.out.println("Value = " + converte);


        if (codigoMoedaOriginal.equals(EnumMoeda.REAL_BRASILEIRO) && codigoMoedaDestino.equals(EnumMoeda.PESO_CHILENO)) {
            double resultado = converte * BRL_CLP;
            System.out.println(resultado);

        } else if (codigoMoedaOriginal.equals(EnumMoeda.REAL_BRASILEIRO) && codigoMoedaDestino.equals(EnumMoeda.EURO)) {
            double resultado = converte * BRL_EUR;
            System.out.println(resultado);

        } else if (codigoMoedaOriginal.equals(EnumMoeda.REAL_BRASILEIRO) && codigoMoedaDestino.equals(EnumMoeda.DOLAR_AMERICANO)) {
            double resultado = converte * BRL_USD;
            System.out.println(resultado);
        }

        if (codigoMoedaOriginal.equals(EnumMoeda.DOLAR_AMERICANO) && codigoMoedaDestino.equals(EnumMoeda.PESO_CHILENO)) {
            double resultado = converte * USD_CLP;
            System.out.println(resultado);
        }
        else if (codigoMoedaOriginal.equals(EnumMoeda.DOLAR_AMERICANO) && codigoMoedaDestino.equals(EnumMoeda.EURO)) {
            double resultado = converte * USD_EUR;
            System.out.println(resultado);
        }
        else if (codigoMoedaOriginal.equals(EnumMoeda.DOLAR_AMERICANO) && codigoMoedaDestino.equals(EnumMoeda.REAL_BRASILEIRO)) {
            double resultado = converte * USD_BRL;
            System.out.println(resultado);
        }
        if (codigoMoedaOriginal.equals(EnumMoeda.EURO) && codigoMoedaDestino.equals(EnumMoeda.PESO_CHILENO)) {
            double resultado = converte * EUR_CLP;
            System.out.println(resultado);
        }
        else if (codigoMoedaOriginal.equals(EnumMoeda.EURO) && codigoMoedaDestino.equals(EnumMoeda.REAL_BRASILEIRO)) {
            double resultado = converte * EUR_BRL;
            System.out.println(resultado);
        }
        else if (codigoMoedaOriginal.equals(EnumMoeda.EURO) && codigoMoedaDestino.equals(EnumMoeda.DOLAR_AMERICANO)) {
            double resultado = converte * EUR_USD;
            System.out.println(resultado);
        }
        if (codigoMoedaOriginal.equals(EnumMoeda.PESO_CHILENO) && codigoMoedaDestino.equals(EnumMoeda.EURO)) {
            double resultado = converte * CLP_EUR;
            System.out.println(resultado);
        }
        else if (codigoMoedaOriginal.equals(EnumMoeda.EURO) && codigoMoedaDestino.equals(EnumMoeda.DOLAR_AMERICANO)) {
            double resultado = converte * CLP_USD;
            System.out.println(resultado);
        }
        else if (codigoMoedaOriginal.equals(EnumMoeda.EURO) && codigoMoedaDestino.equals(EnumMoeda.REAL_BRASILEIRO)) {
            double resultado = converte * CLP_BRL;
            System.out.println(resultado);
        }
    }
}





