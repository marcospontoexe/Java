package heranca;
/*
A classe Bolsista(), é uma especialização de aluno.
É uma classe folha (classe final).
*/
public final class Bolsista extends Aluno{  // CLASSE FINAL
    //atributos
    private int bolsa;
    
    //métodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa...");
    }
    
    //MÉTODO SOBREPOSOTO DE ALUNO
    @Override
    public void pagarMensalidade(){     //método sobrescreve o método da classe mãe
        System.out.println("Pagando a mensalidade do bolsista...(metodo sobreposto)");
    }
    
    
}
