package br.com.bootcamp.exer10.assento;

public class Assento {

    public Integer numeroAssento;
    public Boolean livre;

    public Assento(Integer numeroAssento,
                   Boolean livre){
        this.numeroAssento = numeroAssento;
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Assento{" +
                "numeroAssento=" + numeroAssento +
                '}';
    }
}
