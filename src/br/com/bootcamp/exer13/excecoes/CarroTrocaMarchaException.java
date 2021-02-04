package br.com.bootcamp.exer13.excecoes;

public class CarroTrocaMarchaException extends RuntimeException{

    public CarroTrocaMarchaException (String mensagem) {
        super(mensagem);
    }
}
