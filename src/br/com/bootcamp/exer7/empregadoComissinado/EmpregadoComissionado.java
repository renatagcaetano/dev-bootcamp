package br.com.bootcamp.exer7.empregadoComissinado;

import br.com.bootcamp.exer7.empregado.Empregado;

public class EmpregadoComissionado extends Empregado {

    private double valorProdutosVendidos;
    private double percentualComissao;
    private double valorComissao;

    public EmpregadoComissionado(String nome,
                                 String cpf,
                                 double valorSalarioBase,
                                 double valorImpostos,
                                 double valorProdutosVendidos,
                                 double percentualComissao){
        super(nome, cpf, valorSalarioBase, valorImpostos);
        this.valorProdutosVendidos = valorProdutosVendidos;
        this.percentualComissao = percentualComissao;
        this.valorComissao = valorProdutosVendidos * percentualComissao / 100;
    }

    public double getValorProdutosVendidos() {
        return valorProdutosVendidos;
    }

    @Override
    public double calculaValorTotalSalario() {
        return getValorSalarioBase() + valorComissao - getValorImpostos();
    }
}
