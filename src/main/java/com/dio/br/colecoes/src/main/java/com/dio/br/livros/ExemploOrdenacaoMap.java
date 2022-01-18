package com.dio.br.livros;

import com.sun.source.doctree.SeeTree;

import java.util.*;

/**
 * Dadas as seguintes informações sobre meus livros favoritos e seus autores,
 * crie um dicionário e ordene-o;
 *
 * autor = Hawking, Stephen - livro = nome: Uma breve história do tempo, páginas: 256;
 * autor = Duhigg, Charles - livro = nome: O poder do hábito, páginas: 408;
 * autor = Harari, Yuval Noah - livro = nome: 21 lições para o século 21, páginas: 432;
 */

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Map<String, Livro> meusLivros = new HashMap<>() {{
           put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
           put("Duhigg, Charles", new Livro("O poder do hábito", 408));
           put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        System.out.println(meusLivros);

        System.out.println("Ordem inserção: ");
        Map<String, Livro> meusLivrosLinkedHashMap = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        System.out.println(meusLivrosLinkedHashMap);

        System.out.println("Ordem alfabética autores: ");
        Map<String, Livro> meusLivrosTreeMap = new TreeMap<>(meusLivrosLinkedHashMap);
        System.out.println(meusLivrosTreeMap);

        System.out.println("Ordem alfabética nomes dos livros: ");
        Set<Map.Entry<String, Livro>> meusLivrosComparaPorNome = new TreeSet<>(new ComparatorNomeLivro());
        meusLivrosComparaPorNome.addAll(meusLivros.entrySet());
        System.out.println(meusLivrosComparaPorNome);

        System.out.println("Ordem números de páginas: ");
        Set<Map.Entry<String, Livro>> meusLivrosComparaPorNumerosDePaginas = new TreeSet<>(new ComparatorPaginaLivro());
        meusLivrosComparaPorNumerosDePaginas.addAll(meusLivros.entrySet());
        System.out.println(meusLivrosComparaPorNumerosDePaginas);
    }
}

class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}

class ComparatorPaginaLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getQuantidadeDePaginas().compareTo(o2.getValue().getQuantidadeDePaginas());
    }
}