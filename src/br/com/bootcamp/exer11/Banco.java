package br.com.bootcamp.exer11;

import br.com.bootcamp.exer11.contaBancaria.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<ContaBancaria> contasBancarias = new ArrayList<>();

    public void inserir(ContaBancaria conta) {
        contasBancarias.add(conta);
    }

    public void remover(ContaBancaria conta) {
        contasBancarias.remove(conta);
    }

    public ContaBancaria procurar(Integer numeroContaBancaria) {
        if (!(contasBancarias.size() == 0)) {
            for (int i = 0; i < contasBancarias.size(); i++) {
                if(contasBancarias.get(i).numeroConta == numeroContaBancaria) {
                    return contasBancarias.get(i);
                }
            }
        }
        return null;
    }
}