package com.aceleradora.conversor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TaxaService {

    private static final List<TaxaCambio> TAXAS_DISPONIVEIS = Arrays.asList(
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


    public static List<Double> getResults(String valor, String moedas) throws Exception {


        Conversor conversor = new Conversor();

        String entrada = valor + " " + moedas;

        String primeiraMoeda = conversor.getMoedaEntrada(entrada);


        double quantia = conversor.retornaValor(entrada);

        String[] arrayMoedas = conversor.getMoedasSaida(entrada);

        List<Double> resultado = new ArrayList<>();

        for (int i = 0; i < arrayMoedas.length; i++) {

            String moedaSaida = arrayMoedas[i];

            Predicate<TaxaCambio> consegueConverter = taxa ->
                    taxa.getMoedaDeOrigem().getCodigo().equalsIgnoreCase(primeiraMoeda) &&
                            taxa.getMoedaDeDestino().getCodigo().equalsIgnoreCase(moedaSaida);

            TaxaCambio taxaDeCambio = TAXAS_DISPONIVEIS
                    .stream()
                    .filter(consegueConverter)
                    .findAny()
                    .orElseThrow(() ->
                            new Exception(String.format("Conversao indisponivel: %s  > %s", primeiraMoeda, moedaSaida)));

            resultado.add(quantia * taxaDeCambio.getTaxa());

        }
        return resultado;
    }
}
