package heranca;
/*
HERANÇA PARA DIFERENÇA: A classe filha possui atributos e métodos que a classe mãe não possui.
O 'extends' faz a classe 'Funcionario()' herdar características da classe 'Pessoa()'. 
Funcionario() é classe filha de Pessoas()
*/

public class Funcionario extends Pessoa{    
    // atributos
    private String setor;
    private boolean trabalhando;
    
    // métodos
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;   //altera o estado lógico da variável boleana        
     
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
