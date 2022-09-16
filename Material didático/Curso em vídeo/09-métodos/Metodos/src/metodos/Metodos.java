/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author marcos
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b){     //o método  soma deve ser estática, pois é chamado por outro método estático (main)
        int soma = a+b;
        System.out.println("A soma é: " + soma);
    }
    
    static int dobro(int a){            // método com retorno inteiro
        return a*2;       
       
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        soma(5, 2);
        int d = dobro(2);
        System.out.println("O dobro de 2 e: " + d);
        
        //usando métodos de classes externas
        System.out.println("Vai começar a contagem;");
        System.out.println(Operacoes.contator(1 ,10));  //usando o método contador da classe operacoes
        
    }
    
}
