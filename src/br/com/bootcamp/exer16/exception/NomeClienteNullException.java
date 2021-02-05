package br.com.bootcamp.exer16.exception;

public class NomeClienteNullException extends RuntimeException{

    public NomeClienteNullException (String mensagem) {
        super(mensagem);
    }
}
