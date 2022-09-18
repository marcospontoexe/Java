/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author marcos
 */
public class Fatorial {
    //DECLARAÇÃO DOS ATRIBUTOS
    private int num = 0;        //modificador de visibilidade: public(-), private(+), protect(#)
    private int fat = 1;        //Indica o níveis de acesso aos atributos e métodos de uma classe
    private String formula =""; //private torna o acesso dos atributos disponíveis apenas dentro da classe pertecentes
    
    /* MODIFICADORES DE ACESSO
    Indica o níveis de acesso aos atributos e métodos de uma classe;
    public(-): Qualquer classe tem acesso aos atributos e métodos
    private(+): Apenas a classe proprietária do atributos ou método tem acesso
    protect(#): Classes mães e filhas podem ter acesso aos atributos e métodos
    */
    
    //DECLARAÇÃO E MÉTODOS
    //define o estado dos atributos
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
    
    // retorna o estado dos atributos 
    public int getFatorial(){
        return fat;
    }    
    public String getFormula(){
        return formula;
    }
    
    
}
