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
        Map<String, Double> modelosPopulares = new HashMap<>() {{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};
        System.out.println(modelosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        modelosPopulares.put("gol", 15.2);
        System.out.println(modelosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario:" + modelosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + modelosPopulares.get("uno"));

        System.out.println("Exiba os modelos:");
        Set<String> modelos = modelosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros:");
        Collection<Double> consumos = modelosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelos mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(modelosPopulares.values());
        Set<Map.Entry<String, Double>> entries = modelosPopulares.entrySet();

        String modelosMaisEconomicos = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modelosMaisEconomicos = entry.getKey();
                System.out.println("Modelos mais eficientes: " + modelosMaisEconomicos + " = " + consumoMaisEficiente);
            }
        }
    }
}
