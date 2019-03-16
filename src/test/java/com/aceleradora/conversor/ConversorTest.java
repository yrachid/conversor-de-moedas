package com.aceleradora.conversor;

import com.aceleradora.conversor.entrada.Interpretador;
import com.aceleradora.conversor.entrada.Tokenizador;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static com.aceleradora.conversor.Moeda.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConversorTest {

    private Conversor conversor;

    @Before
    public void setUp() {
        conversor = new Conversor(new Interpretador(new Tokenizador()));
    }

    @Test
    public void converteValores() throws Exception {
        assertThat(conversor.converter("BRL1 USD"), is(new ValorMonetario(DOLAR_AMERICANO, new BigDecimal("0.26"))));
        assertThat(conversor.converter("USD1 CLP"), is(new ValorMonetario(PESO_CHILENO, new BigDecimal("670"))));
        assertThat(conversor.converter("CLP1 USD"), is(new ValorMonetario(DOLAR_AMERICANO, new BigDecimal("0.001493"))));
        assertThat(conversor.converter("CLP1 BRL"), is(new ValorMonetario(REAL_BRASILEIRO, new BigDecimal("0.005743"))));
    }


}