package br.com.bootcamp.exer13.proprietario;

import br.com.bootcamp.exer13.endereco.Endereco;
import br.com.bootcamp.exer13.excecoes.CampoObrigatorioNullException;

import java.time.LocalDate;

public class Proprietario {

    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Proprietario (String nome,
                         String cpf,
                         String rg,
                         Endereco endereco) {
        if(nome == null){
            throw new CampoObrigatorioNullException("O nome é obrigatório.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
