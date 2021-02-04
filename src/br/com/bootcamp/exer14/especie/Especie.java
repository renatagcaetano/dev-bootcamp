package br.com.bootcamp.exer14.especie;

import com.sun.jdi.PrimitiveValue;

import java.security.PrivateKey;

public enum Especie {
    AVES("Aves"),
    MAMIFEROS("Mamíferos"),
    PEIXES("Peixes"),
    REPTEIS("Répteis");

    private String descricao;

    Especie (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
