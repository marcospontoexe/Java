/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usandointerface;

/**
 *
 * @author marcos
 */
public class UsandoInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
        c.ligar();          //liga
        c.diminuirVol();    //diminui 5
        c.diminuirVol();    //diminui 5
        c.ligarMudo();      //muta o volume (volume = 0)
        c.desligarMudo();   //desliga o modo mute com volume em 50
        c.abrirInfo();
        c.fecharInfor();
        
    }
    
}
