package br.com.bootcamp.exer1;

import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.pessoa.Pessoa;
import br.com.bootcamp.exer1.telefone.Telefone;
import br.com.bootcamp.exer1.telefone.TipoTelefone;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Exer1 {

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Renata");
        pessoa.setSobrenome("Caetano");
        pessoa.setCpf("01234567890");
        pessoa.setEmail("renata.caetano@viasoft.com.br");
        LocalDate dataNascimento = LocalDate.of(2000, Month.SEPTEMBER, 20);
        pessoa.setData(dataNascimento);
        List<Endereco> enderecoList = new ArrayList<>();
        Endereco endereco = new Endereco("R. tupy", 123, "Centro");
        enderecoList.add(endereco);
        pessoa.setEnderecoList(enderecoList);
        Telefone telefone = new Telefone();
        telefone.setTipoTelefone(TipoTelefone.CELULAR);
        telefone.setDdd(46);
        telefone.setNumero(12345);
        pessoa.setTelefoneList(new ArrayList<>());
        pessoa.getTelefoneList().add(telefone);
        System.out.println(pessoa);

    }
}