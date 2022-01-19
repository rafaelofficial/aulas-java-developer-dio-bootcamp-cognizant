package com.dio.br.livros.ex;

import java.util.*;

/**
 * Dada a população estimada de alguns estados do NE brasileiro, faça:
 *
 * Estado = PE - População = 9.616.621
 * Estado = AL - População = 3.351.543
 * Estado = CE - População = 9.187.103
 * Estado = RN - População = 3.534.265
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações:");

        Map<String, Integer> estadosDoBrasil = new HashMap<>() {{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        System.out.println(estadosDoBrasil);

        System.out.println("Substitua a população do estado do RN por 3.534.165:");
        estadosDoBrasil.put("RN", 3534165);
        System.out.println(estadosDoBrasil);

        System.out.println("Confira se o estado da PB está no dicionário, caso não adicione: PB - 4.039.277:");
        if (estadosDoBrasil.containsKey("PB")) {
            return;
        } else {
            estadosDoBrasil.put("PB", 4039277);
            System.out.println(estadosDoBrasil);
        }

        System.out.println("Exiba a população do PE: " + estadosDoBrasil.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado:");
        Map<String, Integer> estadosDoBrasilLinkedHashMap = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosDoBrasilLinkedHashMap);

        System.out.println("Exiba os estados e suas populações em ordem alfabética:");
        Map<String, Integer> estadosDoBrasilTreeMap = new TreeMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosDoBrasilTreeMap);

        System.out.println("Exiba o estado com menor população e sua quantidade:");

        Integer menorPopulacaoPorEstados = Collections.min(estadosDoBrasil.values());

        String menorEstado = "";
        for (Map.Entry<String, Integer> entry : estadosDoBrasil.entrySet()) {
            if (entry.getValue().equals(menorPopulacaoPorEstados)) {
                menorEstado = entry.getKey();
                System.out.println(menorEstado + " = " + menorPopulacaoPorEstados);
            }
        }

        System.out.println("Exiba o estado com maior população e sua quantidade:");
        Integer maiorPopulacaoPorEstados = Collections.max(estadosDoBrasil.values());

        String maiorEstado = "";
        for (Map.Entry<String, Integer> entry2 : estadosDoBrasil.entrySet()) {
            if (entry2.getValue().equals(maiorPopulacaoPorEstados)) {
                maiorEstado = entry2.getKey();
                System.out.println(maiorEstado + " = " + maiorPopulacaoPorEstados);
            }
        }

        Iterator<Integer> estadosIterator = estadosDoBrasil.values().iterator();

        Double soma = 0.0;
        for (Integer totalEstados : estadosDoBrasil.values()) {
            if (estadosIterator.hasNext()) {
                soma += totalEstados;
            }
        }
        System.out.println("Exiba a soma da população desses estados: " + String.format("%.2f", soma));


        System.out.println("Exiba a média da população deste dicionário de estados: " + (String.format("%.2f", (soma / estadosDoBrasil.size()))));

        System.out.println("Remova os estados com a população menor que 4.000.000:");

        Iterator<Integer> estadosIteratorRemove = estadosDoBrasil.values().iterator();
        while (estadosIteratorRemove.hasNext()) {
            if (estadosIteratorRemove.next() < 4000000) estadosIteratorRemove.remove();
        }
        System.out.println(estadosDoBrasil);

        System.out.println("Apague o dicionário de estados:");
        estadosDoBrasil.clear();
        System.out.println(estadosDoBrasil);

        System.out.println("Confira se o dicionário está vazio:" + estadosDoBrasil.isEmpty());
    }
}
