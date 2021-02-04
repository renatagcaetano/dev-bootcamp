package br.com.bootcamp.exer14.especiesUtil;

import br.com.bootcamp.exer14.animal.Animal;
import br.com.bootcamp.exer14.especie.Especie;

import java.util.List;

public interface EspeciesUtil {
    List<Animal> filtrar(List<Animal> animais, Especie especieFiltrar);
    List<Especie> classificar(List<Animal> animais);
}
