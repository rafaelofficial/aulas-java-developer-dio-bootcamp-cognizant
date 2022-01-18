package com.dio.br;

import java.util.*;

/**
 * Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
 *
 * modelo = gol - consumo = 14,4 km/l
 * modelo = uno - consumo = 15,6 km/l
 * modelo = mobi - consumo = 16,1 km/l
 * modelo = hb20 - consumo = 14,5 km/l
 * modelo = kwid - consumo = 15,6 km/l
 *
 */

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Crie um dicionario e relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario:" + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros:");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelos mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modelosMaisEconomicos = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modelosMaisEconomicos = entry.getKey();
                System.out.println("Modelos mais eficientes: " + modelosMaisEconomicos + " = " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos economico e seu consumo: ");

        // pegar o menor consumo dentro do dicionario.
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        // percorrer o dicionario
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();

        String modelosMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modelosMenosEficiente = entry.getKey();
                System.out.println("Modelos menos eficientes: " + modelosMenosEficiente + " = " + consumoMenosEficiente);
            }
        }


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;

        for (Double valores : carrosPopulares.values()) {
            if (iterator.hasNext()) {
                soma += valores;
            }
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");

        System.out.println("Antes = " + carrosPopulares);
        Iterator<Double> carrosIterator = carrosPopulares.values().iterator();
        while (carrosIterator.hasNext()) {
            if (carrosIterator.next().equals(15.6)) carrosIterator.remove();
        }
        System.out.println("Depois = " + carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carroPopularesLinkedHashMap = new LinkedHashMap<>();
        carroPopularesLinkedHashMap.put("gol", 14.4);
        carroPopularesLinkedHashMap.put("uno", 15.6);
        carroPopularesLinkedHashMap.put("mobi", 16.1);
        carroPopularesLinkedHashMap.put("hb20", 14.5);
        carroPopularesLinkedHashMap.put("kwid", 15.6);
        System.out.println(carroPopularesLinkedHashMap);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopularesTreeMap = new TreeMap<>(carroPopularesLinkedHashMap);
        System.out.println(carrosPopularesTreeMap);

        System.out.println("Apague o dicionário de carros: ");
        carrosPopularesTreeMap.clear();
        System.out.println(carrosPopularesTreeMap);

        System.out.println("Confira se o dicionário está vazia: " + carrosPopularesTreeMap.isEmpty());
    }
}
