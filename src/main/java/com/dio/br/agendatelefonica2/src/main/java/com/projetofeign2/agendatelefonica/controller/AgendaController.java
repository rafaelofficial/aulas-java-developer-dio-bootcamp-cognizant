package com.projetofeign2.agendatelefonica.controller;

import com.projetofeign2.agendatelefonica.IConsumindoApi;
import com.projetofeign2.agendatelefonica.entities.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private IConsumindoApi consumindoApi;

    @GetMapping
    public Contato retornaContato() {
        return consumindoApi.retornaContato();
    }
}
