package br.com.bootcamp.exer4;

import br.com.bootcamp.exer4.aluno.Aluno;
import br.com.bootcamp.exer4.gerenciador.GerenciadorDeEmprestimos;
import br.com.bootcamp.exer4.livro.Livro;

public class exer4 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Marcela");

        Livro livro1 = new Livro(1, "O Pequeno Príncipe");
        Livro livro2 = new Livro(2, "Jogos Vorazes");
        Livro livro3 = new Livro(3, "Percy Jackson");
        Livro livro4 = new Livro(4, "Harry Potter");

        GerenciadorDeEmprestimos listaDeAlunos = new GerenciadorDeEmprestimos();
        GerenciadorDeEmprestimos listaDeLivros = new GerenciadorDeEmprestimos();

        listaDeAlunos.adicionarAluno(aluno1);
        listaDeAlunos.adicionarAluno(aluno2);
        listaDeAlunos.adicionarAluno(aluno3);

        listaDeLivros.adicionarLivro(livro1);
        listaDeLivros.adicionarLivro(livro2);
        listaDeLivros.adicionarLivro(livro3);
        listaDeLivros.adicionarLivro(livro4);

        for(int i = 0; i < listaDeAlunos.getAlunos().size(); i++){
            Aluno alunoAtual = listaDeAlunos.getAlunos().get(i);
            System.out.println(alunoAtual);
        }

        for(int i = 0; i< listaDeLivros.getLivros().size(); i++){
            Livro livroAtual = listaDeLivros.getLivros().get(i);
            System.out.println(livroAtual);
        }
    }
}
