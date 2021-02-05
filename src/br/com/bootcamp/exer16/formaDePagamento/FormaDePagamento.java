package br.com.bootcamp.exer16.formaDePagamento;

public enum FormaDePagamento {

    DINHEIRO("Dinheiro"),
    CARTAO("Cartao"),
    BOLETO("Boleto");

    private String label;

    FormaDePagamento (String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
