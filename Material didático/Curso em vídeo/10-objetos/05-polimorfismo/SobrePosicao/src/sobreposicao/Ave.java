package sobreposicao;

/**
 *
 * @author marcos
 */
public class Ave extends Animal{
    //atributos
    private String corPena;
    
    //métodos
    public void fazerNinho(){
        System.out.println("fazendo ninho.");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //É obrigatória a implementação dos métodos abstratos nas classes filhas
    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
         System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom() {
         System.out.println("Som de ave.");        
    }
    
    
}
