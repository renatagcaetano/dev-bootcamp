package br.com.bootcamp.exer8.contaBancaria;

import java.math.BigDecimal;

public abstract class ContaBancaria {

    public Integer numeroConta;
    public BigDecimal saldo;

    public ContaBancaria(Integer numeroConta,
                         BigDecimal saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public abstract void sacar(BigDecimal saque);
    public abstract void depositar(BigDecimal deposito);

}
