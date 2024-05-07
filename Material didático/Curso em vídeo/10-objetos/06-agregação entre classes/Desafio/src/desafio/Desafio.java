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
        a[0] = new Avaliador("estrela de mel", "Creide",68,"Feminino");
        a[1] = new Avaliador("trigrão do pântano","Joserval", 21, "Masculino");
        System.out.println("-----------------Avaliador()-------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        
        Visualizacao viz1 = new Visualizacao(a[0], v[0]);
        Visualizacao viz2 = new Visualizacao(a[0], v[1]);
        Visualizacao viz3 = new Visualizacao(a[1], v[1]);
        viz2.avaliar(10);
        viz3.avaliar(8);
        System.out.println("------------Vizualizacao()---------------");
        System.out.println(viz1.toString());
        System.out.println(viz2.toString());
        System.out.println(viz3.toString());
    }
    
}
