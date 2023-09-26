package projeto.livraria.ufpb.br;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDadosLivros {
    public static final String ARQUIVO_LIVROS = "livros.dat";

    public HashMap<String, Livro> recuperarLivro() throws IOException {
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(ARQUIVO_LIVROS));
            return (HashMap<String, Livro>) in.readObject();
        } catch (Exception e){
            System.out.println("Não foi possível recuperar os contatos");
            throw new IOException("Não foi possível recuperar os dados do arquivo "+ARQUIVO_LIVROS);

        } finally {
            if (in!=null){
                in.close();
            }
        }
    }

    public void salvarLivro(Map<String, Livro> livros) throws IOException{
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_LIVROS));
            out.writeObject(livros);
        } catch (Exception e){
            e.printStackTrace();
            throw new IOException("Erro ao salvar os contatos no arquivo "+ARQUIVO_LIVROS);
        }
    }
}
