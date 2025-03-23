package org.example;

public interface OperacoesBiblioteca {
    void adicionarLivro(Livro livro);
    void removerLivro(Livro livro);
    void listarLivros();
    void buscarLivroPorTitulo(String titulo);
}