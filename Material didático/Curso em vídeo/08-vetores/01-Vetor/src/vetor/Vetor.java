/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

import java.util.Arrays;



/**
 *
 * @author marcos
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = new int[3];   //cria um vetor (variável composta) com 3 índices
        n[0] = 5;
        n[1] = 3;
        n[2] = 9;
        System.out.println("vetor n[0]: " + n[0]);
        System.out.println("vetor n[1]: " + n[1]);
        System.out.println("vetor n[2]: " + n[2]);
        
        int n2[] = {6, 8, 4, 8, 7, 11};       // declarando outro vetor (variável composta)
        String nome[] = {"Marcos", "daniel", "santana"};    //vetor do tipo string
        
        //for it
        System.out.print("Vetor n2[]: ");
        for(int valor: n2){
            System.out.print(valor + " | ");
        }
        System.out.println("");
        
        //métodos de vetores
        System.out.println("O vetor n2 tem: " + n2.length +" índices");     // mostra o tamnho do vetor
        
        Arrays.sort(n2);                //ordena os valores do vetor em ordem crescente
        System.out.print("Arrays.sort(n2);" );       
        for(int valor: n2){
            System.out.print(valor + " | ");
        }
        System.out.println("");
        
        int posicao = Arrays.binarySearch(n2, 8);   //retorna o ídice da busca, caso não encontre retorna valor negativo (-).
        System.out.println("O número 8 está na posição: " + posicao);
        
        Arrays.fill(n2, 0);         //preenche todos os índices com o valor 0
        System.out.print("Arrays.fill(n2, 0); " ); 
        
        // usando for eath
        for(int valor: n2){
            System.out.print(valor + " | ");
        }
        System.out.println("");
        
        
        
    }
    
}
