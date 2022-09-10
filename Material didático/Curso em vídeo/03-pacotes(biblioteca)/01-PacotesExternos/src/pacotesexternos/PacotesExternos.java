package pacotesexternos;    

import java.util.Date;      /* importa a classe Date */


public class PacotesExternos {
   
    public static void main(String[] args) {
        Date relogio = new Date();          /* cria um novo objeto chamado relogio, a partir da classa Date()*/
        System.out.println("O dia e hora atual eh:");
        System.out.println(relogio.toString());         /* converte o objeto em string */
        
        //int ano = Integer.parseInt(relogio.getYear().ToString());
        System.out.println(relogio.getYear());
        
    }
    
}
