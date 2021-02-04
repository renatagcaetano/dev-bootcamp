package br.com.bootcamp.exer15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendaDAOImpl implements VendaDAO{

    public final List<Venda> vendas = new ArrayList<>();

    @Override
    public List<Venda> buscarTodos() {
        return vendas;
    }

    @Override
    public Venda buscar(Long id) {
        for (Venda venda : vendas){
            if (venda.getId().equals(id)) {
                return venda;
            }
        }
        return null;
    }

    @Override
    public Venda inserir(Venda objeto) {
        objeto.setId(Long.valueOf(vendas.size()+1));
        vendas.add(objeto);
        return objeto;
    }

    @Override
    public Venda alterar(Venda objeto) {
        for (int j = 0; j < vendas.size(); j++) {
            if (vendas.get(j).getId().equals(objeto.getId())) {
                vendas.set(j, objeto);
                return objeto;
            }
        }
        return  null;
    }

    @Override
    public void excluir(Long id) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getId().equals(id)) {
                vendas.remove(i);
                break;
            }
        }
    }

    @Override
    public Long totalVendas(LocalDate dataInicial, LocalDate dataFinal) {
        //imagine que aqui será retornado o resultado da seguinte
        return vendas.stream().filter(venda -> LocalDateUtil.between(venda.getData(), dataInicial, dataFinal)).count();
    }
}
