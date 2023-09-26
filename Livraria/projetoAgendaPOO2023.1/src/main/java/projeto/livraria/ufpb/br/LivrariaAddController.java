package projeto.livraria.ufpb.br;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LivrariaAddController implements ActionListener {
    private Livraria livraria;
    private JFrame janelaPrincipal;

    public LivrariaAddController(Livraria livraria, JFrame janela) {
        this.livraria = livraria;
        this.janelaPrincipal = janela;
    }

    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do livro está buscando?");
        String autor = (JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do autor? "));
        boolean cadastrou = livraria.cadastraLivro(nome,autor);
        if (cadastrou){
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Livro cadastrado");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Livro não foi cadastrado. " +
                            "Verifique se já não existia");
        }
    }

}
