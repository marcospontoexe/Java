package heranca;
/*
A classe Pessoa() é uma classe abstrata.
*/

public abstract class Pessoa {       // CLASSE MÃE (ABSTRATA)
    //atributos     
    private String nome;
    private String sexo;
    private int idade;
    
    //  MÉTODOS ABSTRATOS
    public void fazerAniversario(){
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //método especial
    @Override
    public String toString() {  // retorna uma string com o estado dos atributos
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }
    
    
    
}
