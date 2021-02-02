package br.com.bootcamp.exer7.gerente;

import br.com.bootcamp.exer7.empregadoComissinado.EmpregadoComissionado;

import java.util.List;

public class Gerente extends EmpregadoComissionado {

    private double custo;
    private double valorComissao;
    private List<EmpregadoComissionado> listaDeVendedores;


    public Gerente(String nome,
                   String cpf,
                   double valorSalarioBase,
                   double valorImpostos,
                   List<EmpregadoComissionado> listaDeVendedores,
                   double percentualComissao,
                   double custo){
        super(nome, cpf, valorSalarioBase, valorImpostos, somatoriaProdutosVendidosVendedores(listaDeVendedores), percentualComissao);
        this.custo = custo;
    }

    private static double somatoriaProdutosVendidosVendedores(List<EmpregadoComissionado> listaDeVendedores){
        double total = 0;
        for(int i = 0; i < listaDeVendedores.size(); i++){
            total = total + listaDeVendedores.get(i).getValorProdutosVendidos();
        }
        return total;
    }


    @Override
    public double calculaValorTotalSalario() {
        return getValorSalarioBase() + valorComissao + custo - getValorImpostos();
    }

}
