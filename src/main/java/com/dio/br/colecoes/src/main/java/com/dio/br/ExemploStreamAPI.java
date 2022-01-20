package com.dio.br;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "4", "9", "4", "3", "6", "5", "8", "7", "10");

        System.out.println("Imprima todos os elementos dessa lista de String:");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros:");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(x -> x % 2 == 0 && x > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Mostre a média dos números:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares:");
        List<Integer> numerosAleatoriosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteiros.removeIf(x -> x % 2 != 0);
        System.out.println(numerosAleatoriosInteiros);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream()
                        .skip(3)
                        .map(Integer::parseInt)
                        .sorted(Comparator.comparing(Integer::intValue).reversed())
                        .collect(Collectors.toList())
                        .forEach(System.out::println);

        System.out.println("Retirando os números repetidos da lista, quantos números ficam?:");
        numerosAleatorios.stream()
                        .map(Integer::parseInt)
                        .collect(Collectors.toSet())
                        .forEach(System.out::println);


        System.out.println("Mostre o menor valor da lista:");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .min(Comparator.comparing(Integer::intValue))
                .ifPresent(System.out::println);

        System.out.println("Mostre o maior valor da lista:");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .max(Comparator.comparing(Integer::intValue))
                .ifPresent(System.out::println);

        System.out.println("Pegue apenas os números ímpares e some:");
        IntStream soma = numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .filter(x -> x % 3 == 0);
        System.out.println(soma.sum());

        System.out.println("Mostre a lista na ordem númerica:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .sorted()
                .forEach(System.out::println);

        System.out.println("Agrupe os valores impares múltiplos de 3 ede 5:");
        // dica: collect(Collections.groupingBy(new Function());
        Map<Boolean, List<Integer>> numerosAleatoriosAgrupados = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(x -> (x % 3 == 0 || x % 5 == 0)));
        System.out.println(numerosAleatoriosAgrupados);
    }
}
