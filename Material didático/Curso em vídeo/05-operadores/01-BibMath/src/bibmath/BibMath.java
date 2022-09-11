/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibmath;

/**
 *
 * @author marcos
 */
public class BibMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(Math.abs(-10));  //mostra o valor absoluto (sem o sinal)
        // MÉTODOS DE TRUNCAGEM (RETIRAR A PARTE DECIAML)
        float n1 = 8.3f;
        int v1 = (int) Math.floor(n1);  //arredonda para baixo
        int v2 = (int) Math.ceil(n1);   //arredonda para cima
        int n3 = (int) Math.round(n1);      //arredonda para baixo
        System.out.println("floor: " + v1);
        System.out.println("Ceil: "+ v2);
        System.out.println("Round: " + n3);
        
        //----------GERA NÚMERO ALEATÓRIO--------
        double al = Math.random();  //gera um número aleatório entre 0 e 1
        double al2 = 5 + (al * (10-5));        //gera um número entre 5 e 10
        int al3 = (int) (5 + (al * (10-5)));        //gera um número inteiro entre 5 e 10
        System.out.println(al3);
    }
    
}
