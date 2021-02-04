package br.com.bootcamp.exer14.animais;

import br.com.bootcamp.exer14.animal.Animal;
import br.com.bootcamp.exer14.especie.Especie;

public class Tubarao implements Animal {

    @Override
    public Especie getEspecie() {
        return Especie.PEIXES;
    }

    @Override
    public String getNome() {
        return "Tubarao";
    }
}
