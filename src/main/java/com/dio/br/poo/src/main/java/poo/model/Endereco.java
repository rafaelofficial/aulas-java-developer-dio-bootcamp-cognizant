package poo.model;

import java.util.List;

public class Endereco {

    public enum TipoEndereco {
        RESEDENCIAL,
        ENTREGA,
        TRABALHO
    }

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;
}
