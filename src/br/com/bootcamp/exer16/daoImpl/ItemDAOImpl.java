package br.com.bootcamp.exer16.daoImpl;

import br.com.bootcamp.exer16.dao.ItemDAO;
import br.com.bootcamp.exer16.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {

    private final List<Item> itens = new ArrayList<>();

    @Override
    public List<Item> buscarTodos() {
        return itens;
    }

    @Override
    public Item buscar(Long id) {
        for (Item item : itens) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public Item inserir(Item objeto) {
        objeto.setId(Long.valueOf(itens.size()+1));
        itens.add(objeto);
        return objeto;
    }

    @Override
    public Item alterar(Item objeto) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getId().equals(objeto.getId())) {
                itens.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void excluir(Long id) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getId().equals(id)) {
                itens.remove(i);
                break;
            }
        }
    }
}
