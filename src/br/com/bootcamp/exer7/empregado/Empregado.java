package br.com.bootcamp.exer7.empregado;

import br.com.bootcamp.exer7.pessoa.Pessoa;

public class Empregado extends Pessoa {

    private double valorSalarioBase;
    private double valorImpostos;

    public Empregado(String nome,
                     String cpf,
                     double valorSalarioBase,
                     double valorImpostos){
        super (nome, cpf);
        this.valorSalarioBase = valorSalarioBase;
        this.valorImpostos = valorImpostos;
    }

    public double calculaValorTotalSalario(){
        return valorSalarioBase - valorImpostos;
    }

    public double getValorSalarioBase(){
        return valorSalarioBase;
    }

    public double getValorImpostos(){
        return valorImpostos;
    }
}
