/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opternario;

/**
 *
 * @author marcos
 */
public class OpTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, res;
        n1 = 10;
        n2 = 4;
        res = (n1>n2)?n1:n2;    //caso n1 seja maior q n2, res recebe o valor de n1, caso contrário recebe o valor de n2
        System.out.printf("n1: %d\n", n1);
        System.out.printf("n2: %d\n", n2);
        System.out.printf("O maior é: %d\n", res);
    }
    
}
