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
     * @param index busca o índice do nó da lista duplamente encadeada
     * @param elemento adiciona um novo elemento na lista
     */
    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    /**
     * @param index remove um elemento encadeado da lista
     */
    public void remove(int index) {
         if (index == 0) {
             primeiroNo = primeiroNo.getNoProximo();
             if (primeiroNo != null) {
                 primeiroNo.setNoPrevio(null);
             }
         } else {
             NoDuplo<T> noAuxiliar = this.getNo(index);
             noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
             if (noAuxiliar != ultimoNo) {
                 noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
             } else {
                 ultimoNo = noAuxiliar;
             }
         }
        this.tamanhoLista--;
    }

    /**
     * Método interno
     * @param index é passado o índice para buscar no Nó da lista
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

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[ Nó { conteúdo=" + noAuxiliar.getConteudo() + " } ] ---->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }

}
