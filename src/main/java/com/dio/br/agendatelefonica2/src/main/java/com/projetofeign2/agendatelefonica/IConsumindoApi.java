package com.projetofeign2.agendatelefonica;

import com.projetofeign2.agendatelefonica.entities.Contato;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "agenda", url = "http://localhost:8080/contato")
public interface IConsumindoApi {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Contato retornaContato();
}
