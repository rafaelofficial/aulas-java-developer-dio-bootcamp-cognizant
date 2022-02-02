package com.dio.swapi.estrela.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Nave {

    private Integer idNave;
    private String nome;
    private String modelo;
    private Integer passageiro;
    private Double carga;
    private String classe;
}
