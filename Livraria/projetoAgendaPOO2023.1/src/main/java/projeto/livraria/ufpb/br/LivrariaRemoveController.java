package projeto.livraria.ufpb.br;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LivrariaRemoveController implements ActionListener {
    private Livraria livraria;
    private JFrame janelaPrincipal;
    public LivrariaRemoveController(Livraria livraria, JFrame janela) {
        this.livraria = livraria;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do livro a remover? ");
        boolean removeu = livraria.removeLivro(nome);
        if (removeu){
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Livro removido com sucesso");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Livro não foi encontrado. "+
                            "Operação não realizada");
        }
    }
}
