
package usandointerface;

/**
 *
 * @author marcos
 */
public class ControleRemoto implements Controlador{     // A classe 'ControleRemoto()' implementa a interface 'Controlador()' 
    // ATRIBUTOS
    private Boolean ligado;
    private int volume;
    
    // MÉTODOS ESPECIAIS
    public ControleRemoto(){        //CONSTRUTOR 
        this.ligado = false;
        this.volume = 20;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        while(true){
            if (volume >= 0 || volume <= 100){
                this.volume = volume;
                break;
            }
            System.out.println("Volume entre 0 e 100! Digite novamente!");
        }        
    }

    // MÉTODOS ABSTRATOS
    @Override           //override significa 'sobrescrever' o método já definido na classe 'ControleRemoto'
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirInfo() {
        System.out.println("Esta ligado: "+ this.getLigado());
        System.out.print("Volume: ");
        for(int i = 0; i <= 100; i+=5){
            if(i <= this.getVolume()){
                System.out.println("|");
            }else{
                System.out.println("-");
            }            
        }      
    }

    @Override
    public void fecharInfor() {
        System.out.println("Fechando menu...");
        
    }

    @Override
    public void aumentarVol() {
    }

    @Override
    public void diminuirVol() {
    }

    @Override
    public void ligarMudo() {
    }

    @Override
    public void desligarMudo() {
    }

    
    
    
    
    
}
