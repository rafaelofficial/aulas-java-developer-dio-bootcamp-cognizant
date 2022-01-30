package com.banco.domain;

import com.banco.domain.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();

        Cliente cliente = new Cliente();
        cliente.setNome("Rafael");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        cc.imprimirExtrato();

        Conta poupanca = new ContaPoupanca(cliente);
        cc.transferir(30, poupanca);
        poupanca.imprimirExtrato();

        Banco banco = new Banco(cliente);
        banco.setNome(cliente.getNome());
        banco.setContas(contas);
        contas.add(cc);
        banco.imprimirExtrato();
        banco.listaDeClientes();
    }
}
