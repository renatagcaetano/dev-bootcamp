package br.com.bootcamp.exer10.voo;

import br.com.bootcamp.exer10.assento.Assento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {

    private LocalDateTime data;
    private Integer numeroVoo;
    private Integer totalAssentos;
    List<Assento> listaAssentos = new ArrayList<>();

    public Voo(Integer numeroVoo,
               LocalDateTime data,
               Integer totalAssentos){
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.totalAssentos = totalAssentos;
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

    public void primeiroAssento(){
        for (int i = 0; i < totalAssentos; i++){
            if (listaAssentos.get(i).livre){
                System.out.println("O primeiro assento livre é " + listaAssentos.get(i));
                return;
            }
        }
    }

    public void proximoLivre(Integer assento){
        for (int i = assento; i < totalAssentos; i++){
            if(listaAssentos.get(i).livre){
                System.out.println("O próximo assento livre é " + listaAssentos.get(i));
                return;
            }
        }
    }

    public void criarAssento(){
        for (int i = 0; i < totalAssentos; i++){
            Assento assento = new Assento(i + 1, true);
            listaAssentos.add(assento);
        }
    }

    public void assentoLivre(){
        for (int i = 0; i < totalAssentos; i++){
            if(listaAssentos.get(i).livre){
                System.out.println("Assento livre: " + listaAssentos.get(i));
            }
        }
    }

    public void vaga(){
        int cont = 0;
        for (int i = 0; i < totalAssentos; i++){
            if(listaAssentos.get(i).livre){
                cont++;
            }
        }
        System.out.println("Vagas totais: " + cont);
    }

    public void ocupar(Integer assentoOcupado){
        for (int i = 0; i < totalAssentos; i++){
            if(listaAssentos.get(i).numeroAssento.equals(assentoOcupado)){
                listaAssentos.get(i).livre = false;
            }
        }
    }

    public void verificar(Integer vagaOcupada){
        for (int i = 0; i < totalAssentos; i++){
            if(listaAssentos.get(i).numeroAssento.equals(vagaOcupada)){
                if(!listaAssentos.get(i).livre){
                    System.out.println("O assento está ocupado.");
                    return;
                }
            }
        }
        System.out.println("O assento está livre.");
    }
}
