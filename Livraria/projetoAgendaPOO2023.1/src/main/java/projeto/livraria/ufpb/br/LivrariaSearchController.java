package projeto.livraria.ufpb.br;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class LivrariaSearchController implements ActionListener {
    private Livraria livraria;
    private JFrame janelaPrincipal;

    public LivrariaSearchController(Livraria livraria, JFrame janela) {
        this.livraria = livraria;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do livro à pesquisar? ");
        String autor = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual é o autor do livro?" );
        Collection<Livro> livros = livraria.pesquisaLivro(nome, autor);
        if (livros.size()>0){
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Livros encontrados:");
            for (Livro c: livros){
                JOptionPane.showMessageDialog(janelaPrincipal, c.toString());
            }
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Não foi encontrado nenhum livro");
        }
    }
}
