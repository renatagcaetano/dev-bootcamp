package br.com.bootcamp.exer14.animais;

import br.com.bootcamp.exer14.animal.Animal;
import br.com.bootcamp.exer14.especie.Especie;

public class Gato implements Animal {

    @Override
    public Especie getEspecie() {
        return Especie.MAMIFEROS;
    }

    @Override
    public String getNome() {
        return "Gato";
    }
}
