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

    public void setMoedaDeOrigem(EnumMoeda moedaDeOrigem) {
        this.moedaDeOrigem = moedaDeOrigem;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public EnumMoeda getMoedaDeDestino() {
        return moedaDeDestino;
    }

    public void setMoedaDeDestino(EnumMoeda moedaDeDestino) {
        this.moedaDeDestino = moedaDeDestino;
    }

    public boolean servePara(EnumMoeda origem, EnumMoeda destino) {
        return moedaDeOrigem == origem && moedaDeDestino == destino;
    }

    @Override
    public String toString() {
        return "TaxaCambio{" +
                "moedaDeOrigem=" + moedaDeOrigem +
                ", taxa=" + taxa +
                ", moedaDeDestino=" + moedaDeDestino +
                '}';
    }
}