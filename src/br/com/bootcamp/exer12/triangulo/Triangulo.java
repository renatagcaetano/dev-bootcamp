package br.com.bootcamp.exer12.triangulo;

import br.com.bootcamp.exer12.figuraGeometrica.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(double lado1,
                     double lado2){
        super(lado1, lado2);
    }

    @Override
    public void getArea() {
        System.out.println("Área do triângulo: " + getLado1() * getLado2() / 2);
    }
}
