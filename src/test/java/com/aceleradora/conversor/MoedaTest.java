package com.aceleradora.conversor;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.aceleradora.conversor.Moeda.DOLAR_AMERICANO;
import static com.aceleradora.conversor.Moeda.REAL_BRASILEIRO;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MoedaTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void encontraMoedaPorCodigo() throws Exception {
        assertThat(Moeda.porCodigo("USD"), is(DOLAR_AMERICANO));
        assertThat(Moeda.porCodigo("BRL"), is(REAL_BRASILEIRO));
    }

    @Test
    public void lancaExcecaoQuandoCodigoProcuradoNaoEstaDisponivel() throws Exception {
        expectedException.expectMessage("Moeda nao suportada: ABC");

        Moeda.porCodigo("ABC");
    }
}