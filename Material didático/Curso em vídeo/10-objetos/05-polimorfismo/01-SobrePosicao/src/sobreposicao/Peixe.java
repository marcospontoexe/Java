package sobreposicao;


public class Peixe extends Animal{
    //atributos
    private String corEscama;
        
    //métodos
    public void soltarBolhas(){
        System.out.println("soltando bolhas.");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //É obrigatória a implementação dos métodos abstratos nas classes filhas
    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhocas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som.");
    }
    
}
