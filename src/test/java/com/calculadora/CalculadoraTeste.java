package com.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    @Test
    void testeSoma() {
        Calculadora calc = new Calculadora();
        calc.setNumero1(10);
        calc.setNumero2(5);

        double resultado = calc.somar();

        assertEquals(15, resultado, 0.001);
    }

    @Test
    void testeSubtracao() {
        Calculadora calc = new Calculadora();
        calc.setNumero1(10);
        calc.setNumero2(5);

        double resultado = calc.subtrair();

        assertEquals(5, resultado, 0.001);
    }

    @Test
    void testeMultiplicacao() {
        Calculadora calc = new Calculadora();
        calc.setNumero1(10);
        calc.setNumero2(5);

        double resultado = calc.multiplicar();

        assertEquals(50, resultado, 0.001);
    }

    @Test
    void testeDivisao() {
        Calculadora calc = new Calculadora();
        calc.setNumero1(10);
        calc.setNumero2(2);

        double resultado = calc.dividir();

        assertEquals(5, resultado, 0.001);
    }

    @Test
    void testeDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        calc.setNumero1(10);
        calc.setNumero2(0);

        assertThrows(ArithmeticException.class, () -> {
            calc.dividir();
        });
    }

    @Test
    void testeResultadoNegativo() {
        Calculadora calc = new Calculadora();
        calc.setNumero1(5);
        calc.setNumero2(10);

        double resultado = calc.subtrair();

        assertEquals(-5, resultado, 0.001);
    }
}