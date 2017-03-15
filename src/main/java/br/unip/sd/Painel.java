/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.unip.sd;
import javax.swing.JFrame;

/**
 *
 * @author unip
 */
public class Painel {
    public static void main(String[] args) {
            JFrame janela = new JFrame("Meu Frame");
		
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		janela.add(janela);
		janela.setSize(600,400);
		janela.setVisible(true);
	}

}