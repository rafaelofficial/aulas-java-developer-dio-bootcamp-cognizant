package com.dio.springboottest.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestIntController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testInt() throws Exception {
        RequestBuilder requisicao = MockMvcRequestBuilders.get("/test");
        MvcResult resultado = mockMvc.perform(requisicao).andReturn();

        assertEquals("Bem-vindo, RAFAEL", resultado.getResponse().getContentAsString());
    }

    @Test
    public void testIntComArgumento() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/test?nome=DIO"))
                .andExpect(content().string("Bem-vindo, DIO"));
    }
}
