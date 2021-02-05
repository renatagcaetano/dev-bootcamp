package br.com.bootcamp.exer16.pedido;

import br.com.bootcamp.exer16.cliente.Cliente;
import br.com.bootcamp.exer16.formaDePagamento.FormaDePagamento;
import br.com.bootcamp.exer16.item.Item;
import br.com.bootcamp.exer16.pedidoItem.PedidoItem;
import br.com.bootcamp.exer16.vendedor.Vendedor;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataValidade;
    private LocalDateTime dataEntrega;
    private String enderecoEntrega;
    private String observacao;
    private FormaDePagamento formaDePagamento;
    private Item items;
    private PedidoItem pedidoItem;

    public Pedido (Cliente cliente,
                   Vendedor vendedor,
                   LocalDateTime dataCadastro,
                   PedidoItem pedidoItem) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataCadastro = dataCadastro;
        this.pedidoItem = pedidoItem;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", dataCadastro=" + dataCadastro +
                ", dataValidade=" + dataValidade +
                ", dataEntrega=" + dataEntrega +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", observacao='" + observacao + '\'' +
                ", formaDePagamento=" + formaDePagamento +
                ", items=" + items +
                '}';
    }

    public void resumo(Pedido pedido) {
        System.out.println(toString());
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataValidade(LocalDateTime dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDateTime getDataValidade() {
        return dataValidade;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public Item getItems() {
        return items;
    }

    public void setPedidoItem(PedidoItem pedidoItem) {
        this.pedidoItem = pedidoItem;
    }

    public PedidoItem getPedidoItem() {
        return pedidoItem;
    }
}
