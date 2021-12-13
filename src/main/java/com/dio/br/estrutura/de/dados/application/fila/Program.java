package com.dio.br.estrutura.de.dados.application.fila;

public class Program {

    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("1 - Maria"));
        minhaFila.enqueue(new No("2 - João"));
        minhaFila.enqueue(new No("3 - Pedro"));
        minhaFila.enqueue(new No("4 - Júlia"));
        System.out.println("---------FILA---------");
        System.out.println(minhaFila);

        System.out.println("\nSaiu da fila:");
        System.out.println(minhaFila.dequeue());

        System.out.println("\n---------FILA---------");
        System.out.println(minhaFila);

        minhaFila.enqueue(new No("5 - Francisco (último da fila)"));
        System.out.println("\n---------FILA---------");
        System.out.println(minhaFila);

        System.out.println("\n---------Pega o próximo da fila--------");
        System.out.println(minhaFila.first());
        System.out.println("\n---------FILA---------");
        System.out.println(minhaFila);

    }
}
