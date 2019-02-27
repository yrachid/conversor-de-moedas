package com.aceleradora.conversor;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final List<TaxaCambio> TAXAS_DISPONIVEIS = Arrays.asList(
                new TaxaCambio(Moeda.REAL_BRASILEIRO, 174.36, Moeda.PESO_CHILENO),
                new TaxaCambio(Moeda.REAL_BRASILEIRO, 0.24, Moeda.EURO),
                new TaxaCambio(Moeda.REAL_BRASILEIRO, 0.27, Moeda.DOLAR_AMERICANO),

                new TaxaCambio(Moeda.DOLAR_AMERICANO, 651.43, Moeda.PESO_CHILENO),
                new TaxaCambio(Moeda.DOLAR_AMERICANO, 0.88, Moeda.EURO),
                new TaxaCambio(Moeda.DOLAR_AMERICANO, 3.74, Moeda.REAL_BRASILEIRO),

                new TaxaCambio(Moeda.EURO, 738.98, Moeda.PESO_CHILENO),
                new TaxaCambio(Moeda.EURO, 4.24, Moeda.REAL_BRASILEIRO),
                new TaxaCambio(Moeda.EURO, 1.13, Moeda.DOLAR_AMERICANO),

                new TaxaCambio(Moeda.PESO_CHILENO, 0.0014, Moeda.EURO),
                new TaxaCambio(Moeda.PESO_CHILENO, 0.0015, Moeda.DOLAR_AMERICANO),
                new TaxaCambio(Moeda.PESO_CHILENO, 0.0057, Moeda.REAL_BRASILEIRO));


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





