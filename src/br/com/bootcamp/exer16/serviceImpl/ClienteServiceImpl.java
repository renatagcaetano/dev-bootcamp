package br.com.bootcamp.exer16.serviceImpl;

import br.com.bootcamp.exer16.cliente.Cliente;
import br.com.bootcamp.exer16.dao.ClienteDAO;
import br.com.bootcamp.exer16.service.ClienteService;
import br.com.bootcamp.exer16.validacao.ValidaCliente;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private final ClienteDAO dao;

    public ClienteServiceImpl(ClienteDAO dao){
        this.dao = dao;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return dao.buscar(id);
    }

    @Override
    public Cliente inserir(Cliente objeto) {
        ValidaCliente validaCliente = new ValidaCliente();
        validaCliente.validaNomeCliente(objeto);
        return dao.inserir(objeto);
    }

    @Override
    public Cliente alterar(Cliente objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Long id) {
        dao.excluir(id);
    }
}
