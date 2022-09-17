/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos;

import classes.Fatorial;

/**
 *
 * @author marcos
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial f = new Fatorial();    
        System.out.println("Fatorial de cinco;");
        f.setValor(5);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
        
        
    }
    
}
