package com.dio.br;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> calda;
    private int tamanhoLista;

    /**
     * testa se a lista está vazia ou não
     * @return retorna um valor booleano
     */
    public boolean isEmpty() {
        return tamanhoLista == 0 ? true : false;
    }

    /**
     * @return retorna o tamanho da lista
     */
    public int size() {
        return this.tamanhoLista;
    }


}
