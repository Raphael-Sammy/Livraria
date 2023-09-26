package projeto.livraria.ufpb.br;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LivrariaRapha implements Livraria {
    private Map<String, Livro> livros;
    private GravadorDeDadosLivros gravador = new GravadorDeDadosLivros();

    public LivrariaRapha(){
        this.livros = new HashMap<>();
        recuperaDados();
    }

    public void salvarDados(){
        try {
            gravador.salvarLivro(this.livros);
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void recuperaDados(){
        try {
            this.livros = this.gravador.recuperarLivro();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public boolean cadastraLivro(String nome, String autor) {
        if (!livros.containsKey(nome)){
            this.livros.put(nome, new Livro(nome, autor));
            return true;
        } else {
            return false;
        }
    }

    public Collection<Livro> pesquisaLivro(String nome, String autor) {
        Collection<Livro> livrosAchados = new ArrayList<>();
        for (Livro c: this.livros.values()){
            if (c.getNome()==nome && c.getAutor()==autor){
                livrosAchados.add(c);
            }
        }
        return livrosAchados;
    }

    public boolean removeLivro(String nome) {
        if (this.livros.containsKey(nome)){
            this.livros.remove(nome);
            return true;
        } else{
            return false;
        }
    }
}
