package com.dio.br.application;

import com.dio.br.entities.metodos.Calculadora;
import com.dio.br.entities.metodos.Emprestimo;
import com.dio.br.entities.metodos.Mensagem;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("EXERCÍCIO CALCULADORA:");
        Calculadora.soma(3, 6);
        Calculadora.subtrair(9, 1.8);
        Calculadora.multiplicar(7, 8);
        Calculadora.dividir(5, 2.5);

        // Mensagem
        System.out.println();
        System.out.println("EXERCÍCIO MENSAGEM:");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(22);

        // Empréstimo
        System.out.println();
        System.out.println("EXERCÍCIO EMPRÉSTIMO:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
