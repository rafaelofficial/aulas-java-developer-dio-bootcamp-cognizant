package com.dio.br.application;

import com.dio.br.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Carro("Honda"));
        listaDeCarros.add(new Carro("Chevrolet"));
        listaDeCarros.add(new Carro("Volkswagem"));
        listaDeCarros.add(new Carro("Ford"));

        System.out.println(listaDeCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Audi");
        Carro carro2 = new Carro("Mercedes");

        System.out.println(carro1.equals(carro2));
    }
}
