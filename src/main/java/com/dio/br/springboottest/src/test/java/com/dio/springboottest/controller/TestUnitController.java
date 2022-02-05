package com.dio.springboottest.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUnitController {

    @Test
    public void testUnit() {
        TestController controller = new TestController();
        String resultado = controller.saudacao("RAFAEL");

        Assertions.assertEquals("Bem-vindo, RAFAEL", resultado);
    }
}
