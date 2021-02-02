package br.com.bootcamp.exer4.livro;

public class Livro {
    private Integer id;
    private String nomeLivro;

    public Livro (Integer id,
                  String nomeLivro){
        this.id = id;
        this.nomeLivro = nomeLivro;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nomeLivro='" + nomeLivro + '\'' +
                '}';
    }
}
