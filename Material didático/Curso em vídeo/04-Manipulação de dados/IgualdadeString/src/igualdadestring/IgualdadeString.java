/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igualdadestring;

/**
 *
 * @author marcos
 */
public class IgualdadeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Marcos";
        String nome2 = "Marcos";
        String nome3 = new String("Marcos");
        String res;
        
        //nome1 e nome2 são objetos que tem a mesma estrutura
        res = (nome1 == nome2)?"igual":"diferente";    
        System.out.println(res);
        
        //nome1 e nome3 são diferentes, pois nome3 foi estruturado usando a clausula new
        res = (nome1 == nome3)?"igual":"diferente";    
        System.out.println(res);
        
        //comparando strings estruturadas com o new
        res = (nome1.equals(nome3))?"igual":"diferente";    // verifica se o conteudo de um objeto é igual ao conteúdo do outro objeto
        System.out.println(res);
        
        
        
    }
    
}
