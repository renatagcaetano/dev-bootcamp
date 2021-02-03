package br.com.bootcamp.exer10.voo;

import java.time.LocalDateTime;

public class Voo {

    private LocalDateTime data;
    private Integer totalPassageiros;
    private Integer assentoLivre;
    private Integer numeroVoo;
    private Integer totalAssentos;

    public Voo(Integer numeroVoo,
               LocalDateTime data,
               Integer totalAssentos){
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.totalAssentos = totalAssentos;
        this.assentoLivre = 0;
        this.totalPassageiros = 0;
    }

    public void setNumeroVoo(Integer numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setTotalAssentos(Integer totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    public Integer getNumeroVoo() {
        return numeroVoo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Integer getTotalAssentos() {
        return totalAssentos;
    }

    public void livreAssento(){
        if(assentoLivre == 0){
            assentoLivre = 1;
        }
    }

}
