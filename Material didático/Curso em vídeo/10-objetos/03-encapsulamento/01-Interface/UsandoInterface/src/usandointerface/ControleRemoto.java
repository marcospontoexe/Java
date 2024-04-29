
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

    // Os métodos acessores e modificadores devem ser definidos como privados
    private Boolean getLigado() {
        return ligado;
    }

    private void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
               
    }

    // MÉTODOS ABSTRATOS
    @Override           //override significa 'sobrescrever' o método já definido na interface
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
        System.out.print("Volume "+"("+this.getVolume()+"): ");
        for(int i = 0; i < 100; i+=5){
            if(i < this.getVolume()){
                System.out.print("|");
            }else{
                System.out.print("-");
            }            
        } 
        System.out.println("");
    }

    @Override
    public void fecharInfor() {
        System.out.println("Fechando menu...");
        
    }

    @Override
    public void aumentarVol() {
        if((this.getLigado()) && (volume >= 0 || volume <= 100)){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void diminuirVol() {
        if((this.getLigado()) && (volume >= 0 || volume <= 100)){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && volume != 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && volume == 0){
            this.setVolume(50);
        }
    }

    
    
    
    
    
}
