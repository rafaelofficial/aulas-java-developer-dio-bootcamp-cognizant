package com.dio.swapi.estrela.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Planeta {

    private Integer idPlaneta;
    private String nome;
    private Double rotacao;
    private Double orbita;
    private Double diametro;
    private String clima;
    private Integer populacao;
}
