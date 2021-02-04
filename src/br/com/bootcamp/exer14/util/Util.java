package br.com.bootcamp.exer14.util;

import br.com.bootcamp.exer14.animal.Animal;
import br.com.bootcamp.exer14.especie.Especie;
import br.com.bootcamp.exer14.especiesUtil.EspeciesUtil;

import java.util.ArrayList;
import java.util.List;

public class Util implements EspeciesUtil {
    @Override
    public List<Animal> filtrar(List<Animal> animais, Especie especieFiltrar) {
        List<Animal> animaisFiltrados = new ArrayList<>();
        for (int i = 0; i < animais.size(); i++){
            if(animais.get(i).getEspecie() == especieFiltrar) {
                animaisFiltrados.add(animais.get(i));
            }
        }
        return animaisFiltrados;
    }

    @Override
    public List<Especie> classificar(List<Animal> animais) {
        List<Especie> animaisTotal = new ArrayList<>();
        for (int i = 0; i < animais.size(); i++){
            animaisTotal.add(animais.get(i).getEspecie());
        }

        List<Especie> animaisClassificados = new ArrayList<>();
        int qtd = 0;
        for (int i = 0; i < animaisTotal.size(); i++){
            boolean existe = false;
            for (int j = 0; j < qtd; j++){
                if(animaisTotal.get(i) == animaisClassificados.get(j)) {
                    existe = true;
                    break;
                }
            }
            if(!existe){
                animaisClassificados.add(animaisTotal.get(i));
                qtd++;
            }
        }
        return animaisClassificados;
    }
}
