package heranca;
/*
Classes podem criar outras classes filhas (especialização).
As classes filhas vieram de uma classe mãe (generalizada).
    ---------------------------------------------------
CLASSE ABSTRATA: Não pode ser instanciada, e so pode servir como classe mãe.
MÉTODO ABSTRATO: Declarado mas não implementado na classe mãe, e só pode existir dentro de uma Interface ou dentro de uma classe abstrata.
CLASSE FINAL: É obrigatóriamente folha, não pode ter classe filha.
MÉTODO FINAL: Não pode gerar uma especialização do método final, é obrigatoriamente herdado.
*/

public class Heranca {

    public static void main(String[] args) {
        // programa principal
        
        //criando 4 objestos de classes diferentes cada um
        Visitante p1 = new Visitante();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();   
        Bolsista p5 = new Bolsista();
       
        p1.setNome("Pedro");
        p2.setNome("Maria");    //p2 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        p3.setNome("Joana");//p3 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        p4.setNome("Henrique");//p4 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        p5.setNome("Manoeli");
        
        p2.setCurso("Java");
        p3.setSalario(3254.98f);
        p4.setSetor("estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        
        p2.pagarMensalidade();
        p5.pagarMensalidade();  //método sobrestcrito
    }
    
}
