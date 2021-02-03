package br.com.bootcamp.exer9.elevador;

public class Elevador {

    private Integer andarAtual;
    private Integer capacidadeElevador;
    private Integer totalAndares;
    private Integer qtdPessoas;

    public Elevador(Integer capacidadeElevador,
                    Integer totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.qtdPessoas = 0;
    }

    public void setCapacidadeElevador(Integer capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public void setTotalAndares(Integer totalAndares) {
        this.totalAndares = totalAndares;
    }

    public Integer getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public void entra(){
        if(qtdPessoas < capacidadeElevador) {
            qtdPessoas++;
            System.out.println("Quantidade de pessoas no elevador: " + qtdPessoas);
        }else{
            System.out.println("Não há ninguém para entrar no elevador.");
        }
    }

    public void sai(){
        if(qtdPessoas > 0){
            qtdPessoas--;
            System.out.println("Quantidade de pessoas no elevador: " + qtdPessoas);
        }else {
            System.out.println("Não há ninguém para sair do elevador.");
        }
    }

    public void sobe(){
        if(andarAtual < totalAndares){
            andarAtual++;
            System.out.println("O elevador está no endar: " + andarAtual);
        }else{
            System.out.println("O elevador está no último andar.");
        }
    }

    public void desce(){
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("O elevador está no andar: " + andarAtual);
        }else{
            System.out.println("O elevador não subiu nenhum andar.");
        }
    }


}