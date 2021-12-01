package com.dio.br.revisao.interroptores.application;

/**
 * Exercitando...
 *
 * Criar um simples projeto no IntelliJ e codificar os exemplos dos
 * slides anteriores sobre break e continue.
 *
 * Além disto faça um for de 1 até 14, sendo que somente múltiplos de 2 sejam listados. Entretanto,
 * quando o loop passar pelo 12, o mesmo deve ser abortado.
 *
 * Faça o exemplo acima com o while.
 */
public class Interroptores {

    public static void main(String[] args) {
        System.out.println("LAÇO FOR:");
        for (int i = 1; i <= 14; i++) {
            if (i % 2 == 0) System.out.println("O valor de 'i' é: " + i);
            if (i == 12) break;
        }

        System.out.println("\nLAÇO WHILE:");
        int numero = 1;
        while (numero <= 14) {
            if (numero % 2 == 0) System.out.println("O valor de 'numero' é: " + numero);
            if (numero == 12) break;
            numero++;
        }
    }
}
