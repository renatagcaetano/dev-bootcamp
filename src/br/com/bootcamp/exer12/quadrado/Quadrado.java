package br.com.bootcamp.exer12.quadrado;

import br.com.bootcamp.exer12.figuraGeometrica.FiguraGeometrica;

public class Quadrado extends FiguraGeometrica {

    public Quadrado (double lado1,
                     double lado2){
        super(lado1, lado2);
    }

    @Override
    public void getArea() {
        System.out.println("Área do quadrado: " + getLado1() * getLado2());
    }
}
