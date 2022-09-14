/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingjanelaautomatica;

import javax.swing.JOptionPane;     //classe com paineis prontos

/**
 *
 * @author marcos
 */
public class SwingJanelaAutomatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // para mostrar uma mensagem em uma janela pronta
        JOptionPane.showMessageDialog(null, "Olá povo", "Janela de boas vindas", JOptionPane.INFORMATION_MESSAGE);   //'null' é onde vai o nome da janela
        
        //para solicitar algo
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro!"));
        JOptionPane.showMessageDialog(null, "você digitou: "+valor);
    }
    
}
