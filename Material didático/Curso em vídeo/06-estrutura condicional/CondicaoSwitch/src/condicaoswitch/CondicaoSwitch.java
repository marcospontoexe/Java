/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicaoswitch;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class CondicaoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de pernas: ");
        int pernas = teclado.nextInt();
        
        switch(pernas){
            case 1 :
                System.out.println("Saci.");
                break;
            case 2:
                System.out.println("Bípede.");
                break;
            case 3:
                System.out.println("Tripé.");
                break;
            case 4:
                System.out.println("Quadrupede.");
                break;
            case 5, 7:
                System.out.println("Et.");
                break;   
            default:
                System.out.println("Animal desconhecido!");
        }
        
        
    }
    
}
