package br.com.bootcamp.exer13.excecoes;

public class CampoObrigatorioNullException extends RuntimeException {

    public CampoObrigatorioNullException (String mensagem) {
        super(mensagem);
    }
}
