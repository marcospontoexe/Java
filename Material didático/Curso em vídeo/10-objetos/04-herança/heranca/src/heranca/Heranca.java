package heranca;
/*
Classes podem criar outras classes filhas (especialização).
As classes filhas vieram de uma classe mãe (generalizada).
    ---------------------------------------------------
CLASSE ABSTRATA: Não pode ser instanciada, e so pode servir como classe mãe.
MÉTODO ABSTRATO: Declarado mas não pode ser implementado na sua classe, e só pode existir dentro de uma Interface ou dentro de uma classe abstrata.
CLASSE FINAL: É obrigatóriamente folha, não pode ter classe filha.
MÉTODO FINAL: Não pode gerar uma especialização do método final, é obrigatoriamente herdado.
*/

public class Heranca {

    public static void main(String[] args) {
        // programa principal
        
        //criando 4 objestos de classes diferentes cada um
        Visitante v1 = new Visitante();
        Aluno a2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario f4 = new Funcionario();   
        Bolsista b5 = new Bolsista();
       
        v1.setNome("Pedro");
        a2.setNome("Maria");    //a2 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        p3.setNome("Joana");//p3 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        f4.setNome("Henrique");//f4 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        b5.setNome("Manoeli");
        
        a2.setCurso("Java");
        p3.setSalario(3254.98f);
        f4.setSetor("estoque");
        
        System.out.println(v1.toString());
        System.out.println(a2.toString());
        System.out.println(p3.toString());
        System.out.println(f4.toString());
        System.out.println(b5.toString());
        
        a2.pagarMensalidade();
        b5.pagarMensalidade();  //método sobreposto
    }
    
}
