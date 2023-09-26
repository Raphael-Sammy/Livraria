package projeto.livraria.ufpb.br;

import javax.swing.*;
import java.awt.*;

public class LivrariaGUIV3 extends JFrame{
    JLabel linha1, linha2;
    ImageIcon boloImg = new ImageIcon("./imgs/bolo.jpg");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add_person.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/search_person.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_person.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    Livraria livraria = new LivrariaRapha();

    public LivrariaGUIV3(){
        setTitle("---Livraria---");
        setSize(800,600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Meus livros", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(boloImg, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar",addImg);
        botaoAdicionar.addActionListener(new LivrariaAddController(livraria, this));
        botaoPesquisar = new JButton("Pesquisar",pesqImg);
        botaoPesquisar.addActionListener(new LivrariaSearchController(livraria, this));
        botaoRemover = new JButton("Remover",removeImg);
        botaoRemover.addActionListener(new LivrariaRemoveController(livraria, this));
        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }
    //...
    public static void main(String [] args){
        JFrame janela = new LivrariaGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
