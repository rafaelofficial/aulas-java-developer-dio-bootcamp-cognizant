package com.dio.swapi.estrela.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class Piloto {

    private Integer idPedido;
    private String nome;
    private String anoNascimento;
    private Integer idPlaneta;

    // relacionamentos
    private Planeta planeta;
    private List<Nave> naves;
}
