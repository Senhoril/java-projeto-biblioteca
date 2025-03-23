package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Criar instâncias de Livro
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", 1997);

        // Criar instâncias de Usuário
        Usuario usuario1 = new Usuario("João Silva", "123.456.789-00");

        // Criar instância de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar livros ao catálogo
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Listar livros disponíveis
        biblioteca.listarLivros();

        // Emprestar um livro
        usuario1.emprestarLivro(livro1);

        // Tentar emprestar o mesmo livro novamente
        usuario1.emprestarLivro(livro1);

        // Devolver o livro
        usuario1.devolverLivro(livro1);

        // Buscar um livro pelo título
        biblioteca.buscarLivroPorTitulo("Harry Potter");
    }
}