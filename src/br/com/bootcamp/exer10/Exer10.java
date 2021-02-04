package br.com.bootcamp.exer10;

import br.com.bootcamp.exer10.voo.Voo;

import java.time.LocalDateTime;

public class Exer10 {

    public static void main(String[] args) {
        Voo voo = new Voo(1, LocalDateTime.now(), 30);

        voo.criarAssento();
        voo.vaga();
        voo.assentoLivre();
        voo.ocupar(1);
        voo.ocupar(2);
        voo.verificar(2);
        voo.assentoLivre();
        voo.primeiroAssento();
        voo.ocupar(11);
        voo.ocupar(12);
        voo.ocupar(13);
        voo.proximoLivre(11);
    }
}
