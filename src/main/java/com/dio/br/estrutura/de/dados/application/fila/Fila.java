package com.dio.br.estrutura.de.dados.application.fila;

public class Fila {

    private No referenciaEntradaFila;

    public Fila() {
        this.referenciaEntradaFila = null;
    }

    /**
     * @param obj responsável por adicionar um novo elemento na fila
     */
    public void enqueue(Object obj) {
        No novoNo = new No(obj);
        novoNo.setReferenciaNo(referenciaEntradaFila);
        referenciaEntradaFila = novoNo;
    }

    /**
     * @return retorna o primeiro elemento da fila
     */
    public Object first() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaEntradaFila;

            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObjeto();
        }
        return null;
    }

    /**
     * @return exclui o primeiro elemento da fila
     */
    public Object dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaEntradaFila;
            No noAuxiliar = referenciaEntradaFila;

            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return primeiroNo.getObjeto();
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
        No noAuxiliar = referenciaEntradaFila;

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
