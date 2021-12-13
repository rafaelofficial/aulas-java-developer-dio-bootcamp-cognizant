package com.dio.br.estrutura.de.dados.application.fila;

public class Program {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("1 - Maria");
        minhaFila.enqueue("2 - João");
        minhaFila.enqueue("3 - Pedro");
        minhaFila.enqueue("4 - Júlia");
        System.out.println("---------FILA---------");
        System.out.println(minhaFila);

        System.out.println("\nSaiu da fila:");
        System.out.println(minhaFila.dequeue());

        System.out.println("\n---------FILA---------");
        System.out.println(minhaFila);

        minhaFila.enqueue("5 - Francisco (último da fila)");
        System.out.println("\n---------FILA---------");
        System.out.println(minhaFila);

        System.out.println("\n---------Pega o próximo da fila--------");
        System.out.println(minhaFila.first());
        System.out.println("\n---------FILA---------");
        System.out.println(minhaFila);

    }
}
