package br.com.bootcamp.exer7;

import br.com.bootcamp.exer7.empregado.Empregado;
import br.com.bootcamp.exer7.empregadoComissinado.EmpregadoComissionado;
import br.com.bootcamp.exer7.gerente.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Exer7 {

    public static void main(String[] args) {



        Empregado empregado = new Empregado("Renata", "123", 100, 10);
        double salarioEmpregado = empregado.calculaValorTotalSalario();
        System.out.println("Salário empregado: " + salarioEmpregado);

        EmpregadoComissionado comissionado = new EmpregadoComissionado("Renata", "123", 100, 20,
                                                            500, 10);
        double salarioComissionado = comissionado.calculaValorTotalSalario();
        System.out.println("Salário comissionado: " + salarioComissionado);

        List<EmpregadoComissionado> vendedores = new ArrayList<>();
        vendedores.add(comissionado);

        Empregado gerente = new Gerente("Renata", "123", 100, 20, vendedores,10,
                                        500);
        double salarioGerente = gerente.calculaValorTotalSalario();
        System.out.println("Salário gerente: " + salarioGerente);
    }
}