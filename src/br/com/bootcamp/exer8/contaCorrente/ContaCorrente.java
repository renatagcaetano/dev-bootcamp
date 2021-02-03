package br.com.bootcamp.exer8.contaCorrente;

import br.com.bootcamp.exer8.contaBancaria.ContaBancaria;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {

    private BigDecimal limite;
    private final BigDecimal limiteMaximo;

    public ContaCorrente(Integer numeroConta,
                         BigDecimal saldo,
                         BigDecimal limite){
        super(numeroConta, saldo);
        this.limite = limite;
        this.limiteMaximo = limite;
    }

    @Override
    public void sacar (BigDecimal saque){
        if(saldo.compareTo(saque) > 0){
            saldo = saldo.subtract(saque);
            System.out.println("Saque realizado. Seu novo saldo é " + saldo);
        }else if(saldo.add(limite).compareTo(saque) > 0){
            limite = saldo.add(limite).subtract(saque);
            saldo = saldo.subtract(saque);
            System.out.println("Saque realizado. Seu novo saldo é " + saldo + " e seu limite é " + limite);
        }else{
            System.out.println("Não é possível realizar a operação.");
        }
    }

    @Override
    public void depositar(BigDecimal deposito){
        BigDecimal inicio = new BigDecimal(0);
        saldo = saldo.add(deposito);
        if(saldo.compareTo(inicio) > 0){
            System.out.println("Saldo com depósito: " + saldo + " e o limite é " + limiteMaximo);
            limite = limiteMaximo;
        }else{

            System.out.println("Saldo de " + saldo + " e o limite é " + limiteMaximo.add(saldo));
        }
    }
}
