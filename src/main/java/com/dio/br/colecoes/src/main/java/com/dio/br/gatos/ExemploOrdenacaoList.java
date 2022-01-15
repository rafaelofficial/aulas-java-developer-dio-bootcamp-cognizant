package com.dio.br.gatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {

    // Dado as seguintes informação sobre meus gatos, crie uma lista e ordene esta lista exibindo:
    // (nome, idade e cor)

    // Gato 1 = nome: Jon, idade: 18, cor: preto
    // Gato 2 = nome: Simba, idade: 6, cor: tigrodo
    // Gato 3 = nome: Jon, idade: 12, cor amarelo

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
                add(new Gato("Jon", 18, "preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("Ordem de inserção:");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória:");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (nome):");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem idade:");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem cor:");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem nome/cor/idade");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
