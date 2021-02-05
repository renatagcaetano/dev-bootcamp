package br.com.bootcamp.exer16.validacao;

import br.com.bootcamp.exer16.cliente.Cliente;
import br.com.bootcamp.exer16.exception.NomeClienteNullException;

public class ValidaCliente {

    public void validaNomeCliente (Cliente cliente) {
        if (cliente.getNome() == null) {
            throw new NomeClienteNullException("Cadastre um nome não nulo, por favor.");
        }
    }
}
