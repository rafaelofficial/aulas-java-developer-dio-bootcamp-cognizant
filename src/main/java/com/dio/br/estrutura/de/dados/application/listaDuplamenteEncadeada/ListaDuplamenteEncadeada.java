package com.dio.br.estrutura.de.dados.application.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    /**
     *
     * @param index passa um índice
     * @return retorna o conteúdo do nó da lista duplamente encadeada
     */
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    /**
     * @param elemento adiciona um novo elemento na lista
     */
    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if (primeiroNo == null) primeiroNo = novoNo;
        if (ultimoNo != null) ultimoNo.setNoProximo(novoNo);
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    /**
     * Método interno
     * @param index passa o índice
     * @return retorna o próximo nó da lista duplamente encadeada
     */
    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    /**
     * @return retorna o tamanho da lista
     */
    public int size() {
        return this.tamanhoLista;
    }

}
