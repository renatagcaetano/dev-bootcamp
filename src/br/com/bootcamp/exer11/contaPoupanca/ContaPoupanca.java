package br.com.bootcamp.exer11.contaPoupanca;


import br.com.bootcamp.exer11.Imprimivel;
import br.com.bootcamp.exer11.contaBancaria.ContaBancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

    private BigDecimal taxaDeOperacao;

    public ContaPoupanca(Integer numeroConta,
                         BigDecimal saldo,
                         BigDecimal taxaDeOperacao) {
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(BigDecimal saque) {
        if (saque.compareTo(saldo) > 0) {
            System.out.println("Não foi possível realizar o saque");
        }
        else {
            System.out.println("Saldo atual com o saque: " + saldo.subtract(saque).subtract(taxaDeOperacao));
        }
    }

    @Override
    public void depositar(BigDecimal deposito){
        saldo = saldo.add(deposito).subtract(taxaDeOperacao);
        System.out.println("Saldo atual com o depósito: " + saldo);

    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "taxaDeOperacao=" + taxaDeOperacao +
                '}';
    }

    @Override
    public void mostrarDados() {
        System.out.println(toString());
    }
}