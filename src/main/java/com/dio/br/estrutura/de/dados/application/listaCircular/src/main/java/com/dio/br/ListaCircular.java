package com.dio.br;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    /**
     * @param index remove o elemento índice passado por parâmetro
     */
    public void remove(int index) {
        if (index >= tamanhoLista) throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista.");

        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1) {
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;

    }

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
