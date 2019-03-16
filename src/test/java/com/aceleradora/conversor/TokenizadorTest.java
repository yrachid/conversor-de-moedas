package com.aceleradora.conversor;

import com.aceleradora.conversor.entrada.Tokenizador;
import com.aceleradora.conversor.entrada.Tokens;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TokenizadorTest {

    private Tokenizador tokenizador;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        tokenizador = new Tokenizador();
    }

    @Test
    public void encontraTokensDaEntradaCorretamente() throws Exception {
        Tokens dolarParaReal = tokenizador.tokenizar("USD100 BRL");
        Tokens realParaDolar = tokenizador.tokenizar("BRL100 USD");

        assertThat(dolarParaReal, is(new Tokens("USD", "100", "BRL")));
        assertThat(realParaDolar, is(new Tokens("BRL", "100", "USD")));
    }

    @Test
    public void suportaDiferentesValores() throws Exception {
        Tokens dolarParaReal = tokenizador.tokenizar("USD100.00 BRL");
        Tokens realParaDolar = tokenizador.tokenizar("BRL10.50 USD");

        assertThat(dolarParaReal, is(new Tokens("USD", "100.00", "BRL")));
        assertThat(realParaDolar, is(new Tokens("BRL", "10.50", "USD")));
    }
}