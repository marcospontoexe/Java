package heranca;

public class Professor extends Pessoa{  //O 'extends' faz a classe 'Professor()' herdar características da classe 'Pessoa()'. Professor() é classe filha de Pessoas()
    // atributos
    private String especialidade;
    private float salario;
    
    //métodos
    public void receberAumento(float aum){
        this.salario += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
