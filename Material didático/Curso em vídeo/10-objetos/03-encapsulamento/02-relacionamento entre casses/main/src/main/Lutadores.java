package main;


public class Lutadores {
    //  ATRIBUTOS
    private String nome,nacionalidade,categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    //  MÉTODOS
    //construtor
    public Lutadores(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);         //chama o método setPeso(para atribuir o peso e calcular a categoria)
       
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {       // a categoria sera definida automaticamente dentro da classe. Bloqueada externamente
        if(this.peso >= 52.2){
            if(this.peso <= 70.3){
                this.categoria = "Peso pena";
            }
            else if(this.peso <= 83.9){
                this.categoria = "Peso médio";
            }
            else if(this.peso <= 120.2){
                this.categoria = "Peso pesado";
            }
            else{
                this.categoria = " categorial inválida!";
            }
        }
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();            //assim que receber o peso, a categoria é definida
    }
    
    
    
    public void apresentar(){
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println("Pesando " + this.getPeso() + " quilos");
        
        
    }
    
    public void status(){
        System.out.println(this.getNome()+ " é da categoria " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes.");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("E empatou "+ this.getEmpates() + " vezes");
        
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    
}
