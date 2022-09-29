package sobreposicao;


public class Mamifero extends Animal{
    //atributos
    private String corPelo;
    
    //métodos
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    //É obrigatória a implementação dos métodos abstratos nas classes filhas
    @Override
    public void locomover() {
        System.out.println("Correndo.");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero.");
    }
    
}
