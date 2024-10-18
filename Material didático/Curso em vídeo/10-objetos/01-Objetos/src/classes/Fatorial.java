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
    private int num = 0;       
    private int fat = 1;       
    private String formula =""; 
    /* MODIFICADORES DE ACESSO
    Indica o níveis de acesso aos atributos e métodos de uma classe;
    public(-): Qualquer classe tem acesso aos atributos e métodos
    private(+): Apenas a classe proprietária do atributos ou método tem acesso
    protected(#): Classes mães e filhas podem ter acesso aos atributos e métodos
    */
    
    //DECLARAÇÃO E MÉTODOS
    public Fatorial(String val){                  //construtor é executado sempre que um objeto é instanciado(criado)
        formula = "calculando fatorial..."; 
        System.out.println(val);
    }  
    
    /*  Metódos acessores (getter e setter)
    Permite alterar acessar atributos e métodos privados
    */
    //define o estado dos atributos
    public void setValor(int n){    
        num = n;        
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
