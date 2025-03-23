package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements OperacoesBiblioteca {
    private List<Livro> catalogo;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
    }

    @Override
    public void adicionarLivro(Livro livro) {
        catalogo.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado ao catálogo.");
    }

    @Override
    public void removerLivro(Livro livro) {
        if (catalogo.remove(livro)) {
            System.out.println("Livro '" + livro.getTitulo() + "' removido do catálogo.");
        } else {
            System.out.println("Livro '" + livro.getTitulo() + "' não encontrado no catálogo.");
        }
    }

    @Override
    public void listarLivros() {
        if (catalogo.isEmpty()) {
            System.out.println("O catálogo está vazio.");
        } else {
            System.out.println("Catálogo de Livros:");
            for (Livro livro : catalogo) {
                System.out.println(livro);
            }
        }
    }

    @Override
    public void buscarLivroPorTitulo(String titulo) {
        for (Livro livro : catalogo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + livro);
                return;
            }
        }
        System.out.println("Livro com título '" + titulo + "' não encontrado.");
    }
}
