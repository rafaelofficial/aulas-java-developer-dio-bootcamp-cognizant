package com.dio.br.estrutura.de.dados.application.fila;

public class No<T> {

    private T objeto;
    private No<T> referenciaNo;

    public No() {
    }

    public No(T objeto) {
        this.referenciaNo = null;
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public No<T> getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No<T> referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "[ No { " + "objeto = " + objeto + " } ]";
    }
}
