package poo;

import poo.exception.EnderecoException;
import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "00000-000";
        // dados do endereço

        Cliente cliente = new Cliente();
        // dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço cadastrado com sucesso!");
        } catch (EnderecoException e) {
            System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
        }
    }
}
