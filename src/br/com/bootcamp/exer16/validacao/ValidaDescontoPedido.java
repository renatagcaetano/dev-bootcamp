package br.com.bootcamp.exer16.validacao;

import br.com.bootcamp.exer16.exception.ValorComDescontoException;
import br.com.bootcamp.exer16.pedido.Pedido;

public class ValidaDescontoPedido {

    public ValidaDescontoPedido (Pedido pedido) {
        if (pedido.getVendedor().getPercetualDescontoMaximo() / 100 * pedido.getPedidoItem().getValorTotalSemDesconto() <
            pedido.getPedidoItem().getValorTotalSemDesconto() - pedido.getPedidoItem().getValorTotal()) {
            throw new ValorComDescontoException("Não é possível dar um desconto maior.");
        }
    }
}
