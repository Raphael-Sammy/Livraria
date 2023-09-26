package projeto.livraria.ufpb.br;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LivrariaRaphaTest {
    @Test
    public void testaCadastro(){
        LivrariaRapha livrariaRapha = new LivrariaRapha();
        assertTrue(livrariaRapha.pesquisaLivro("Oliver","Raphael").size()==0);
        livrariaRapha.cadastraLivro("Juliana","Raphael");
        assertEquals(1, livrariaRapha.pesquisaLivro("Oliver","Raphael").size());
        assertTrue(livrariaRapha.pesquisaLivro("Oliver","Raphael").contains(new Livro("Oliver","Raphael")));
    }

    @Test
    public void testaGravacao(){
        File f = new File(GravadorDeDadosLivros.ARQUIVO_LIVROS);
        if (f.exists()){
            f.delete();
        }
        LivrariaRapha livrariaRapha = new LivrariaRapha();
        livrariaRapha.cadastraLivro("Ana","Oliver");
        livrariaRapha.salvarDados();
        assertEquals(1, livrariaRapha.pesquisaLivro("Oliver","Raphael").size());
        assertTrue(f.exists());
        f.delete();
    }
}
