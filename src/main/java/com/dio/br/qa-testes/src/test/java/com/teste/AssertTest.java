package com.teste;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {
    
    @Test
    public void testAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        
        assertArrayEquals(esperado, atual);
    }
    
    @Test
    public void testAssertEquals() {
        assertEquals("text", "text");
    }

    @Test
    public void testAsserFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(new Object());
    }

    @Test
    public void testAssertSame() {
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    @Test
    public void testAssertNotSame() {
        Integer aNumber = Integer.valueOf(768);
        assertSame(aNumber, aNumber);
    }
}
