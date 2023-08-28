package com.example.miprimerejemplo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class testClaseA {

    Calculadora calculadora = new Calculadora();
    @Test
    public void test1(){
        assertEquals(25, calculadora.operacionPot(5,2));
    }

    @Test
    public void test2(){
       assertNotNull(calculadora);
    }

    @Test
    public void test3(){
        assertEquals(55, calculadora.operacionFib(10));
    }


}