
package main;

import java.util.Random;

/**
 *
 * @author marcos
 */
public class Luta {
    // esta classe se relaciona com a classe lutadores, construindo uma agregação entre objetos de classes diferentes
    private desafiado;        // 'desafiado' é um tipo abstrato (e não primitiva). "desafiado" é uma instnacia da classe Lutadores(), é um objeto da classe Lutadores()
    private desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    //  MÉTODOS públicos
    public void marcarLuta(Lutadores l1, Lutadores l2){     //o método recebe dois objetos como parâmetro de entrada
        if(l1.getCategoria().equals(l2.getCategoria())  // para comparação entre classes é aconselhavel usar "equals", para compara apenas o conteúdo, e não todas características
           && l1 != l2){    // verdadeiro quando são dois objetos diferentes   
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else{
            this.aprovada = false;
            this.desafiado = null;      
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("APRENSENTANDO O DESAFIANTE...");
            this.desafiante.apresentar();
            this.desafiante.status();
            System.out.println("APRESENTANDO O DESAFIADO...");
            this.desafiado.apresentar();
            this.desafiado.status();
            
            Random aleatorio = new Random();        //importa a classe random
            int resut = aleatorio.nextInt(3);       //gera um n° aleatório de 0 a 2
            System.out.println("======RESUTADO DA LUTA===========");
            switch(resut){
                case 0:     //empate
                    System.out.println("Luta empatada!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:     //desafiado vence
                    System.out.println(this.desafiado.getNome()+" venceu a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:     //desafiado perde
                    System.out.println(this.desafiante.getNome()+" venceu a luta!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                default:
                    System.out.println("Erro para determinar o ganhador da luta!");
                    
            }
            System.out.println("===================================");
            System.out.println("Status do desafiante:");
            this.desafiante.status();
            System.out.println("");
            System.out.println("Status do desafiado:");
            this.desafiado.status();
        }
        else{
            System.out.print("A luta nao pode acontecer: ");
            
        }
    }
    
    //   MÉTODOS especiais
    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
