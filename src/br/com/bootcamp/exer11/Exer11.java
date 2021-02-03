package br.com.bootcamp.exer11;

import br.com.bootcamp.exer11.contaBancaria.ContaBancaria;
import br.com.bootcamp.exer11.contaCorrente.ContaCorrente;
import br.com.bootcamp.exer11.contaPoupanca.ContaPoupanca;

import java.math.BigDecimal;

public class Exer11 {
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
        ContaBancaria contaCorrente = new ContaCorrente(2, saldoCorrente, limite);

        BigDecimal saqueCorrente = new BigDecimal(45000);
        contaCorrente.sacar(saqueCorrente);

        BigDecimal depositoCorrente = new BigDecimal(10000);
        contaCorrente.depositar(depositoCorrente);

        Relatorio relatorio1 = new Relatorio();
        relatorio1.gerar((Imprimivel) contaCorrente);

        Relatorio relatorio2 = new Relatorio();
        relatorio2.gerar((Imprimivel) contaPoupanca);

        Banco banco = new Banco();
        banco.inserir(contaCorrente);
        banco.inserir(contaPoupanca);
        banco.inserir(contaCorrente);

        System.out.println("Banco procurado: " + banco.procurar(1));
        System.out.println("Banco procurado: " + banco.procurar(2));
    }
}
