package br.com.bootcamp.exer8.contaBancaria;

import br.com.bootcamp.exer8.contaPoupanca.ContaPoupanca;

import java.math.BigDecimal;

public abstract class ContaBancaria {

    private Integer numeroConta;
    private BigDecimal saldo;

    public ContaBancaria(Integer numeroConta,
                         BigDecimal saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public BigDecimal sacar(BigDecimal saque){
        return saldo.subtract(saque);
    }

    public BigDecimal depositar(BigDecimal deposito){
        return saldo.add(deposito);
    }

}
