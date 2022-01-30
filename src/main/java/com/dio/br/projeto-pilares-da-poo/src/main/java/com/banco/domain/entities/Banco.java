package com.banco.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco extends Conta {

    private String nome;
    private List<Conta> contas;

    public Banco(Cliente cliente) {
        super(cliente);
    }

    public void listaDeClientes() {
        List<String> clientes = new ArrayList<>();
        for (Conta conta : contas) {
            clientes.add(conta.getCliente().getNome());
            System.out.println(clientes);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Lista de Clientes ===");
    }
}
