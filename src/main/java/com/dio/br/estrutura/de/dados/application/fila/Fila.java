package com.dio.br.estrutura.de.dados.application.fila;

public class Fila<T> {

    private No<T> referenciaEntradaFila;

    public Fila() {
        this.referenciaEntradaFila = null;
    }

    /**
     * @param obj responsável por adicionar um novo elemento na fila
     */
    public void enqueue(T obj) {
        No<T> novoNo = new No<T>(obj);
        novoNo.setReferenciaNo(referenciaEntradaFila);
        referenciaEntradaFila = novoNo;
    }

    /**
     * @return retorna o primeiro elemento da fila
     */
    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = referenciaEntradaFila;

            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    break;
                }
            }
            return (T)primeiroNo.getObjeto();
        }
        return null;
    }

    /**
     * @return exclui o primeiro elemento da fila
     */
    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = referenciaEntradaFila;
            No<T> noAuxiliar = referenciaEntradaFila;

            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObjeto();
        }
        return null;
    }

    /**
     * @return verifica se a fila está vazia
     */
    public boolean isEmpty() {
        return referenciaEntradaFila == null ? true : false;
    }

    // constroi a fila
    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = referenciaEntradaFila;

        if (referenciaEntradaFila != null) {
            while (true) {
                stringRetorno += "[ Nó { objeto = " + noAuxiliar.getObjeto() + " } ] ---->";
                if (noAuxiliar.getReferenciaNo() != null) {
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
