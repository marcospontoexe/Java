package desafio;
/*
programa principal
*/
public class Desafio {

    public static void main(String[] args) {
        Video v[] = new Video[3];       //cria 3 objetos
        //instancia os objetos criados
        v[0] = new Video("Aula 53 de trico");
        v[1] = new Video("Aula 2 de polidance");
        v[2] = new Video("Aula 9 de esgrima");
        System.out.println("---------Video()--------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        Avaliador a[] = new Avaliador[2];
        a[0] = new Avaliador("Creide", "Feminino", 68, "estrela de mel");
        a[1] = new Avaliador("Joserval", "Masculino", 21, "trigrão do pântano");
        System.out.println("-----------------Avaliador()-------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        
        Visualizacao viz = new Visualizacao(a[0], v[0]);
        System.out.println("------------Vizualizacao()---------------");
        System.out.println(viz.toString());
    }
    
}
