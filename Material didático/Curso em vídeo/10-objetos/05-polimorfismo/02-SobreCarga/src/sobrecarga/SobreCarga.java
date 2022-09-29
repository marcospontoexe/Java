package sobrecarga;
/*
POLIMORFISMO POR SOBRECARGA: A assinatura do método é diferente, e precisa estar na mesma classe
*/

public class SobreCarga {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("toma comida");    //abanar rabo e latir
        c.reagir("pra casinha");    //rosnar
        
        c.reagir(11,45);        //Abanar o rabo
        c.reagir(21,00);        //Abanar e latir
        
        c.reagir(false);        //Rosnar e latir
        c.reagir(true);         //Abanar o rabo
        
        c.reagir(2, 12.5f);     //Latir
        c.reagir(17, 4.5f);     //Rosnar
    }
    
}
