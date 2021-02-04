package br.com.bootcamp.exer13.marca;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Marca {

    private String nome;
    private Integer anoFabricacao;
    private Integer codigo;

    public Marca (String nome,
                  Integer anoFabricacao,
                  Integer codigo) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
