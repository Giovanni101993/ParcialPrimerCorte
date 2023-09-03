package com.example.miprimerejemplo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testClaseC {
    Calculadora calculadora = new Calculadora();

    @Test
    public void test1(){
        assertEquals(1, calculadora.operacionPot(10, 0));
    }

    @Test
    public void test2(){
        assertEquals(0, calculadora.operacionPot(0,1));
    }

    @Test
    public void test3(){
        assertEquals(100, calculadora.operacionPot(10,2));
    }
}