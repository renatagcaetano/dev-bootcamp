package br.com.bootcamp.exer13;

import br.com.bootcamp.exer13.carro.Carro;
import br.com.bootcamp.exer13.endereco.Endereco;
import br.com.bootcamp.exer13.marca.Marca;
import br.com.bootcamp.exer13.proprietario.Proprietario;

public class Exer13 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Jabuticabinhas", 920, "Araras verdes",
                                         "Peneirinha", "Pandinha Rosa", "01234567",
                                         "Casa");
        Proprietario proprietario = new Proprietario("Renata", "01234567890", "01234567897895", endereco);
        Carro carro = new Carro(120, proprietario, 5);
        Marca marca = new Marca("Megane", 2007, 1);


        carro.setVelocidadeMaxima(13);
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.reduzirMarcha();
        carro.trocarMarcha();
        carro.trocarMarcha();
        carro.reduzirMarcha();
        carro.marchaRe();
    }
}
