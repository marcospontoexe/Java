
package usandointerface;


public interface Controlador {
    // métodos da interface
    public abstract void ligar();  // Os método de uma interface precisam ser publico e abstrato, e não são implementados (desenvolvidos) na interface, são apenas previstos
    public abstract void desligar();
    public abstract void abrirInfo();
    public abstract void fecharInfor();
    public abstract void aumentarVol();
    public abstract void diminuirVol();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    
}
