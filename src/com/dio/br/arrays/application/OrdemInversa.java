package com.dio.br.arrays.application;

/**
 * Crie um vetor de 6 números e mostre-os na ordem inversa.
 */
public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor: ");
        int contador = 0;
        while (contador <= (vetor.length - 1)) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length -1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
