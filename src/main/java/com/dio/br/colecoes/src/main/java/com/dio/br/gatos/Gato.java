package com.dio.br.gatos;

public class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", idade=" + idade + ", cor='" + cor + '\'' + '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}
