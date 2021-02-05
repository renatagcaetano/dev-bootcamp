package br.com.bootcamp.exer16.serviceImpl;

import br.com.bootcamp.exer16.dao.PedidoDAO;
import br.com.bootcamp.exer16.pedido.Pedido;
import br.com.bootcamp.exer16.service.PedidoService;

import java.util.List;

public class PedidoServiceImpl implements PedidoService {

    private final PedidoDAO dao;

    public PedidoServiceImpl(PedidoDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Pedido> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Pedido buscarPorId(Long id) {
        return dao.buscar(id);
    }

    @Override
    public Pedido inserir(Pedido objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public Pedido alterar(Pedido objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Long id) {
        dao.excluir(id);
    }
}
