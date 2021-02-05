package br.com.bootcamp.exer16.dao;

import br.com.bootcamp.exer16.item.Item;

import java.util.List;

public interface ItemDAO {

    List<Item> buscarTodos();

    Item buscar(Long id);

    Item inserir(Item objeto);

    Item alterar(Item objeto);

    void excluir(Long id);
}
