package br.com.bootcamp.exer14.resultado;

import br.com.bootcamp.exer14.especie.Especie;

public class Resultado {

    private Especie especie;
    private Integer quantidade;

    public Resultado (Especie especie,
                      Integer quantidade) {
        this.especie = especie;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "especie=" + especie +
                ", quantidade=" + quantidade +
                '}';
    }
}
