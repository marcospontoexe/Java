/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author marcos
 */
public class Fatorial {
    //DECLARAÇÃO DOS ATRIBUTOS
    private int num = 0;        //private torna o acesso dos atributos disponíveis apenas dentro da classe pertecentes
    private int fat = 1;
    private String formula ="";
    
    //DECLARAÇÃO E MÉTODOS
    public void setValor(int n){    //método de alterar um atributo privado
        num = n;        //método de alterar um atributo privado
        int f = 1;
        String temp = "";
        for(int i = n; i>1; i--){
            f *= i;
            temp += i + "*";
        }
        temp += "1 = ";
        fat = f;
        formula = temp;
        
    }
    
    public int getFatorial(){
        return fat;
    }
    
    public String getFormula(){
        return formula;
    }
    
    
}
