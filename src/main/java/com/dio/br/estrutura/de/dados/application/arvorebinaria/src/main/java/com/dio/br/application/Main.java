package com.dio.br.application;

import com.dio.br.ArvoreBinaria;
import com.dio.br.model.Objeto;

public class Main {

    public static void main(String[] args) {
        ArvoreBinaria<Objeto> minhaArvore = new ArvoreBinaria<>();

        // criando a árvore binária
        minhaArvore.inserir(new Objeto(13));
        minhaArvore.inserir(new Objeto(10));
        minhaArvore.inserir(new Objeto(25));
        minhaArvore.inserir(new Objeto(2));
        minhaArvore.inserir(new Objeto(12));
        minhaArvore.inserir(new Objeto(20));
        minhaArvore.inserir(new Objeto(31));
        minhaArvore.inserir(new Objeto(29));
        minhaArvore.inserir(new Objeto(32));

        // exibe em ordem, pré ordem e pós ordem
        minhaArvore.exibirEmOrdem();
        minhaArvore.exibePreOrdem();
        minhaArvore.exibePosOrdem();
    }
}
