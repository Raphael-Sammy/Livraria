package projeto.livraria.ufpb.br;

import java.util.Collection;


public interface Livraria {

    public boolean cadastraLivro(String nome, String autor);
    public Collection<Livro> pesquisaLivro(String nome, String autor);
    public boolean removeLivro(String nome);
    public void salvarDados();
}
