package com.dio.projetofeign1.controller;

import com.dio.projetofeign1.entities.Contato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato retornaContato() {
        return Contato.builder()
                .id(1L)
                .nome("Rafael")
                .telefone("11111-2222")
                .build();
    }
}
