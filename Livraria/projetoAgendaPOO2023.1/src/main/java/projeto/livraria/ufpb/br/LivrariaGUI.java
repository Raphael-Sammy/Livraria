package projeto.livraria.ufpb.br;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class LivrariaGUI extends JFrame {
    public LivrariaGUI(){
        setTitle("Livraria LÊLÊLÊ");
        setSize(400,200);
        setLocation(150, 150);
        //localização da janela na tela
        setResizable(false);
        //janela não redimensionável
        getContentPane().setBackground(Color.lightGray);
    }
    //...
    public static void main(String [] args){
        LivrariaGUI janela = new LivrariaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            public void windowClosing(WindowEvent e){

                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);

    }
}
