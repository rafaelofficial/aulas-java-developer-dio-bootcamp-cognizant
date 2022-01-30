package com.banco.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Banco extends Conta {

    private String nome;
    private List<Conta> contas;

    public Banco(Cliente cliente) {
        super(cliente);
    }

    public void listaDeClientes() {
        contas.stream()
                .filter(x -> x.getCliente().getNome().equals(getCliente().getNome()))
                .collect(Collectors.toList())
                .forEach(c -> System.out.println(c.getCliente().getNome()))
        ;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Lista de Clientes ===");
    }
}
