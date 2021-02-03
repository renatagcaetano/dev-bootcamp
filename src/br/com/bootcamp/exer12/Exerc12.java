package br.com.bootcamp.exer12;

import br.com.bootcamp.exer12.quadrado.Quadrado;
import br.com.bootcamp.exer12.retangulo.Retangulo;
import br.com.bootcamp.exer12.triangulo.Triangulo;

public class Exerc12 {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(1, 2);
        quadrado.getArea();

        Retangulo retangulo = new Retangulo(3, 3);
        retangulo.getArea();

        Triangulo triangulo = new Triangulo(2, 3);
        triangulo.getArea();

    }

}
