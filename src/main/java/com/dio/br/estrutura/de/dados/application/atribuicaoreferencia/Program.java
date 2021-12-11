package com.dio.br.estrutura.de.dados.application.atribuicaoreferencia;

public class Program {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("Int A : " + intA + ", Int B : " + intB);

        intA = 2;
        System.out.println("Int A : " + intA + ", Int B : " + intB);

        MeuObjeto ObjetoA = new MeuObjeto(1);
        MeuObjeto ObjetoB;

        ObjetoB = ObjetoA;

        System.out.println("Objeto A : " + ObjetoA + ", Objeto B : " + ObjetoB);
        ObjetoA.setNumero(2);
        System.out.println("Objeto A : " + ObjetoA + ", Objeto B : " + ObjetoB);
    }
}
