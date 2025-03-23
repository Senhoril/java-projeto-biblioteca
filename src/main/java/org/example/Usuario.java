package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    // Metodo para adicionar um livro ao empréstimo
    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livrosEmprestados.add(livro);
            livro.setDisponivel(false);
            System.out.println("Livro '" + livro.getTitulo() + "' emprestado para " + nome);
        } else {
            System.out.println("Livro '" + livro.getTitulo() + "' não está disponível.");
        }
    }

    // Metodo para devolver um livro
    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.setDisponivel(true);
            System.out.println("Livro '" + livro.getTitulo() + "' devolvido por " + nome);
        } else {
            System.out.println("O usuário " + nome + " não possui o livro '" + livro.getTitulo() + "'.");
        }
    }
}
