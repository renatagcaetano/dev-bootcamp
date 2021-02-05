package br.com.bootcamp.exer16.vendedor;

public class Vendedor {

    private Long id;
    private String nome;
    private Integer percentualComissao;
    private Integer percetualDescontoMaximo;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPercentualComissao(Integer percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void setPercetualDescontoMaximo(Integer percetualDescontoMaximo) {
        this.percetualDescontoMaximo = percetualDescontoMaximo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPercentualComissao() {
        return percentualComissao;
    }

    public Integer getPercetualDescontoMaximo() {
        return percetualDescontoMaximo;
    }
}
