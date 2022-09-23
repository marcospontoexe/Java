
package main;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Lutadores l[] = new Lutadores[6];       //cria um vetor de objetos. Cada um dos seis índices recebe um lutador diferente
        l[0] = new Lutadores("PretyBoy", "França", 31, 1.75f, 68.9f, 11, 2, 1);    //cria o primeiro lutador       
        l[1] = new Lutadores("PutScript", "França", 29, 1.68f, 57.8f, 14, 2, 3);    //cria o segundo lutador
        l[2] = new Lutadores("SnapShadow", "EUA", 35, 1.65f, 80.9f,12, 2 ,1);
        l[3] = new Lutadores("DeadCode", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutadores("UfoCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutadores("NerdArt", "Portugual", 30, 1.81f, 105.7f, 12, 2, 4);

        l[5].apresentar();
        l[5].status();        
    }
    
}
