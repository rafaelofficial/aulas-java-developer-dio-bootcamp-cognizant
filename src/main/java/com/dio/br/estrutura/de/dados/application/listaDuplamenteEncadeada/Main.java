package com.dio.br.estrutura.de.dados.application.listaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaDuplaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDuplaEncadeada.add("C1");
        minhaListaDuplaEncadeada.add("C2");
        minhaListaDuplaEncadeada.add("C3");
        minhaListaDuplaEncadeada.add("C4");
        minhaListaDuplaEncadeada.add("C5");
        minhaListaDuplaEncadeada.add("C6");
        minhaListaDuplaEncadeada.add("C7");
        // mostra a lista
        System.out.println(minhaListaDuplaEncadeada);
        // remove elemento da lista
        minhaListaDuplaEncadeada.remove(3);
        // adiciona um elemento no índice 3 da lista
        minhaListaDuplaEncadeada.add(3, "99");
        // mostra a lista
        System.out.println(minhaListaDuplaEncadeada);
        // pega o elemento da lista e imprime
        System.out.println(minhaListaDuplaEncadeada.get(3));
        // mostra a lista
        System.out.println(minhaListaDuplaEncadeada);
    }

}
