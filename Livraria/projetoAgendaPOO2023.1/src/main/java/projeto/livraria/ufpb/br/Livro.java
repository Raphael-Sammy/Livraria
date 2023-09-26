package projeto.livraria.ufpb.br;

import java.io.Serializable;
import java.util.Objects;

public class Livro implements Serializable {
    private String nome;
    private String autor;


    public Livro(){
    }

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "---Livro---" +
                "\nnome: " + nome +
                "\nautor: " + autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && autor.equals(livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, autor);
    }
}
