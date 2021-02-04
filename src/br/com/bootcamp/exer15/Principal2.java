package br.com.bootcamp.exer15;

import java.time.LocalDate;
import java.time.Month;

public class Principal2 {

    public static void main(String[] args) {
        VendaService vendaService = new VendaServiceImpl(new VendaDAOImpl());
        //vendas de janeiro
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.JANUARY, 1)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.JANUARY, 2)));
        //vendas de fevereiro
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 3)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 4)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 5)));
        //vendas de março
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 6)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 7)));
        vendaService.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 8)));

        //imagine o seguinte cenário:
        //o sistema precisa mostrar (view) quantas vendas teve no mês
        //a view chamou o controller pelo url e mandou o período como parâmetro
        LocalDate dataInicial = LocalDate.of(2021, Month.FEBRUARY, 1);
        LocalDate dataFinal = LocalDate.of(2021, Month.FEBRUARY, 28);

        //o controller delegou para o service
        Long totalVendas = vendaService.totalVendas(dataInicial, dataFinal);

        //o service vai devolver o resultado para o controller e o controller vai dar o resultado para a view
        System.out.println("Foram feitas " + totalVendas + " vendas em fevereiro.");
    }
}
