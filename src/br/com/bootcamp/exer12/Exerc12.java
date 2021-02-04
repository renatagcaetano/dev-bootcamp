package br.com.bootcamp.exer12;

import br.com.bootcamp.exer12.quadrado.Quadrado;
import br.com.bootcamp.exer12.retangulo.Retangulo;
import br.com.bootcamp.exer12.triangulo.Triangulo;

public class Exerc12 {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(3, 3);
        System.out.println("Área do quadrado: " + quadrado.getArea());

        Retangulo retangulo = new Retangulo(3, 2);
        System.out.println("Área do retângulo: " + retangulo.getArea());

        Triangulo triangulo = new Triangulo(2, 3);
        System.out.println("Área do triângulo: " + triangulo.getArea());

    }

}
