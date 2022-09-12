/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicaoif;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class CondicaoIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);   //Objeto para manipular as entradas do sistema
        System.out.print("Digite a primeira nota do aluno:");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota do aluno:");
        float n2 = teclado.nextFloat();
        
        float media = (n1+n2)/2;
        
        if(media >= 7){
            System.out.println("Média: " + media);
            System.out.println("Aluno aprovado. PARABÉNS!");
        }
        else{
            System.out.println("Média: " + media);
            System.out.println("Aluno reprovado. ESTUDE MAIS!");
        }
        
        
    }
    
}
