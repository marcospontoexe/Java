package heranca;
/*
HERANÇA PARA DIFERENÇA: A classe filha possui atributos e métodos que a classe mãe não possui.
O 'extends' faz a classe 'Aluno()' herdar características da classe 'Pessoa()'. 
Aluno() é classe filha de Pessoas()
*/


public class Aluno extends Pessoa{            
    // atributos protegidos, da acesso às classes filhas.
    protected int matricula;
    protected String curso;
    
    //métodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno.");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
