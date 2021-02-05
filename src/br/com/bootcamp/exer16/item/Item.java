package br.com.bootcamp.exer16.item;

import br.com.bootcamp.exer16.pedidoItem.PedidoItem;

import java.math.BigDecimal;

public class Item {

    public Long id;
    private String descricao;
    private boolean inativo;
    private Integer qtdEstoque;
    private double valorUnitario;

    public Item (Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", inativo=" + inativo +
                ", qtdEstoque=" + qtdEstoque +
                ", valorUnitario=" + valorUnitario +
                '}';
    }

    public void resumo(Item Item) {
        System.out.println(toString());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
