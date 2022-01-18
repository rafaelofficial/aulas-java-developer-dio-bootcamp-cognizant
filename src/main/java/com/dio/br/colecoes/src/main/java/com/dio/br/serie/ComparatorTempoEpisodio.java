package com.dio.br.serie;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie o1, Serie o2) {
        return o1.getTempoEpisodio().compareTo(o2.getTempoEpisodio());
    }
}
