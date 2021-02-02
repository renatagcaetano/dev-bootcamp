package br.com.bootcamp.exer4.gerenciador;

import br.com.bootcamp.exer4.aluno.Aluno;
import br.com.bootcamp.exer4.livro.Livro;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEmprestimos {

    public List<Aluno> alunos = new ArrayList<>();
    public List<Livro> livros = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
