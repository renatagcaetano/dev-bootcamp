package br.com.bootcamp.exer16.daoImpl;

import br.com.bootcamp.exer16.cliente.Cliente;
import br.com.bootcamp.exer16.dao.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    private final List<Cliente> clientes = new ArrayList<>();

    @Override
    public List<Cliente> buscarTodos() {
        return clientes;
    }

    @Override
    public Cliente buscar(Long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente inserir(Cliente objeto) {
        objeto.setId(Long.valueOf(clientes.size()+1));
        clientes.add(objeto);
        return objeto;
    }

    @Override
    public Cliente alterar(Cliente objeto) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(objeto.getId())) {
                clientes.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void excluir(Long id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) {
                clientes.remove(i);
                break;
            }
        }
    }
}
