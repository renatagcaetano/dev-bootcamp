package br.com.bootcamp.exer5;

public class Empregado extends Pessoa {

    private double valorSalarioBase;
    private double valorImpostos;

    public Empregado (String nome,
                      String cpf,
                      double valorSalarioBase,
                      double valorImpostos){
        //o super chama o construtor da classe pessoa
        //como se fosse: new Pessoa(nome, cpf)
        super(nome, cpf);
        this.valorSalarioBase = valorSalarioBase;
        this.valorImpostos = valorImpostos;
    }

    public double calculaValorTotalSalario(){
        return valorSalarioBase - valorImpostos;
    }

}
