/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author marcos
 */
public class Operacoes {
    public static String contator(int ini, int fim){  //o método precisa ser estatico para poder ser chamado pelo main. E publico para poder ser acessado por qq classe externa
        String s ="";
        for(int i = ini; i<= fim; i++){
            s += i + " ";
        }
        return s;
    }
}
