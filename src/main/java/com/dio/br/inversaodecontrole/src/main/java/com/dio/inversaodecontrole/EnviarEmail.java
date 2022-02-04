package com.dio.inversaodecontrole;

public class EnviarEmail {

    public EnviarEmail(String tipo, String endereco, String senha) {
    }

    public static EnviarEmail obterDadosEmail() {
        return new EnviarEmail("stmp", "constato@email.com", "senha");
    }

    public void retornar(String mensagem) {
        System.out.println("Email enviado!");
    }
}
