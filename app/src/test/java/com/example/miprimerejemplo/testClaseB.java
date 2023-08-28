package com.example.miprimerejemplo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;


public class testClaseB {

Calculadora calculadora = new Calculadora();

    @Test
    public void test1(){
        assertNotSame(calculadora.operacionPot(5,2), calculadora.operacionPot(5,2));
    }

    @Test
    public void Test2(){
        assertEquals(10, calculadora.operacionPot(3,3));
    }

    @Test
    public void Test3(){
        assertNotEquals(81, calculadora.operacionPot(9,2));
    }

}