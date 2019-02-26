package com.aceleradora.conversor;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final List<TaxaCambio> TAXAS_DISPONIVEIS = Arrays.asList(
                new TaxaCambio(EnumMoeda.REAL_BRASILEIRO, 174.36, EnumMoeda.PESO_CHILENO),
                new TaxaCambio(EnumMoeda.REAL_BRASILEIRO, 0.24, EnumMoeda.EURO),
                new TaxaCambio(EnumMoeda.REAL_BRASILEIRO, 0.27, EnumMoeda.DOLAR_AMERICANO),

                new TaxaCambio(EnumMoeda.DOLAR_AMERICANO, 651.43, EnumMoeda.PESO_CHILENO),
                new TaxaCambio(EnumMoeda.DOLAR_AMERICANO, 0.88, EnumMoeda.EURO),
                new TaxaCambio(EnumMoeda.DOLAR_AMERICANO, 3.74, EnumMoeda.REAL_BRASILEIRO),

                new TaxaCambio(EnumMoeda.EURO, 738.98, EnumMoeda.PESO_CHILENO),
                new TaxaCambio(EnumMoeda.EURO, 4.24, EnumMoeda.REAL_BRASILEIRO),
                new TaxaCambio(EnumMoeda.EURO, 1.13, EnumMoeda.DOLAR_AMERICANO),

                new TaxaCambio(EnumMoeda.PESO_CHILENO, 0.0014, EnumMoeda.EURO),
                new TaxaCambio(EnumMoeda.PESO_CHILENO, 0.0015, EnumMoeda.DOLAR_AMERICANO),
                new TaxaCambio(EnumMoeda.PESO_CHILENO, 0.0057, EnumMoeda.REAL_BRASILEIRO));


        Conversor conversor = new Conversor();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome da moeda junto com o valor e a moeda que você quer converter. Exemplo: 'USD100 BRL'.");
        String entrada = input.nextLine();

        double valor = conversor.retornaValor(entrada);

        String primeiraMoeda = conversor.moedaOriginal(entrada);

        String segundaMoeda = conversor.moedaDestino(entrada);

        double resultado;

        for (TaxaCambio taxa : TAXAS_DISPONIVEIS){

            if(primeiraMoeda.equalsIgnoreCase(taxa.getMoedaDeOrigem().getCodigo())){
                if(segundaMoeda.equalsIgnoreCase(taxa.getMoedaDeDestino().getCodigo())){
                    resultado = valor * taxa.getTaxa();

                    System.out.println(resultado);
                }
            }

        }
    }
}





