package br.com.bootcamp.exer16.serviceImpl;

import br.com.bootcamp.exer16.dao.ItemDAO;
import br.com.bootcamp.exer16.item.Item;
import br.com.bootcamp.exer16.service.ItemService;
import br.com.bootcamp.exer16.validacao.ValidaItem;

import java.util.List;

public class ItemServiceImpl implements ItemService {

    private final ItemDAO dao;

    public ItemServiceImpl(ItemDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Item> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Item buscarPorId(Long id) {
        return dao.buscar(id);
    }

    @Override
    public Item inserir(Item objeto) {
        ValidaItem validaItem = new ValidaItem();
        validaItem.validaValorUnitario(objeto);
        return dao.inserir(objeto);
    }

    @Override
    public Item alterar(Item objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Long id) {
        dao.excluir(id);
    }
}
