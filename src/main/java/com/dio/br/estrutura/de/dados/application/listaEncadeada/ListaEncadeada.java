package com.dio.br.estrutura.de.dados.application.listaEncadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    /**
     * @param conteudo adiciona um novo elemento na lista
     */
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    /**
     * @param index pega o nó num determinado índice
     * @return retorna o conteúdo do índice
     */
    public T get(int index) {
        return getNo(index).getConteudo();
    }

    /**
     * Método interno
     * @param index pega o nó num determinado índice
     * @return retorna o índice para o próximo nó
     */
    private No<T> getNo(int index) {
        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noDeRetorno = null;

        for (int i = 0; i <= index; i++) {
            noDeRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noDeRetorno;
    }

    /**
     *
     * @param index passar qual o índice que será removido
     * @return retorna o conteúdo do elemento removido
     */
    public T remove(int index) {
        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
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
     * Método interno
     * @param index faz a validação do índice da lista encadeada
     */
    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice: " + index + " desta lista. A lista vai até o índice: " + ultimoIndice);
        }
    }

    /**
     * @return verifica se a lista está vazia
     */
    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    /**
     *
     * @return constrói a lista e retorna a string no console
     */
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[ Nó { " + "Conteúdo = " + noAuxiliar.getConteudo() + " } ] ---->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
