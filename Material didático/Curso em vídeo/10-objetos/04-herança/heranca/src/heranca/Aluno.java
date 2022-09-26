package heranca;


public class Aluno extends Pessoa{        //O 'extends' faz a classe 'Aluno()' herdar características da classe 'Pessoa()'. Aluno() é classe filha de Pessoas()
    // atributos
    private int matricula;
    private String curso;
    
    //métodos
    public void cancelarMatricula(){
        System.out.println("A matrícula será cancelada.");
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
