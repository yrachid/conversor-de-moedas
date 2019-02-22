package com.aceleradora.conversor;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void dizOiMundo() {
        Main main = new Main();

        assertThat(main.getGreeting(), equalTo("Oi, mundo"));
    }
}
