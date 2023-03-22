package br.com.arquivos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploCardLayout {

    public static void main(String[] args) {
        // Cria uma janela
        JFrame minhaJanela = new JFrame("Exemplo de CardLayout");
        minhaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um painel principal com CardLayout
        CardLayout layout = new CardLayout();
        JPanel telaPrincipal = new JPanel(layout);

        // Cria duas telas
        JPanel tela1 = new JPanel();
        tela1.add(new JLabel("Tela 1"));
        JButton botao1 = new JButton("Ir para Tela 2");
        tela1.add(botao1);

        JPanel tela2 = new JPanel();
        tela2.add(new JLabel("Tela 2"));
        JButton botao2 = new JButton("Ir para Tela 1");
        tela2.add(botao2);

        // Adiciona as telas ao painel principal
        telaPrincipal.add(tela1, "tela1");
        telaPrincipal.add(tela2, "tela2");

        // Adiciona ouvintes de eventos aos botões para alternar entre as telas
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                layout.show(telaPrincipal, "tela2");
            }
        });

        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                layout.show(telaPrincipal, "tela1");
            }
        });

        // Adiciona o painel principal à janela
        minhaJanela.getContentPane().add(telaPrincipal);

        // Configura o tamanho da janela e a torna visível
        minhaJanela.setSize(1000, 600);
        minhaJanela.setVisible(true);
    }
}
