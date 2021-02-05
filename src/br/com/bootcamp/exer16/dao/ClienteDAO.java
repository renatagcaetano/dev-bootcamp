package br.com.bootcamp.exer16.dao;

import br.com.bootcamp.exer16.cliente.Cliente;

import java.util.List;

public interface ClienteDAO {

    List<Cliente> buscarTodos();

    Cliente buscar(Long id);

    Cliente inserir(Cliente objeto);

    Cliente alterar(Cliente objeto);

    void excluir(Long id);
}
