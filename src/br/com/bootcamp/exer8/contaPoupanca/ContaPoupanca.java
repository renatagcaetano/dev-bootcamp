package br.com.bootcamp.exer8.contaPoupanca;

import br.com.bootcamp.exer8.contaBancaria.ContaBancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {

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

}
