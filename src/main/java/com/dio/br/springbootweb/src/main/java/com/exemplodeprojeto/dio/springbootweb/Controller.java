package com.exemplodeprojeto.dio.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String menssagem() {
        return "<h1>Nosso exemplo de Projeto Spring Boot Web</h1>";
    }
}
