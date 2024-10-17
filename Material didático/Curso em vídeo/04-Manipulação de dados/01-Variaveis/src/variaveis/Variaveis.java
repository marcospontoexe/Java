package variaveis;

import java.util.Scanner;   // para manipular entrada de dados

public class Variaveis {

    public static void main(String[] args) {
        //-------DECLARANDO VARIÁVEIS---------------------------------------
        int idade = 30;             // (família n° inteiro -> float e double)   
        float gasolina = 5.65258f;    //variáveis do tipo float precisam do f no final    -   (família n° reais -> byte, short, int, long)   
        char sexo = 'M';            //usar aspas simples para char (aceita apenas uma letra)    - (família literal)
        /*NÃO EXISTE O TIPO STRING EM JAVA, mas existe a classe involucro String()
        String nome = new String("Joanildo");        //declaração de um objeto (dependentes) da classe String()
        String nome = "Joanildo";
        Integer dependentes = new Integer(3);    //declaração de um objeto (dependentes) da classe Integer()
        */
        String nome = "Joanildo";
        boolean idoso = false;      //(família logica)  
        
        // declaração de variável usando typecast
        int ano = (int)2020;    // declaração de variável usando typecast
        float peso = (float)60.5;
        
                
        //-------------------MANIPULANDO SAÍDA DE DADOS--------------------------
        System.out.print("\nsua idade eh: " + idade + "anos."\n");        // O caracter especial \n pula uma linha
        System.out.println("sua idade eh: " + idade + "anos.");                //imprime na tela e pula uma linha
        //impressão formatada 
        System.out.printf("seu salário eh: %.2f R$!\n", gasolina);      //usar \n para pular linha
        System.out.printf("Seu nome eh: %s e pesa %.1f\n", nome, peso);
         System.out.format("Altura: %.2f\n", gasolina);
        
        //-------------MANIPULANDO ENTRADA DE DADOS---------------------
        Locale.setDefault(new Locale("pt", "BR"));     //define as configurações regionais deste código para pt-BR (português do Brasil), troca o . pela ,
        Scanner teclado = new Scanner(System.in);    // para ativar a classe Scaner() é preciso criar um objeto.
        System.out.println("Digite o nome do aluno!");
        String aluno = teclado.nextLine();              //recebe uma string de teclado
        System.out.println("Digite a nota do aluno!");
        float nota = teclado.nextFloat();               //recebe um float do teclado. No lugar do ponto a vírgula é o separador decimal
        System.out.printf("O aluno %s tirou nota %.1f \n", aluno, nota);

        System.out.println("Digite o peso do aluno!");
        double peso =  teclado.nextDouble();
        System.out.println("Digite a idade do aluno!");
        int idade =  teclado.nextInt();
        
        
        //----------------CONVERSÃO DE VARIÁVEL---------
        // converte int para string        
        int idade1 = 30;
        String idadeStr = Integer.toString(idade1);        
        System.out.println(idade1);
              

        // string para int 
        int n1 = 5;
        String n2 = "2";
        int n3 = Integer.parseInt(n2);
        
        int soma = n1 + n3;
        System.out.println(soma);
    }
    
}
