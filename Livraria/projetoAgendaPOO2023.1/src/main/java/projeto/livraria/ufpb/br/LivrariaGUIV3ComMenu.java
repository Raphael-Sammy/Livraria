package projeto.livraria.ufpb.br;

import javax.swing.*;
import java.awt.*;

public class LivrariaGUIV3ComMenu extends JFrame {
    JLabel linha1, linha2;
    ImageIcon boloImg = new ImageIcon("./imgs/bolo.jpg");
    Livraria livraria = new LivrariaRapha();
    JMenuBar barraDeMenu = new JMenuBar();

    public LivrariaGUIV3ComMenu() {
        setTitle("Livros");
        setSize(800, 600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        setBackground(Color.white);
        linha1 = new JLabel("Minha biblioteca: ", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(boloImg, JLabel.CENTER);
        setLayout(new GridLayout(3, 1));
        add(linha1);
        add(linha2);
        add(new JLabel());
        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem menuCadastrarAniversariante = new JMenuItem(
                "Cadastrar livro");
        menuCadastrar.add(menuCadastrarAniversariante);
        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem menuPesquisarAniversariante = new JMenuItem(
                "Pesquisar livro");
        menuPesquisar.add(menuPesquisarAniversariante);
        JMenu menuRemover = new JMenu("Remover");
        JMenuItem menuRemoverAniversariante = new JMenuItem(
                "Remover livro");
        menuRemover.add(menuRemoverAniversariante);
        menuPesquisarAniversariante.addActionListener(
                new LivrariaSearchController(livraria,this));
        menuRemoverAniversariante.addActionListener(
                new LivrariaSearchController(livraria, this));
        menuCadastrarAniversariante.addActionListener(
                (ae) -> {
                    String nome = JOptionPane.showInputDialog(this,
                            "Qual o nome do livro?");
                    String autor = JOptionPane.showInputDialog(this,
                            "Qual o nome do autor? ");
                    boolean cadastrou = livraria.cadastraLivro(nome,autor);
                    if (cadastrou) {
                        JOptionPane.showMessageDialog(this,
                                "Livro cadastrado");
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Livro não foi cadastrado. " +
                                        "Verifique se já não existia");
                    }
                });
        barraDeMenu.add(menuCadastrar);
        barraDeMenu.add(menuPesquisar);
        barraDeMenu.add(menuRemover);
        setJMenuBar(barraDeMenu);
    }

    //...
    public static void main(String[] args) {
        JFrame janela = new LivrariaGUIV3ComMenu();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
