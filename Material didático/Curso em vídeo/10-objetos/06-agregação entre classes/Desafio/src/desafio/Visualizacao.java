package desafio;
//Agregação das classes Video() e Avaliador com a classe Vizualizacao()
public class Visualizacao {
    //atributos agregados
    private Avaliador espectador;   //agrega o atributo da classe Vizualizacao com a classe Avaliador
    private Video filme;        //agrega o atributo da classe Vizualizacao com a classe Video
    
    //construtor
    public Visualizacao(Avaliador espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1); //quando é criado uma visualização o 'totAssistindo' de uma avaliador é incrementado
        this.filme.setViews(this.filme.getViews()+1); //quando é criado uma visualização o 'views' de uma Video é incrementado
    }
        
    //metodos
    public Avaliador getEspectador() {
        return espectador;
    }

    public void setEspectador(Avaliador espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Vizualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
        
}
