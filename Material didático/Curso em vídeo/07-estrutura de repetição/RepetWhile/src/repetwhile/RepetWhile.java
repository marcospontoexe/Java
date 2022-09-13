/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetwhile;

/**
 *
 * @author marcos
 */
public class RepetWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        
        while(cont < 10){
            cont++;
            
            if(cont == 5){
                continue;       //volta imediatamente para o início do laço de repetição, e não imprime o n´mero 5
            }
            
            
            
            System.out.println("c: " + cont);
        }
    }
    
}
