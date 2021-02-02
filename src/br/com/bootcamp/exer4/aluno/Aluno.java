package br.com.bootcamp.exer4.aluno;

public class Aluno {
    private String nome;

    public Aluno (String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
