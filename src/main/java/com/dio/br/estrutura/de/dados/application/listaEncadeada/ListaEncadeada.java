package com.dio.br.estrutura.de.dados.application.listaEncadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    /**
     * @return retorna o tamanho da lista
     */
    public int size() {
        int tamanhoDaLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;
        while (true) {
            if (referenciaAuxiliar != null) {
                tamanhoDaLista++;
                if (referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoDaLista;
    }

    /**
     * @return verifica se a lista está vazia
     */
    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

}
