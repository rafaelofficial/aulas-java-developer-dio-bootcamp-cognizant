package com.dio.br.entities.sobrecarga;

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("A área do quadrado é: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A área de um retângulo é: " + lado1 * lado2);
    }

    public static void area(double baseMenor, double baseMaior, double altura) {
        System.out.println("A área de um trapézio é: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("A área de um losango é: " + diagonal1 * diagonal2);
    }
}
