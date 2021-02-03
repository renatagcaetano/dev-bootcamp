package br.com.bootcamp.exer9;

import br.com.bootcamp.exer9.elevador.Elevador;

public class Exer9 {

    public static void main(String[] args) {
        Elevador elevador = new Elevador(4, 10);

        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.entra();
        elevador.desce();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.sobe();
        elevador.entra();

    }
}
