package com.dio.br.livros;

import java.util.Objects;

public class Livro {

    private String nome;
    private Integer quantidadeDePaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(Integer quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public Livro(String nome, Integer quantidadeDePaginas) {
        this.nome = nome;
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(quantidadeDePaginas, livro.quantidadeDePaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantidadeDePaginas);
    }

    @Override
    public String toString() {
        return "Livro{" + "nome='" + nome + '\'' + ", quantidadeDePaginas=" + quantidadeDePaginas + '}';
    }
}
