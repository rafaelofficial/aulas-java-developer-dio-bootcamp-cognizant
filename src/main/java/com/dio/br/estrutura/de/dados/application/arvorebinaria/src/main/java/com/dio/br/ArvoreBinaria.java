package com.dio.br;

public class ArvoreBinaria<T extends Comparable<T>> {

    private NoBinario<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    /**
     * Método auxiliar
     * @param conteudo recebe o conteúdo de um nó
     */
    public void inserir(T conteudo) {
        NoBinario<T> novoNo = new NoBinario<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    /**
     * @param atual se for nulo, o nó atual estará na raiz
     * @param novoNo passa a ser a raiz
     * @return retorna o nó atual
     */
    private NoBinario<T> inserir(NoBinario<T> atual, NoBinario<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsquerdo(inserir(atual.getNoEsquerdo(), novoNo));
        } else {
            atual.setNoDireito(inserir(atual.getNoDireito(), novoNo));
        }
        return atual;
    }

}
