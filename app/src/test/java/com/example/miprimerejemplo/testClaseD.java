package com.example.miprimerejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class testClaseD {

    Calculadora calculadora = new Calculadora();

    @Test
    public void test1(){
        assertEquals(31, calculadora.operacionFib(5));
    }

    @Test
    public void test2(){
        assertEquals(4, calculadora.operacionPot(2,2));
    }

    @Test
    public void test3(){
        assertEquals(0, calculadora.operacionPot(0,0));
    }

}