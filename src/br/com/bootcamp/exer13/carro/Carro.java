package br.com.bootcamp.exer13.carro;

import br.com.bootcamp.exer13.excecoes.CarroAceleraException;
import br.com.bootcamp.exer13.excecoes.CarroTrocaMarchaException;
import br.com.bootcamp.exer13.marca.Marca;
import br.com.bootcamp.exer13.proprietario.Proprietario;

public class Carro {

    private String modelo;
    private String cor;
    private Integer ano;
    private Marca marca;
    private String chassi;
    private Proprietario proprietario;
    private Integer velocidadeMaxima;
    private Integer velocidadeAtual;
    private Integer numeroPortas;
    private Integer numeroMarchas;
    private double qtdCombustivel;
    private Integer marchaAtual;

    public Carro (double qtdCombustivel,
                  Proprietario proprietario,
                  Integer numeroMarchas) {
        this.qtdCombustivel = qtdCombustivel;
        this.proprietario = proprietario;
        this.numeroMarchas = numeroMarchas;
        this.velocidadeAtual = 0;
        this.marchaAtual = 0;
    }

    public void acelerar() {
        if (velocidadeAtual < velocidadeMaxima) {
            velocidadeAtual++;
            System.out.println("A velocidade atual é: " + velocidadeAtual);
        } else{
            throw new CarroAceleraException("Não é possível acelerar.");
        }
    }

    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual = 0;
            System.out.println("O carro foi freado e se encontra com a velocidade " + velocidadeAtual);
        }
    }

    public void trocarMarcha() {
        if (marchaAtual < numeroMarchas) {
            marchaAtual++;
            System.out.println("A marcha atual é: " + marchaAtual);
        }else{
            throw new CarroTrocaMarchaException("Não é possível trocar a marcha.");
        }
    }

    public void reduzirMarcha() {
        if (marchaAtual > 0) {
            marchaAtual--;
            System.out.println("A marcha foi reduzida para " + marchaAtual);
        } else {
            System.out.println("Não é possível reduzir a marcha.");
        }
    }

    public void marchaRe() {
        if (velocidadeAtual == 0){
            marchaAtual--;
            System.out.println("Marcha ré está em " + marchaAtual);
        }else{
            System.out.println("Não é possível fazer marcha ré.");
        }
    }

    public double autonomia(double distancia,
                          double qtdlitros) {
        return distancia / qtdlitros;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setNumeroMarchas(Integer numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public void setQtdCombustivel(double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getChassi() {
        return chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public Integer getNumeroMarchas() {
        return numeroMarchas;
    }

    public double getQtdCombustivel() {
        return qtdCombustivel;
    }
}
