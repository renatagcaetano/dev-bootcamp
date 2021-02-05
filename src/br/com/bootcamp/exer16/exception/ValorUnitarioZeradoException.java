package br.com.bootcamp.exer16.exception;

import java.math.BigDecimal;

public class ValorUnitarioZeradoException extends RuntimeException {

    public ValorUnitarioZeradoException(String mensagem) {
        super(mensagem);
    }
}
