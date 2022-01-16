package com.dio.br;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {
        // Dado uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        // Exemplos de uso do Set:
        System.out.println("Crie um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Notas: " + notas);

        /**System.out.println("Exiba a posição da nota 5.0:"); // o Set não possui um método para este
        System.out.println("Adicione na lista a nota 8.0 na posição 4:"); // o Set não possui um método para este
        System.out.println("Substitua a nota 5.0 pela nota 6.0:"); // o Set não possui um método para este */

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        //System.out.println("Exiba a terceira nota adicionada: "); // o Set não o método indexOf

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // soma dos valores
        Iterator<Double> doubleIterator = notas.iterator();
        double soma = 0.0;
        while (doubleIterator.hasNext()) {
            soma += doubleIterator.next();
        }
        System.out.println("Exiba a soma dos valores: " + String.format("%.2f", soma));

        System.out.println("Exiba a média das notas: " + String.format("%.2f", (soma / notas.size())));

        System.out.println("Remova a nota zero: " + notas.remove(0d));
        System.out.println(notas);

        //System.out.println("Remova a nota da posição zero: "); // não dá para trabalhar com indices com a coleção Set

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> doubleIterator2 = notas.iterator();
        while (doubleIterator2.hasNext()) {
            Double next = doubleIterator2.next();
            if (next < 7) doubleIterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas3.isEmpty());
    }
}
