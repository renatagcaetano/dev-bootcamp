package br.com.bootcamp.exer16.pedidoItem;

public class PedidoItem {
    private Long id;
    private String item;
    private Integer quantidade;
    private double valorUnitario;
    private double valorDesconto;

    public double getValorTotal() {
        return quantidade * valorUnitario - valorDesconto;
    }

    public double getValorTotalSemDesconto() {
        return quantidade * valorUnitario;
    }

    public PedidoItem (String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "PedidoItem{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", valorDesconto=" + valorDesconto +
                '}';
    }

    public void resumo(PedidoItem pedidoItem) {
        System.out.println(toString());
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }
}