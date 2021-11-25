package com.dio.br.application;

import com.dio.br.entities.sobrecarga.Quadrilatero;

public class QuadrilateroMain {

    public static void main(String[] args) {

        // Exercício sobre Retornos
        System.out.println("EXERCÍCIO RETORNO:");
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
