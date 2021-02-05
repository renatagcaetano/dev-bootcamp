package br.com.bootcamp.exer16;

import br.com.bootcamp.exer16.cliente.Cliente;
import br.com.bootcamp.exer16.dao.ClienteDAO;
import br.com.bootcamp.exer16.dao.ItemDAO;
import br.com.bootcamp.exer16.dao.PedidoDAO;
import br.com.bootcamp.exer16.daoImpl.ClienteDAOImpl;
import br.com.bootcamp.exer16.daoImpl.ItemDAOImpl;
import br.com.bootcamp.exer16.daoImpl.PedidoDAOImpl;
import br.com.bootcamp.exer16.item.Item;
import br.com.bootcamp.exer16.pedido.Pedido;
import br.com.bootcamp.exer16.pedidoItem.PedidoItem;
import br.com.bootcamp.exer16.service.ClienteService;
import br.com.bootcamp.exer16.service.ItemService;
import br.com.bootcamp.exer16.service.PedidoService;
import br.com.bootcamp.exer16.serviceImpl.ClienteServiceImpl;
import br.com.bootcamp.exer16.serviceImpl.ItemServiceImpl;
import br.com.bootcamp.exer16.serviceImpl.PedidoServiceImpl;
import br.com.bootcamp.exer16.vendedor.Vendedor;

import java.time.LocalDateTime;

public class Exer16 {

    public static void main(String[] args){

        ItemDAO itemDAO = new ItemDAOImpl();
        ItemService itemService = new ItemServiceImpl(itemDAO);
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        ClienteService clienteService = new ClienteServiceImpl(clienteDAO);
        PedidoDAO pedidoDAO = new PedidoDAOImpl();
        PedidoService pedidoService = new PedidoServiceImpl(pedidoDAO);

        Item item = new Item(3);
        item.setValorUnitario(2.50);
        itemService.inserir(item);
        Cliente cliente = new Cliente("Renata");
        cliente.getNome();
        clienteService.inserir(cliente);
        Vendedor vendedor = new Vendedor("Maria");
        PedidoItem pedidoItem = new PedidoItem("Violoncelo");
        Pedido pedido = new Pedido(cliente, vendedor, LocalDateTime.now(), pedidoItem);

        System.out.println(item + "\n" + cliente + "\n" + LocalDateTime.now() + "\n" + pedidoItem);

        
    }
}
