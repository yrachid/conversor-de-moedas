package com.aceleradora.conversor.entrada;

import com.aceleradora.conversor.Conversao;
import com.aceleradora.conversor.ValorMonetario;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.aceleradora.conversor.Moeda.DOLAR_AMERICANO;
import static com.aceleradora.conversor.Moeda.REAL_BRASILEIRO;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InterpretadorTest {

    private Interpretador interpretador;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        interpretador = new Interpretador(new Tokenizador());
    }

    @Test
    public void constroiObjetoConversaoAPartirDaEntrada() throws Exception {
        Conversao resultadoEsperado = new Conversao(new ValorMonetario(DOLAR_AMERICANO, 100.00), REAL_BRASILEIRO);

        assertThat(interpretador.interpretar("USD100 BRL"), is(resultadoEsperado));
    }

    @Test
    public void naoReconheceMoedasInvalidas() throws Exception {
        expectedException.expectMessage("Moeda nao suportada: BRC");

        interpretador.interpretar("USD100 BRC");
    }

}