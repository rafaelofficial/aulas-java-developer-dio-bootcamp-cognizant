package com.dio.br.repeticao.application;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Exemplo: 5! = 120 - (5 x 4 x 3 x 2 x 1)
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multiplicacao = 1;

        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao *= i;
        }

        System.out.println(multiplicacao);
    }
}
