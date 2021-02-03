package br.com.bootcamp.exer12.figuraGeometrica;

import br.com.bootcamp.exer12.Figura;

public abstract class FiguraGeometrica implements Figura{

    private double lado1;
    private double lado2;

    public FiguraGeometrica(double lado1,
                            double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }



}
