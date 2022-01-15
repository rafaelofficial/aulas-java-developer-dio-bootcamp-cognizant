package com.dio.br.gatos.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
         * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
         * e emque mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc.)
         */
        List<Temperatura> temp = new ArrayList<>();

        temp.add(0, new Temperatura("1 - Janeiro", 32));
        temp.add(1, new Temperatura("2 - Fevereiro", 38));
        temp.add(2, new Temperatura("3 - Março", 40));
        temp.add(3, new Temperatura("4 - Abril", 30));
        temp.add(4, new Temperatura("5 - Maio", 35));
        temp.add(5, new Temperatura("6 - Junho", 37));

        System.out.println(temp);

        double soma = 0.0;
        for (Temperatura somaTemp : temp) {
            soma = soma + somaTemp.getTemperatura();
        }

        double media = 0.0;
        media = soma / temp.size();
        System.out.println("Média: " + String.format("%.2f", media));

        for (Temperatura acimaMedia : temp) {
            if (!(media > acimaMedia.getTemperatura())) System.out.println(acimaMedia);
        }
    }
}
