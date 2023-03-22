package br.com.arquivos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploBotao {

    public static void main(String[] args) {
        // Cria uma janela
        JFrame minhaJanela = new JFrame("Exemplo de Botão");
        minhaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria um painel
        JPanel meuPainel = new JPanel();
        
        // Cria um botão
        JButton meuBotao = new JButton("Clique Aqui");
        
        JButton botaoEspaco = new JButton();
        botaoEspaco.setSize(50, 100);
        
        // Adiciona o botão ao painel
        meuPainel.add(botaoEspaco, BorderLayout.PAGE_START);
        meuPainel.add(meuBotao);
        
        // Adiciona um ouvinte de eventos ao botão
        meuBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão clicado");
            }
        });
        
        // Adiciona o painel à janela
        minhaJanela.getContentPane().add(meuPainel);
        
        // Configura o tamanho da janela e a torna visível
        minhaJanela.setSize(300, 200);
        minhaJanela.setVisible(true);
    }
}

