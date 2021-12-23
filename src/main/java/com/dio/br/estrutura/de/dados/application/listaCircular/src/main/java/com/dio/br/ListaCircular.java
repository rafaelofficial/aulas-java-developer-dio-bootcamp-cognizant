package com.dio.br;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    /**
     * @param index busca o elemento passado por parâmetro
     * @return retorna o conteúdo pego da lista
     */
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    /**
     * Método auxiliar
     * @param index pega o índice da lista
     * @return retorna o elemento da cauda da lista
     */
    private No<T> getNo(int index) {
        if (this.isEmpty()) throw new IndexOutOfBoundsException("A lista está vazia.");
        if (index == 0) return this.cauda;

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

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
