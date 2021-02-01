package br.com.bootcamp.exer3;

import br.com.bootcamp.exer3.grupoDePessoas.GrupoDePessoas;
import br.com.bootcamp.exer3.pessoa.Pessoa;

import java.time.LocalDate;
import java.time.Month;

public class Exer3 {

    public static void main(String[] args) {
        GrupoDePessoas grupoDePessoas = new GrupoDePessoas();
        Pessoa pessoa1 = new Pessoa("Renata", "01234567890", LocalDate.of(2000, Month.SEPTEMBER, 20));
        Pessoa pessoa2 = new Pessoa("Marlon", "32659784158", LocalDate.of(1995, Month.APRIL, 06));
        Pessoa pessoa3 = new Pessoa("Bianca", "68454795133", LocalDate.of(1999, Month.MAY, 19));
        grupoDePessoas.adicionar(pessoa1);
        grupoDePessoas.adicionar(pessoa2);
        grupoDePessoas.adicionar(pessoa3);

        for (int i = 0; i < grupoDePessoas.getPessoasList().size(); i++) {
            Pessoa pessoaAtual = grupoDePessoas.getPessoasList().get(i);
            System.out.println("pessoaAtual: " + pessoaAtual);
        }

    }
}
