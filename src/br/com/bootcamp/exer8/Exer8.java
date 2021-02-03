package br.com.bootcamp.exer8;

import br.com.bootcamp.exer8.contaBancaria.ContaBancaria;
import br.com.bootcamp.exer8.contaCorrente.ContaCorrente;
import br.com.bootcamp.exer8.contaPoupanca.ContaPoupanca;

import java.io.ObjectInputFilter;
import java.math.BigDecimal;

public class Exer8 {

    public static void main(String[] args) {
        BigDecimal saldoPoupanca = new BigDecimal(20000);
        BigDecimal taxaDeOperacao = new BigDecimal(2);
        ContaBancaria contaPoupanca = new ContaPoupanca(1, saldoPoupanca, taxaDeOperacao);

        BigDecimal deposito = new BigDecimal(15000);
        contaPoupanca.depositar(deposito);

        BigDecimal saquePoupanca = new BigDecimal(9000);
        contaPoupanca.sacar(saquePoupanca);

        BigDecimal saldoCorrente = new BigDecimal(40000);
        BigDecimal limite = new BigDecimal(9000);
        ContaBancaria contaCorrente = new ContaCorrente(1, saldoCorrente, limite);

        BigDecimal saqueCorrente = new BigDecimal(45000);
        contaCorrente.sacar(saqueCorrente);

        BigDecimal depositoCorrente = new BigDecimal(10000);
        contaCorrente.depositar(depositoCorrente);
    }

}
