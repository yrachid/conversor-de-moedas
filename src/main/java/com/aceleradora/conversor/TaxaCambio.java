package com.aceleradora.conversor;
public class TaxaCambio {
    private Moeda moedaDeOrigem;
    private double taxa;
    private Moeda moedaDeDestino;

    public TaxaCambio(Moeda origem, double taxa, Moeda destino) {
        this.moedaDeOrigem = origem;
        this.taxa = taxa;
        this.moedaDeDestino = destino;
    }

    public Moeda getMoedaDeOrigem() {
        return moedaDeOrigem;
    }

    public void setMoedaDeOrigem(Moeda moedaDeOrigem) {
        this.moedaDeOrigem = moedaDeOrigem;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public Moeda getMoedaDeDestino() {
        return moedaDeDestino;
    }

    public void setMoedaDeDestino(Moeda moedaDeDestino) {
        this.moedaDeDestino = moedaDeDestino;
    }

    public boolean servePara(Moeda origem, Moeda destino) {
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