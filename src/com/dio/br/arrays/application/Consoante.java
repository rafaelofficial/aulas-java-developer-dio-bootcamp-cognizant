package com.dio.br.arrays.application;

import java.util.Scanner;

/**
 * Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */
public class Consoante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeDeConsoantes = 0;

        System.out.println("INFORME AS LETRAS");
        int contador = 0;
        do {
            System.out.print("Letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                quantidadeDeConsoantes++;
            }
            contador++;
        } while (contador < consoantes.length);

        System.out.println("CONSOANTES:");
        for (String consoante: consoantes) {
            if (consoante != null) System.out.print(consoante + " ");
        }
        System.out.print("\nQuantidade de Consoantes: " + quantidadeDeConsoantes);
        sc.close();
    }
}
