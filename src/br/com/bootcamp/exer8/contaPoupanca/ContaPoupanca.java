package br.com.bootcamp.exer8.contaPoupanca;

import br.com.bootcamp.exer8.contaBancaria.ContaBancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {

    private double taxaDeOperacao;

    public ContaPoupanca(Integer numeroConta,
                         BigDecimal saldo,
                         double taxaDeOperacao){
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public BigDecimal
}
