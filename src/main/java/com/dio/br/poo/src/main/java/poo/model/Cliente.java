package poo.model;

import poo.exception.EnderecoException;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new EnderecoException("Endereço não pode ser nulo!");
        }

        if (endereco.cep == null) {
            throw new EnderecoException("Cep não pode ser nulo!");
        }

        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
