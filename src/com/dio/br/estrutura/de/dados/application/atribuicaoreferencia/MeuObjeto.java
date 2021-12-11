package com.dio.br.estrutura.de.dados.application.atribuicaoreferencia;

public class MeuObjeto {

    Integer numero;

    public MeuObjeto(Integer numero) {
        this.numero = numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Meu Objeto {" + "numero=" + numero.toString() + '}';
    }
}
