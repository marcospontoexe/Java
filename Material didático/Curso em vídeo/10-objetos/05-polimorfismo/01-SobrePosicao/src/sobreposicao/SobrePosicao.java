package sobreposicao;

/*
ASSINATURA DO MÉTODO: é definida pela quantidade e tipo dos atributos de entrada
POLIMORFISMO DE SOBREPOSIÇÃO: Quando o mesmo método da classe mãe é usado na classe filha com a mesma assinatura
*/

public class SobrePosicao {

    public static void main(String[] args) {
        //instanciando objetos
        Mamifero m = new Mamifero();
        Reptil r =new Reptil();
        Ave a =new Ave();
        Peixe p =new Peixe();
        
        m.locomover();      //correndo
        m.alimentar();      //mamando
        m.emitirSom();      //som de mamifero
        
        
        a.fazerNinho();
        //POLIMORFISMO com métodos sobrepostos
        a.locomover();      //voando
        a.alimentar();      //comendo frutas
        a.emitirSom();      //som de ave
        
        p.soltarBolhas();
        //POLIMOSFISMO com métodos sobrepostos
        p.locomover();      //nandando
        p.alimentar();      //comendo minhoca
        p.emitirSom();      //peixe não emite som
        
        
    }
    
}
