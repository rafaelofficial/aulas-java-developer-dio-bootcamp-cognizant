package com.dio.br.repeticao.application;

import java.util.Scanner;

/**
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro represemtadp o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome).
 */
public class NomeIdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;

        while (true) {
            System.out.println("Nome: ");
            nome = sc.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            int idade = sc.nextInt();
        }
        System.out.println("Continua aqui...");
    }
}
