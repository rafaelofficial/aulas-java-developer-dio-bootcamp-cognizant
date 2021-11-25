package com.dio.br.basico.application.entities.metodos;

public class Calculadora {

    public static void soma(double denominador, double numerador) {
        double resultado = denominador + numerador;
        System.out.println("A soma de " + denominador + " mais " + numerador + " é: " + resultado);
    }

    public static void subtrair(double denominador, double numerador) {
        double resultado = denominador - numerador;
        System.out.println("A subtração de " + denominador + " menos " + numerador + " é: " + resultado);
    }

    public static void multiplicar(double denominador, double numerador) {
        double resultado = denominador * numerador;
        System.out.println("A multiplicação de " + denominador + " multiplicado por " + numerador + " é: " + resultado);
    }

    public static void dividir(double denominador, double numerador) {
        double resultado = denominador / numerador;
        System.out.println("A divisão de " + denominador + " dividido por " + numerador + " é: " + resultado);
    }
}
