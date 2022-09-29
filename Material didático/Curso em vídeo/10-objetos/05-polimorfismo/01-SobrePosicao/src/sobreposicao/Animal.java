
package sobreposicao;

/*
CLASSE ABSTRATA
*/

public abstract class Animal {
    //atributos
    private float peso;
    private int idade;
    private int membros;
    
    //MÉTODOS ABSTRATOS (não podem ser instanciado na sua classe).
    //É obrigatória a implementação dos métodos abstratos nas classes filhas
    public abstract void locomover();      
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
