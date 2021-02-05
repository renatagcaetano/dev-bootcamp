package br.com.bootcamp.exer16.validacao;

import br.com.bootcamp.exer16.exception.ValorInativoException;
import br.com.bootcamp.exer16.exception.ValorUnitarioZeradoException;
import br.com.bootcamp.exer16.item.Item;

public class ValidaItem {

    public void validaValorUnitario (Item item) {
        if (item.getValorUnitario() == 0) {
            throw new ValorUnitarioZeradoException("O valor não pode ser zero.");
        }
    }

    public void validaItemInativo (Item item) {
        if (item.getInativo()) {
            throw new ValorInativoException("O item não pode ser inativo.");
        }
    }
}
