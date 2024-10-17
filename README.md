# JAVA
Este repositório mostra alguns exemplos de uso da linguagem Java e sua sintaxe.

## Exemplos de uso
* Veja como usar [pacotes](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/03-pacotes(biblioteca)) externos.
* Crie **interfaces gráficas** usando a biblioteca [Swing](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/03-pacotes(biblioteca)/04-swing). 
   * Execute a aplicação de exemplo ["Usando_Swing.jar"](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/03-pacotes(biblioteca)/04-swing/Usando%20Swing/dist).
   * Execute a aplicação de exemplo ["imagens.jar"](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/03-pacotes(biblioteca)/04-swing/relogio/Imagens/dist) para obeter a data e hora do sistema operacional.
   * Execute a aplicação ["SwingJanelaAutomatica.jar"](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/03-pacotes(biblioteca)/06-SwingJanelaAutomatica/dist) para um exemplo de interatividade com o usuário.
* Crie **interfaces gráficas** usando a plataforma **JavaFX**.
    * Veja o exemplo ["OlaMundo.jar"](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/03-pacotes(biblioteca)/05-JavaFX/OlaMundo/dist).
* Java é uma linguagem **fortemente tipada**, veja como usar [entradas e saidas de dados e manipular variáveis](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/04-Manipula%C3%A7%C3%A3o%20de%20dados/01-Variaveis/src/variaveis/Variaveis.java).
Abaixo os tipos primitivos das variáveis da linguagem Java.
![Tipos de variáveis](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/Imagens/vari%C3%A1veis.png)

| Código  | Regra                                                      | Exemplo                          | Observações                                                                                     |
|---------|-------------------------------------------------------------|----------------------------------|-------------------------------------------------------------------------------------------------|
| float   | Números float terminam com f ou F.                          | `float a = 7.1f;`  `float b = 3.1415F;` | Um número com ponto flutuante e sem letra no final é `double` por padrão no Java.               |
|         |                                                             |                                  | Apenas para identificação de tipo, maiúsculas e minúsculas são equivalentes.                    |
| double  | Números double terminam com d ou D.                         | `double c = 7.1d;`  `double d = 3.1415D;` |                                                                                                 |
| long    | Números long terminam com l ou L.                           | `long e = 12l;`  `long f = 25L;` |                                                                                                 |
| int     | Para representar números em diferentes sistemas de numeração. | `int decVal = 26;`  `int hexVal = 0x1A;`  `int binVal = 0b11010;` | `26` em decimal, hexadecimal, e binário.                                                        |

    * Veja um exemplo de aplicação gráfica usando a **biblioteca Swing** para [somar](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/04-Manipula%C3%A7%C3%A3o%20de%20dados/02-SomaSwing/dist) dois valores inteiros, e outro para [calcular a idade](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/04-Manipula%C3%A7%C3%A3o%20de%20dados/03-CalculaIdade/dist) a partir da data e hora atual do sistema operacional.
    * Como [comparar Strings](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/04-Manipula%C3%A7%C3%A3o%20de%20dados/04-IgualdadeString/src/igualdadestring/IgualdadeString.java).
* Como trabalhar com **operadores** usando a biblioteca [Math](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/05-operadores/01-BibMath/src/bibmath/BibMath.java).
    * Veja um [exemplo](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/05-operadores/02-SwingMath/dist) usando a Swing para achar as raizes, o cubo, o quadrado e o resto da divisão de um inteiro.
    * Exemplo usando [operador ternário](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/05-operadores/03-OpTernario/src/opternario/OpTernario.java).
    * Execute o jogo ["Genio.jar"](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/05-operadores/04-Genio/dist) desenvolvido com a biblioteca *Swing* e *Math*.
* Estruturas condicionais
    * Veja como usar a estrutura [`if`](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/06-estrutura%20condicional/01-CondicaoIf/src/condicaoif/CondicaoIf.java).
    * Veja como usar a estrutura [`switch`](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/06-estrutura%20condicional/02-CondicaoSwitch/src/condicaoswitch/CondicaoSwitch.java).
    * A aplicação ["Triangulos.jar"](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/06-estrutura%20condicional/03-Triangulos/dist) verifica qual é o tipo do triângulo.
* Etruturas de repetição.
    * Veja como usar a estrutura [`while`](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/07-estrutura%20de%20repeti%C3%A7%C3%A3o/01-RepetWhile/src/repetwhile/RepetWhile.java).
    * Veja como usar a estrutura [`do while`](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/07-estrutura%20de%20repeti%C3%A7%C3%A3o/02-RepetDoWhile/src/repetdowhile/RepetDoWhile.java).
    * Veja como usar a estrutura [`for`](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/07-estrutura%20de%20repeti%C3%A7%C3%A3o/03-RepetFor/src/repetfor/RepetFor.java).
* Variáveis compostas
    * Veja como manipular [vetores](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/08-vetores/01-Vetor/src/vetor/Vetor.java).
    * [Manipule um vetor](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/08-vetores/02-VetorSwing/dist) de forma prática usando a biblioteca Swing, insirindo e apagando valores em qualquer posição do vetor usando o mouse.
* Veja como usar [métodos](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/09-m%C3%A9todos%20(fun%C3%A7%C3%B5es)/01-Metodos/src/metodos).

# Programação orientada a objetos (POO) no Java
A programação orientada a objetos tem o objetivo de aproximar o mundo digital do mundo real.  

## A evolução dos métodos de programação
Quando os computadores começaram a surgir, na década de 40, a programação era feita em **baixo nível**. Quem fornecia as instruções para o cumputador realizar uma ação eram os próprios engenheiros que construiam os computadores, e as instruções eram binárias ou decimais. Esse tipo de programação é chamada linguagem de máquina. Dando sequência aos métodos de programação, surgil a linguagem de alto nível tornando a **programação linear**, os comandos eram mais compreensíveis para humanos, mas ainda sem rotinas internas.

A evolução da programação linear deu origem à **programação estruturada** no final da década de 60, permitindo que pequenos pedações da programação linear  fosse executados fora da ordem natural, dando origem aos sistemas. Com o crescimento dos sistemas a programação estruturada começou a falhar em sua metodologia, e surgiu a **programação modular**, permitindo o desenvolvimento de softwares que envolve dividir um programa em partes menores e independentes chamadas módulos. Cada módulo tem uma responsabilidade bem definida e interage com outros módulos através de interfaces claramente definidas. Essa abordagem promove a reutilização de código, a facilidade de manutenção e a escalabilidade do software. Apliando os conceitos da programação modular, surgiu a **programação orientada a objetos**.

**Alan Kay**, o pai da POO, que era formado em biologia e matemática desenvolveu a POO baseado na forma natural de como as coisas se relacionam no mundo real. Veja a baixo o seu postulado:
> O computador ideal deve funcionar como um
> organismo vivo, isso é, cada célula se relaciona
> com outras a fim de alcançar um objetivo, mas
> cada uma funciona de forma autônoma. As
> células poderiam também reagrupar-se para
> resolver um outro problema ou desempenhar
> outras funções.

## Vantagens da POO
Todo software orientado a objetos é:
* **confiável**: O isolamento entre as parte gera software seguro. Ao alterar uma parte, nenhuma outra é afetada.
* **Oportuno**: Ao dividir tudo em partes, várias delas podem ser desenvolvidas em paralelo.
*  **Manutenível**: Atualizar um software é mais fácil. Uma pequena modificação vai beneficiar todas as partes que usarem o objeto.
*  **Extensível**: O software não é estático. Ele deve crescer para permanecer útil.
*  **Reutilizável**: Podemos usar o objeto de um sistema que criamos em outro sistema fulturo.
*  **Natural**: Mai fácil de entender. Você se preocupa mais na funcionalidade do que nos detalhes de implementação.

## O que é um objeto
Objeto é uma coisa material ou abstrata que pode ser percebido pelos sentidos e descrita por meios de suas características, comportamento e estado atual. Em programação os objetos são representados por classes, responsável por classificar características, comportamento e estado atual de um objeto.

Por exemplo, uma objeto "Carro" pode ter atributos como cor, modelo, métodos como acelerar e frear, e o estado atual como ligado ou desligado. 

### As características
Todo objeto possui pelo menos uma característica que descreve oque esse objeto tem, em programação essas características são chamadas de **atributos**.

### O comportamento do objeto
Objetos possuem comportamento responsável em realiza uma ação, em programação esses comportamentos são nomeados de **métodos**.

### Estado do objeto
Em programação o estado atual do objeto é manipulado por métodos acessores e modificadores **getter** e **setter**. O getter diz qual é o estado atual de um determinado atributo do objeto, e o setter altera o estado desse atributo.

## Criando objetos
Para criar um objeto, antes é necessário planejar o seu molde. A partir desse molde é possível criar inúmeros objetos.
Esse molde é chamado de **classe** e possui todas as características e comportamento (os atributos e métodos) do objeto a ser criado.

O nome dado ao processo de criação de um objeto a parti de uma classe existente se chama **instanciar** um objeto. Com objeto instanciado (criado) é possível saber qual é o estado atual desse objeto e alterar esse estado, antes disso o estado do objeto é inexistem, pois ainda não foi instanciado.

Veja nesse [repositório](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/01-Objetos/src) como o código [Objetos.java](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/01-Objetos/src/objetos/Objetos.java) importa a classe [Fatorial.java](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/01-Objetos/src/classes/Fatorial.java) e instancia um objeto chamdado "f".

### Modificadores de acesso
Indicam o nível de acesso aos atributos e métodos de uma classe Java, permintindo encapsular um objeto:
* **Public**: Qualquer classe tem acesso aos atributos e métodos.
* **Protected**: Classe proprietária e suas sub-classes podem ter acesso aos atributos e métodos. Quando um atributo ou método é herdade de uma classe, onde este era protected, ele pode se tornar public na classe filha.
* **Private**: Apenas a classe proprietária do atributos ou método tem acesso a estes. Quando um atributo ou método é herdade de uma classe, onde este era private, ele pode se tornar protected ou public na classe filha. 

### Método construtor
É um método da classe usado para configurar os atributos e estado de um objeto no momento em que é instanciado, garantindo que o objeto esteja em um estado válido e utilizável. O método construtor tem o mesmo nome da classe em que está definido e pode, ou não, receber parâmetros para criar um objeto .

Caso não seja implementado um construtor em uma classe, o compilador fornece um construtor padrão sem parâmetros em qualquer classe que não inclui explicitamente um construtor, e os atributos seram inicializados da seguinte forma.
* Atributos numéricos receberam valor zero.
* Atributos alfanuméricos receberam valor vazio.
* Atributos lógicos receberam valor falso.

Veja nesse [código](https://github.com/marcospontoexe/Java/blob/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/01-Objetos/src/classes/Fatorial.java) como é definido o nível de acesso dos atributos e métodos, e como o método construtor configura os atributos e estado do objeto no momento do instanciamento.

[Execute uma aplicação usando Swing e POO](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/02-FatorialSwing/dist).

## Os pilares da POO
A programação orientada a objetos se baseia em quatro pilares fundamentais: abstração, encapsulamento, herança e polimorfismo, que permitem construir uma classe mais eficiente com três grandes vantagens:
1. Tonar mudanças invisíveis.
2. Facilitar a reutilização de código.
3. Reduzir os efeitos colaterais.

### 1° pilar: Abstração
A abstração é o processo de identificar as características essenciais de um objeto e ignorar os detalhes irrelevantes.

### 2° pilar: Encapsulamento
Oculta os detalhes de implementação do objeto através dos modificadores de acesso, permitindo que apenas as operações essenciais sejam acessadas de fora do objeto, criando uma interface bem definida entre o usuário e o código.

#### Interface
A interface é uma lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com o objeto de uma classe. **A interface tem apenas métodos abstratos públicos**. 

**Métodos abstratos** são aqueles métodos que não são implementados (desenvolvidos) na interface, são apenas previstos. 

[Clique nesse exemplo](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/03-encapsulamento/01-Interface/UsandoInterface/src/usandointerface) para ver uma implementação de inteface. Nesse exemplo o código principal "UsandoInterface.java" instancia um objeto ControleRemoto, da classe "ControleRemoto.java". A classe "ControleRemoto.java" implementa os métodos abstratos da classe "Controlador.java".

#### Relacionamento entre classes
O relacionamento entre classes descreve como as classes se interagem e se relacionam umas com as outras para alcançar um objetivo. Existem vários tipos de relacionamentos entre classes, incluindo associação, agregação, composição, herança e dependência.

1. **Associação**: É um relacionamento entre duas classes onde uma classe está relacionada com a outra de alguma forma, mas cada uma delas pode existir independentemente uma da outra. Por exemplo, uma classe "Professor" pode estar associada a uma classe "Disciplina", indicando que um professor leciona uma ou mais disciplinas.
2. **Agregação**: É um tipo de associação onde uma classe é composta por outras classes, mas as classes componentes podem existir independentemente da classe agregadora. Por exemplo, uma classe "Turma" pode ser composta por várias instâncias da classe "Aluno", mas os alunos podem existir sem a turma.

    * [Clique nesse exemplo](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/03-encapsulamento/02-relacionamento%20entre%20casses/main/src/main) para ver uma agregação entre classes. Na classe "Main.java" é instanciado 5 objetos da classe "Lutadores.java", e um objeto "fight" da classe "Luta.java", o objeto fight recebe dois objetos da classe Lutadores.java para realizar uma operação.

3. **Composição**: É similar à agregação, porém mais forte. Na composição, as classes componentes são partes essenciais da classe agregadora e não podem existir independentemente dela. Por exemplo, um carro é composto por motor, rodas, transmissão, etc. Se o carro for destruído, suas partes também serão.
4. **Herança**: É um relacionamento onde uma classe (sub-classe) herda os atributos e métodos de outra classe (superclasse). Isso permite a reutilização de código e estabelece uma relação "é um" entre as classes. Por exemplo, uma classe "Cachorro" pode herdar de uma classe "Animal", indicando que um cachorro é um tipo de animal.
5. **Dependência**: É um relacionamento onde uma classe depende de outra para realizar sua funcionalidade, mas não há uma relação estrutural entre elas. Por exemplo, uma classe "CarrinhoDeCompras" pode depender de uma classe "Produto" para adicionar produtos ao carrinho.


### 3° pilar: Herança 
A herança permite que uma classe herde características e comportamentos de outra classe, dependendo  do da configuração do modificador de acesso. Isso promove a reutilização de código e a criação de hierarquias de classes, onde as classes filhas (sub-classes) herdam características da classe mãe (classe progenitora, ou super classe) e podem adicionar suas próprias características exclusivas.

A supre classe também é conhecida como **classe raiz**, e as sub-classes que não tem  classes filhas são conhecidas como **classe folha**. As classes filhas são descendentes das classes mães, e as classes mães são ancestral das classes filhas.

* **Especialização**: É a criação de classes mais específicas a partir de classes mais gerais, quando uma classe mais específica (sub-classe) herda atributos e métodos de uma classe mais geral (superclasse).
* **Generalização**: Quando duas ou mais classes compartilham características em comum, é uma prática comum criar uma classe mais geral que represente essas características comuns. As sub-classes então herdam essas características da superclasse, o que promove a reutilização de código e a organização hierárquica das classes.

**Herança de implementação** também conhecida como herança pobre, acontece quando uma classe filha não tem nenhum atributos ou métodos próprio, apenas aqueles atributos e métodos que foram herdados da classe mãe.

**Herança para diferença** acontece quando uma classe filha tem seus próprios atributos ou métodos, mais aqueles atributos e métodos herdados da classe mãe.

* **Classe abstrata**: Não pode ser instanciada (não pode gerar objetos), e so pode servir como classe mãe.
* **Método abstrato**: Declarado mas não pode ser implementado na sua classe mãe, e deve ser sobrescrito na classe filha. Só pode existir dentro de uma Interface ou dentro de uma classe abstrata .
* **Classe final**: É obrigatóriamente uma classe folha, não pode ter classe filha.
* **Método final**: Não pode ser sobrescrito pelas suas sub-classes, ou seja não pode gerar uma especialização do método final, é obrigatoriamente herdado. Veja mais sobre **sobrescrição** no tópico de **polimorfismo**.

[Clique aqui](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/04-heran%C3%A7a/heranca/src/heranca) para ver um exemplo onde objetos de várias classes filhas da classe "Pessoa.java" são instanciados na classe "Heranca.java". 
    * A classe raiz (classe abstrata) "Pessoa.java" com os atributos "nome", "idade", "sexo" e um método final chamado "fazerAniversario()" que não pode ser sobrescrito nas classes filhas.
    * A classe "Aluno.java" herda os atributos e métodos da classe raiz através da herança para diferença, já que possui seus próprios atributos "matricula", "curso" e o método "pagarMensalidade()".
    * A classe "Professor.java", também implementada com herança para diferença, possui os atributos "especialidade", "salario" e o atributo "receberAumento()".
    * A classe "Visitante.java" é implementada através da herança de implementação, pois não tem nenhum atributos ou métodos além daqueles herdados pela classe mãe.
    * A classe "Tecnico.java" é uma especialização da classe "Aluno.java", ou seja Tecnico é a classe filha de Aluno, e possui o atributo "registroProfissional" e o método "praticar()". A classe Tecnico é uma classe final, isso significa que não é possível criar classes filhas da classe Tecnico
    * A classe "Bolsista.java" também é uma especialização da classe "Aluno.java" e também é uma classe final. Possui o atributo "bolsa", um método "renovarBolsa()", e mais um método "pagarMensalidade()" que é sobrescrito da classe Aluno. 

### 4° pilar: Polimorfismo 
Polimorfismo significa "muitas formas" e refere-se à capacidade de um objeto executar diferentes comportamentos dependendo do contexto. Os mais usados são o polimorfismo de **sobreposição** (ou override) e de **sobrecarga** de métodos. Existem outros tipos de polimorfismos, polimorfismo de inclusão e o paramétrico.

A **assinatura do método** depende da quantidade e tipo dos parâmetros de entrada. Quando os métodos tem a mesma quantidade e tipos de parâmetros de entrada, eles tem a mesma assinatura.

#### Sobreposição
Acontece quando um método é substituido de uma classe mãe em uma classe filha, possui o mesmo nome e usa a mesma assinatura. O método sobrescrito não fica na mesma classe, ele é herdado de outra classe.

Quando um método abstrato é herdado para uma classe filha, esse método deve ser desenvolvido na classe filha, já que esse método não é  implementado na classe mãe. 

[Veja nesse exemplo](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/05-polimorfismo/01-SobrePosicao/src/sobreposicao) como o **polimorfismo de sobreposição** é usado para sobrescrever métodos da classe mãe para que esses métodos tenham um comportamento diferente para cada classe.
A classe abstrata "Animal.java" é a classe raiz, e possui os atributos "nome", "sexo", "idade", e os **métodos abstratos** "locomover()", "alimentar()" e "emitirSom()". Esses métodos não podem ser desenvolvidos na classe raiz, e obrigatoriamente devem ser desenvolvidos nas classes filhas, sendo que cada classe filha tera um comportamento diferente para esses métodos sobrepostos. Não é obrigatório desenvolver os métodos abstratos nas classes filhas das filhas, caso os métodos abstratos não seja desenvolvidos, estas classes herdaram as características dos métodos de sua classe mãe, que nesse caso é a classe filha da classe raiz.

#### Sobrecarga
O polimorfismo de sobrecarga acontece quando os métodos possuem o mesmo nome, assinatura diferente, e estão na mesma classe. 

[Veja nesse exemplo](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/05-polimorfismo/02-SobreCarga/src/sobrecarga) a implementação de métodos usando o polimorfismo de sobrecarga.
Na casse "SobreCarga.java" é instanciado um objeto chamado "c", que pertence à classe "Cachorro.java". Na classe Cachorro existem quatro métodos chamados "reagir" porem todos tem uma assinatura diferente.
  
## Agregação entre classes
[Nesse exemplo](https://github.com/marcospontoexe/Java/tree/main/Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/10-objetos/06-agrega%C3%A7%C3%A3o%20entre%20classes/Desafio/src/desafio) a classe de agregação (Vizualizacao.java) tem a função de relacionar quem está assintindo, e o que está sendo assistido. "Quem está assistindo" é um objeto da classe "Avaliador.java" e representa uma pessoa, e "o que está sendo assistido" é um objeto da classe vídeo e representa um vídeo. Ao instanciar um objeto da classe de agregação, o atributo "total de vídeos assitido" da classe Avaliador é incrementado, significando que a pessoa assitiu mais um vídeo, alem disso, o atributo "Views" da classe vídeo também é incrementado, significando que aquele vídeo recebeu mais uma vizualização.
* A classe "Video.java" implementa os métodos abstratos "play", "pause", "like", da interface "AcoesVideo.java". 
* A classe "Avaliador.java" é uma classe filha da classe abstrata "Pessoa.java". O construtor da classe filha chama a classe mãe com os atributos do construtor da classe mãe.
* A classe "Vizualizacao.java" instancia um obejeto chamado "espectador" para fazer uma agregação entre as classes Vizualizacao e Avaliador. E também um objeto chamado "filme" para fazer uma agregação entre as classes Vizualizacao e Video. 


