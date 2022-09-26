package heranca;

public class Heranca {

    public static void main(String[] args) {
        // programa principal
        
        //criando 4 objestos de classes diferentes cada um
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");    //p2 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        p3.setNome("Joana");//p3 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        p4.setNome("Henrique");//p4 acessa o metodo 'setNome()' da classe mãe (Pessoa())
        
        p2.setCurso("Java");
        p3.setSalario(3254.98f);
        p4.setSetor("estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
