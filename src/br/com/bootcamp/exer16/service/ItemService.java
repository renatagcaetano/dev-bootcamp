package br.com.bootcamp.exer16.service;

import br.com.bootcamp.exer16.item.Item;

import java.util.List;

public interface ItemService {

    List<Item> buscarTodos();

    Item buscarPorId(Long id);

    Item inserir(Item objeto);

    Item alterar(Item objeto);

    void excluir(Long id);
}
