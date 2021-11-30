package com.dio.br.repeticao.application;

import java.util.Scanner;

/**
 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */
public class ParEImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeDeNumeros;
        int numero;
        int quantidadeDePares = 0, quantidadeDeImpares = 0;

        System.out.print("Quantidade de Números: ");
        quantidadeDeNumeros = sc.nextInt();

        int contador = 0;
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            if (numero % 2 == 0) quantidadeDePares++;
            else quantidadeDeImpares++;
            contador++;
        } while (contador < quantidadeDeNumeros);

        System.out.println("Quantidade de números Par: " + quantidadeDePares);
        System.out.println("Quantidade de números Ímpar: " + quantidadeDeImpares);
    }
}
