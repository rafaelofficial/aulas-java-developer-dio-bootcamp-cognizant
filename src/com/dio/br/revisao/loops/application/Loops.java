package com.dio.br.revisao.loops.application;

/**
 * Exercitando...
 * Criar um simples projeto no Intellij e odificar os exemplos dos slides anteriores.
 *
 * Além disto faça um for que mostre os números de 3 até 11, sendo que itere de 2 em 2. Entretanto,
 * quando o loop passar pelo 7, este não deve ser exibido.
 *
 * Também faça um while que exiba um texto 5x, com uma expressão de controle e uma variável booleana.
 */
public class Loops {

    public static void main(String[] args) {

        System.out.println("INCREMENTO:");
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("\nDECREMENTO:");
        for (int i = 10; i > 0; i--) {
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("\nFOR DE 3 ATÉ 11");
        for (int i = 3; i <= 11; i = i + 2) {
            if (i == 7) continue;
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("\nLOOP WHILE:");
        int contador = 0;
        while (contador <= 4) {
            System.out.println(contador + 1 + " Olá Mundo!");
            contador++;
        }
    }
}
