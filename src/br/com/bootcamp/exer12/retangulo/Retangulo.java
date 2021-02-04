package br.com.bootcamp.exer12.retangulo;

import br.com.bootcamp.exer12.figuraGeometrica.FiguraGeometrica;

public class Retangulo extends FiguraGeometrica {

    public Retangulo (double lado1,
                      double lado2){
        super(lado1, lado2);
    }

    @Override
    public double getArea() {
        return getLado1() * getLado2();
    }
}
