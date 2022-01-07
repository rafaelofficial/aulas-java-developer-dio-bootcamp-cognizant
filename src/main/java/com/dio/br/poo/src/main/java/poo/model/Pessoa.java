package poo.model;

import poo.exception.PessoaException;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa { FISICA, JURIDICA }

    public Integer codigo;
    public String nome;
    public String documento;
    public TipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            throw new PessoaException("Documento nao pode ser nulo ou vazio");
        }
        // verifica se o documento está nulo ou vazio

        if (documento.length() < TAMANHO_CPF) {
            setDocumento(documento, tipo = TipoPessoa.FISICA);
        } else if (documento.length() < TAMANHO_CNPJ) {
            setDocumento(documento, tipo = TipoPessoa.JURIDICA);
        } else {
            throw new PessoaException("Documento invalido para pessoa física ou jurídica");
        }
        // faz a validacao do cpf e cnpj
    }

    private void setDocumento(String documento, TipoPessoa tipo) {
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }
}
