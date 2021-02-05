package br.com.bootcamp.exer16.daoImpl;

import br.com.bootcamp.exer16.dao.PedidoDAO;
import br.com.bootcamp.exer16.pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAOImpl implements PedidoDAO {

    private final List<Pedido> pedidos = new ArrayList<>();

    @Override
    public List<Pedido> buscarTodos() {
        return null;
    }

    @Override
    public Pedido buscar(Long id) {
        for(Pedido pedido : pedidos) {
            if(pedido.getId().equals(id)){
                return pedido;
            }
        }
        return null;
    }

    @Override
    public Pedido inserir(Pedido objeto) {
        objeto.setId(Long.valueOf(pedidos.size() + 1));
        pedidos.add(objeto);
        return objeto;
    }

    @Override
    public Pedido alterar(Pedido objeto) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(objeto.getId())) {
                pedidos.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void excluir(Long id) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(id)) {
                pedidos.remove(i);
                break;
            }
        }
    }

//    @Override
//    public Long totalPedidos(LocalDate dataInicial, LocalDate dataFinal) {
//        return pedidos.stream().filter(pedido -> LocalDateUtil.between(pedido.getDataCadastro(), dataInicial, dataFinal))
//    }
}
