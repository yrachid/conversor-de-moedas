package com.aceleradora.conversor;

public class TaxaCambio {
    private EnumMoeda moedaDeOrigem;
    private double taxa;
    private EnumMoeda moedaDeDestino;

    public TaxaCambio(EnumMoeda origem, double taxa, EnumMoeda destino) {
        this.moedaDeOrigem = origem;
        this.taxa = taxa;
        this.moedaDeDestino = destino;
    }

    public EnumMoeda getMoedaDeOrigem() {
        return moedaDeOrigem;
    }

    public double getTaxa() {
        return taxa;
    }

    public EnumMoeda getMoedaDeDestino() {
        return moedaDeDestino;
    }

}