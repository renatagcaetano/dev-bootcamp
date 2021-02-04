package br.com.bootcamp.exer15;

import java.time.LocalDate;
import java.util.List;

public interface VendaDAO {

    List<Venda> buscarTodos();

    Venda buscar(Long id);

    Venda inserir(Venda objeto);

    Venda alterar(Venda objeto);

    void excluir(Long id);

    Long totalVendas(LocalDate dataInicial, LocalDate dataFinal);
}
