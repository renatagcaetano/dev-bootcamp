package br.com.bootcamp.exer16.dao;

import br.com.bootcamp.exer16.pedido.Pedido;

import java.util.List;

public interface PedidoDAO {
    List<Pedido> buscarTodos();

    Pedido buscar(Long id);

    Pedido inserir(Pedido objeto);

    Pedido alterar(Pedido objeto);

    void excluir(Long id);

}
