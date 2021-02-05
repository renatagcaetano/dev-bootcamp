package br.com.bootcamp.exer16.email;

public class Email {

    private String de;
    private String para;
    private String titulo;
    private String conteudo;

    public Email(String de,
                 String para) {
        this.de = de;
        this.para = para;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDe() {
        return de;
    }

    public String getPara() {
        return para;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
