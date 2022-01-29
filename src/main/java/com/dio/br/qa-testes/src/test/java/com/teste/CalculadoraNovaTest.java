package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {

    @Test
    public void testeDeveSomarDoisValores() {
        int valorA = 1;
        int valorB = 2;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int soma = calculadoraNova.somar(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void testeDeveSomarTresValores() {
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int soma = calculadoraNova.somar(valorA, valorB, valorC);

        assertEquals(6, soma);
    }
}
