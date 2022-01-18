package com.dio.br.serie;

import java.util.*;

/**
 * Dado as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo de episodio);
 *
 * série 1 - Nome: got, genero: fantasia, tempoEpisodio: 60;
 * série 2 - Nome: dark, genero: drama, tempoEpisodio: 60;
 * série 1 - Nome: that '70s show, genero: comédia, tempoEpisodio: 25;
 */

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70s show", "comédia", 25));
        }};
        System.out.println(minhasSeries);

        System.out.println("Ordem insersão: ");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70s show", "comédia", 25));
        }};
        System.out.println(minhasSeries2);

        System.out.println("Ordem natural (Tempo de episódio): ");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        System.out.println(minhasSeries3);

        System.out.println("Ordem nome/genero/tempoEpisodio: ");
        Set<Serie> minhasSeries4 = new TreeSet<Serie>(new ComparatorNomeGeneroTempo());
        minhasSeries4.addAll(minhasSeries);
        System.out.println(minhasSeries4);

        System.out.println("Ordem gênero: ");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
        minhasSeries5.addAll(minhasSeries);
        System.out.println(minhasSeries5);

        System.out.println("Ordem tempo episódio: ");
        Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries6.addAll(minhasSeries);
        System.out.println(minhasSeries6);
    }
}
