package com.dio.br.revisao.arrays.application;

import java.util.Random;

/**
 * Exercitando...
 * Crie um simples projeto no InteliJ e codificar os exemplos dos slides anteriores para
 * compreender a criação e uso de arrays e matrizes.
 *
 * Crie também arrays dos outros tipos de dados conhecidos. Use o for-each para percorrer ambos.
 */
public class Arrays {

    public static void main(String[] args) {

        Random random = new Random();

        int[] idades = new int[] {27, 16, 18, 12, 32, 10, 22, 25};
        String[] nomes = new String[] {"Julia", "Pedro", "Samuel"};
        int[][] matriz = new int[4][4];

        System.out.println("IDADES:");
        for (int idade : idades) {
            if (idade < 18) {
                System.out.println(idade + ", Menor idade.");
            } else {
                System.out.println(idade + ", Maior idade.");
            }
        }

        System.out.println("\nNOMES:");
        for (String nome : nomes) {
            System.out.println(nome + ", ");
        }

        System.out.println("\nMATRIZ FOR CLÁSSICO:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMATRIZ FOR EACH:");
        for (int[] mat1 : matriz) {
            for (int mat2 : mat1) {
                System.out.print(mat2 + " ");
            }
            System.out.println();
        }
    }
}
