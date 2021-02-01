package br.com.bootcamp.exer2.calculadora;

public class Calculadora {

    private Integer numero1;
    private Integer numero2;
    private Integer resultado;

    public Integer somar(Integer numero1,
                      Integer numero2) {
        return numero1 + numero2;
    }

    public Integer subtrair(Integer numero1,
                            Integer numero2){
        return numero1 - numero2;
    }

    public Integer multiplicar(Integer numero1,
                               Integer numero2){
        return numero1 * numero2;
    }

    public double dividir(double numero1,
                          double numero2){
        return numero1 / numero2;
    }

}
