package desafio;


public class Avaliador extends Pessoa{
    //atributos
    private String login;
    private int totAssistindo;
    
    //metodos
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }
    
}
