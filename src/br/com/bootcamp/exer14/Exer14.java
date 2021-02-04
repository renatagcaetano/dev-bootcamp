package br.com.bootcamp.exer14;

import br.com.bootcamp.exer14.animais.Cachorro;
import br.com.bootcamp.exer14.animais.Gato;
import br.com.bootcamp.exer14.animais.Jacare;
import br.com.bootcamp.exer14.animais.Tubarao;
import br.com.bootcamp.exer14.animal.Animal;
import br.com.bootcamp.exer14.contabilizarEspecies.ContabilizarEspecies;
import br.com.bootcamp.exer14.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Exer14 {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal tubarao = new Tubarao();
        Animal jacare = new Jacare();
        cachorro.getEspecie();
        cachorro.getNome();
        gato.getEspecie();
        gato.getNome();
        tubarao.getEspecie();
        tubarao.getNome();
        jacare.getEspecie();
        jacare.getNome();

        ContabilizarEspecies contabiliza = new ContabilizarEspecies();
        Util util = new Util();
        List<Animal> animais = new ArrayList<>();

        animais.add(cachorro);
        animais.add(cachorro);
        animais.add(tubarao);
        animais.add(jacare);

        System.out.println(contabiliza.contar(animais, util));
    }
}
