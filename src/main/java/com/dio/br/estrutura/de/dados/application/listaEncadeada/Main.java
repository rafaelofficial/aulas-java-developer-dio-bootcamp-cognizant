package com.dio.br.estrutura.de.dados.application.listaEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("1 - Maria");
        minhaListaEncadeada.add("2 - João");
        minhaListaEncadeada.add("3 - Francisca");
        minhaListaEncadeada.add("4 - Paulo");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println("\n" + minhaListaEncadeada);

        System.out.println("\nRemovido: " + minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);

    }
}
