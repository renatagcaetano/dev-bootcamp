package br.com.bootcamp.exer2;

import br.com.bootcamp.exer2.calculadora.Calculadora;

public class Exerc2 {

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(2, 2));
        System.out.println(calculadora.subtrair(2, 2));
        System.out.println(calculadora.multiplicar(2, 2));
        System.out.println(calculadora.dividir(5, 2));
    }
}
