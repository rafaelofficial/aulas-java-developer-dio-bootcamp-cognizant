package com.dio.br.estrutura.de.dados.application.fila;

public class No {

    private Object objeto;
    private No referenciaNo;

    public No() {
    }

    public No(Object objeto) {
        this.referenciaNo = null;
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "[ No { " + "objeto = " + objeto + " } ]";
    }
}
