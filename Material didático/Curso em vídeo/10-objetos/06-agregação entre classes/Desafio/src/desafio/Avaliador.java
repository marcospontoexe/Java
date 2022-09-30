package desafio;


public class Avaliador extends Pessoa{
    //atributos
    private String login;
    private int totAssistindo;
    
    //construtor
    public Avaliador(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);   //passa os atributos do construtor para a classe mãe (Pessoa(), pois tab tem um construtos)
        this.login = login;
        this.totAssistindo = 0;
    }
    
    
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

    @Override
    public String toString() {
        return super.toString() //chama o método toString() da classe mãe
                + "\nAvaliador{" + "login=" + login + 
                ", totAssistindo=" + totAssistindo + '}';
    }
    
}
