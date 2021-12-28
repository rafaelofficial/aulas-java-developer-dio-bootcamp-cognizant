package com.dio.br.model;

import java.util.Objects;

public class Objeto extends ObjetoArvore<Objeto> {

    Integer meuValor;

    public Objeto(Integer meuValor){
        this.meuValor = meuValor;
    }

    public Integer getMeuValor() {
        return meuValor;
    }

    public void setMeuValor(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return Objects.equals(meuValor, objeto.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(Objeto outro) {
        int i = 0;

        if (this.getMeuValor() > outro.getMeuValor()) {
            i = 1;
        } else if (this.getMeuValor() < outro.getMeuValor()) {
            i = - 1;
        }
        return i;
    }

    @Override
    public String toString() {
        return getMeuValor().toString();
    }
}
