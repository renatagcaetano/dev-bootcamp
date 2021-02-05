package br.com.bootcamp.exer16.service;

import br.com.bootcamp.exer16.pedido.Pedido;

import java.util.List;

public interface PedidoService {

    List<Pedido> buscarTodos();

    Pedido buscarPorId(Long id);

    Pedido inserir(Pedido objeto);

    Pedido alterar(Pedido objeto);

    void excluir(Long id);
}
