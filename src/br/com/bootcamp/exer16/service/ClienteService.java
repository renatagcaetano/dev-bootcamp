package br.com.bootcamp.exer16.service;

import br.com.bootcamp.exer16.cliente.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente inserir(Cliente objeto);

    Cliente alterar(Cliente objeto);

    void excluir(Long id);
}
