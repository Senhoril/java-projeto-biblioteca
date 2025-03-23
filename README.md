# Sistema de Gerenciamento de Biblioteca

Este projeto é um sistema simples de gerenciamento de biblioteca desenvolvido em Java 23. Ele demonstra os conceitos fundamentais da Orientação a Objetos (OO), como Encapsulamento, Herança, Polimorfismo e Abstração. O sistema permite gerenciar livros, usuários e empréstimos de forma organizada.

---

## **Recursos do Sistema**

- **Cadastro de Livros**: Adicione, remova e liste livros no catálogo da biblioteca.
- **Gerenciamento de Usuários**: Crie usuários e registre empréstimos e devoluções de livros.
- **Busca de Livros**: Pesquise livros pelo título.
- **Disponibilidade de Livros**: Verifique se um livro está disponível para empréstimo.
- **Operações Básicas**: Implementa uma interface `OperacoesBiblioteca` para definir operações padrão.

---

## **Estrutura do Projeto**

O projeto é composto pelas seguintes classes principais:

1. **`Livro`**: Representa um livro com atributos como título, autor, ano de publicação e disponibilidade.
2. **`Usuario`**: Representa um usuário da biblioteca com métodos para emprestar e devolver livros.
3. **`Emprestimo`**: Gerencia os empréstimos de livros.
4. **`OperacoesBiblioteca`**: Interface que define operações básicas da biblioteca.
5. **`Biblioteca`**: Controla o sistema como um todo, incluindo o catálogo de livros e operações de gerenciamento.

---

## **Como Executar o Projeto**

1. **Pré-requisitos**:
   - JDK 23 instalado.
   - IDE compatível com Java (ex.: IntelliJ IDEA, Eclipse ou VS Code).

2. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git

   
---

### **Diagrama de Classes (Mermaid)**

```mermaid
classDiagram
    class Livro {
        -String titulo
        -String autor
        -int anoPublicacao
        -boolean disponivel
        +Livro(String titulo, String autor, int anoPublicacao)
        +getTitulo(): String
        +getAutor(): String
        +getAnoPublicacao(): int
        +isDisponivel(): boolean
        +setDisponivel(boolean disponivel): void
        +toString(): String
    }

    class Usuario {
        -String nome
        -String cpf
        -List~Livro~ livrosEmprestados
        +Usuario(String nome, String cpf)
        +getNome(): String
        +getCpf(): String
        +getLivrosEmprestados(): List~Livro~
        +emprestarLivro(Livro livro): void
        +devolverLivro(Livro livro): void
    }

    class OperacoesBiblioteca {
        <<interface>>
        +adicionarLivro(Livro livro): void
        +removerLivro(Livro livro): void
        +listarLivros(): void
        +buscarLivroPorTitulo(String titulo): void
    }

    class Biblioteca {
        -List~Livro~ catalogo
        +Biblioteca()
        +adicionarLivro(Livro livro): void
        +removerLivro(Livro livro): void
        +listarLivros(): void
        +buscarLivroPorTitulo(String titulo): void
    }

    class Main {
        +main(String[] args): void
    }

    Usuario "1" -- "0..*" Livro : empresta/devolve
    Biblioteca "1" -- "0..*" Livro : gerencia
    Biblioteca ..|> OperacoesBiblioteca : implements
