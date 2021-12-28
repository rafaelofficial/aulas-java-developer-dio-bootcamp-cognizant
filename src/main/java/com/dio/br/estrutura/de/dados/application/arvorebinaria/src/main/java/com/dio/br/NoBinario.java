package com.dio.br;

public class NoBinario<T extends Comparable<T>> {

    private T conteudo;
    private NoBinario<T> noEsquerdo;
    private NoBinario<T> noDireito;

    public NoBinario() {
    }

    public NoBinario(T conteudo) {
        this.conteudo = conteudo;
        this.noEsquerdo = this.noDireito = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBinario<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoBinario<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoBinario<T> getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(NoBinario<T> noDireito) {
        this.noDireito = noDireito;
    }

    @Override
    public String toString() {
        return "BinarioNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
