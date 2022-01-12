package com.dio.br;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crie uma lista e adicione as sete notas:");

        List<Double> notas = new ArrayList<>();

        // adiciona elementos na lista
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.0);
        notas.add(10.0);
        notas.add(7.0);
        notas.add(3.0);
        notas.add(5.0);

        System.out.println("Notas: " + notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adiciona na lista a nota 8.0 na posição 4:");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Verifica se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println("Nota: " + nota);

        System.out.println("Exiba a terceira nora adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a soma dos valores: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);

        System.out.println("Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("Verifica se a lista está vazia: " + notas.isEmpty());

        // Exercício Proposto: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list ArrayList nessa nova lista: ");

        LinkedList<Double> notas2 = new LinkedList<>();

        // adiciona elementos na lista
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.0);
        notas2.add(10.0);
        notas2.add(7.0);
        notas2.add(3.0);
        notas2.add(5.0);

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.peekFirst());

        System.out.println("Mostre a primeira nota da nova Lista removendo-a: " + notas2.pollFirst());
        System.out.println(notas2);

        sc.close();
    }
}
