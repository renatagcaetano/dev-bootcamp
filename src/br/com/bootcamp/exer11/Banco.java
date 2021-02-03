package br.com.bootcamp.exer11;

import br.com.bootcamp.exer11.contaBancaria.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<ContaBancaria> contasBancarias = new ArrayList<>();

    public void inserir(ContaBancaria conta) {
        for(ContaBancaria contaBancaria : contasBancarias){
            if(contaBancaria.numeroConta.equals(conta.numeroConta)){
                System.out.println("Conta existente.");
                return;
            }
        }
        contasBancarias.add(conta);
    }

    public void remover(ContaBancaria conta) {
        contasBancarias.remove(conta);
    }

    public ContaBancaria procurar(Integer numeroContaBancaria) {
        for (ContaBancaria contasBancaria : contasBancarias) {
            if (contasBancaria.numeroConta.equals(numeroContaBancaria)) {
                return contasBancaria;
            }
        }
        return null;
    }
}