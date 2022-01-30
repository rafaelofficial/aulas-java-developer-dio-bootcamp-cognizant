package com.banco.domain;

import com.banco.domain.entities.Cliente;
import com.banco.domain.entities.Conta;
import com.banco.domain.entities.ContaCorrente;
import com.banco.domain.entities.ContaPoupanca;

public class Program {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Rafael");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(cliente);
        cc.transferir(70, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
