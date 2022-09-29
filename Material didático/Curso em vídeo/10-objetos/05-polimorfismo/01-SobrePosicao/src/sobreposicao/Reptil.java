package sobreposicao;


public class Reptil extends Animal{
    //atributos
    private String corEscama;
    
    //métodos
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    //É obrigatória a implementação dos métodos abstratos nas classes filhas
    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil.");
    }
    
}
