package projeto.livraria.ufpb.br;

import javax.swing.*;

public class LivrariaGUIV3_Com_Runnable {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame janela = new LivrariaGUIV3();
                janela.setVisible(true);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
