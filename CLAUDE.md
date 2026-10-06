# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Sobre o repositório

Repositório de estudo de Java, com projetos feitos acompanhando os cursos de Java para Iniciantes e de POO do Curso em Vídeo (links no README). Tudo está em português do Brasil: README, anotações, comentários e identificadores. Não há uma aplicação única nem build na raiz: são cerca de 33 projetos NetBeans (Ant) independentes, cada um com seu próprio `main`. Não há testes (os diretórios `test/` estão vazios), linter nem CI.

O README vai servir de base para um portfólio, então deve continuar apresentável.

## Estrutura

- `Material didático/Curso em vídeo/NN-tópico/NN-Projeto/`: cada pasta de projeto tem `build.xml`, `nbproject/`, `src/` e, às vezes, `dist/<Projeto>.jar`. A classe principal está em `main.class`, no arquivo `nbproject/project.properties`.
  - Projetos de console usam o pacote padrão do NetBeans (nome do projeto em minúsculas, ex.: `variaveis.Variaveis`).
  - Projetos Swing usam, em geral, o pacote `classes`, com um `JFrame` chamado `Tela*` (ex.: `classes.TelaGenio`).
- Exceções ao padrão NetBeans:
  - `08-vetores/03-Arraylist/arrayList/` é um projeto IntelliJ (`.iml`, pacote padrão).
  - `Material didático/manipulação da dados/` tem arquivos `.java` soltos, sem projeto e no pacote padrão.
- `Material didático/Curso em vídeo/documentação/` é uma cópia local do javadoc da API do JDK. É grande e não é código do projeto: exclua-a das buscas e não a edite.
- `ANOTACOES.md` reúne as anotações teóricas, com links para os exemplos. As imagens dele ficam em `Material didático/imagens/` e `Material didático/Curso em vídeo/Imagens/`.

## Compilar e executar

Os projetos declaram `javac.source=18` (o JavaFX `OlaMundo` declara 1.8) e compilam com JDKs mais novos (testado com o JDK 25). Sem o Ant, compile direto com `javac`.

Os diretórios `build/` e `dist/` estão versionados. Para testar uma compilação sem alterar arquivos rastreados, compile para uma pasta fora do repositório:

```powershell
cd "Material didático\Curso em vídeo\05-operadores\01-BibMath"
$out = "$env:TEMP\java-classes"
javac -encoding UTF-8 -d $out (Get-ChildItem -Recurse src -Filter *.java).FullName
java -cp $out bibmath.BibMath
```

- Executar um jar já gerado: `java -jar "dist\Genio.jar"`.
- Com Ant/NetBeans: `ant clean`, `ant jar` (gera `dist/`) e `ant run`, dentro da pasta do projeto.
- `05-operadores/04-Genio` depende de `org.netbeans.lib.awtextra.AbsoluteLayout`: adicione `dist/lib/AbsoluteLayout.jar` ao classpath.
- `03-pacotes(biblioteca)/05-JavaFX/OlaMundo` usa JavaFX, que não vem com o JDK desde o Java 11. Compilar ou executar exige o JavaFX SDK (OpenJFX). A classe da aplicação é `olamundo.OlaMundo`; o `com.javafx.main.Main` citado em `project.properties` é o launcher antigo do empacotador. Para executar o `dist/OlaMundo.jar`: `java --module-path <javafx-sdk>/lib --add-modules javafx.controls,javafx.fxml -jar OlaMundo.jar` (testado com JDK 25 e JavaFX SDK 25.0.4 no Windows 10). Não acrescente `--enable-native-access=javafx.graphics` para esconder os avisos: nesse teste, a aplicação fechou logo ao abrir (código 0, sem erro).

## Convenções

- **As GUIs Swing são geradas pelo GUI Builder do NetBeans.** Cada `Tela*.java` tem um `.form` ao lado. Não edite o código entre `//GEN-BEGIN:` e `//GEN-END:`, porque o NetBeans o regenera a partir do `.form`. Os corpos dos handlers de eventos (entre `//GEN-FIRST:` e `//GEN-LAST:`) podem ser editados.
- **O README é a vitrine do repositório.** Traz o catálogo "Projetos desenvolvidos" (tabelas de aplicações gráficas, fundamentos e POO) e termina com um link para o `ANOTACOES.md`. Os links são URLs absolutos do GitHub (`https://github.com/marcospontoexe/Java/blob/main/...` ou `/tree/main/...`), com espaços e acentos codificados e parênteses literais (ex.: `Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/03-pacotes(biblioteca)/`). Ao adicionar um projeto, acrescente uma linha na tabela certa do catálogo e, se houver teoria nova, escreva-a na seção correspondente do `ANOTACOES.md`. As aplicações gráficas apontam para o `.jar` em `dist/`, então mantenha o jar atualizado quando alterar uma delas.
- Os caminhos têm espaços, acentos e parênteses (`09-métodos (funções)`, `03-pacotes(biblioteca)`): use sempre aspas.
- Os fontes estão em UTF-8 (`source.encoding=UTF-8`). No Windows PowerShell 5.1, `Get-Content` sem `-Encoding UTF8` mostra os acentos corrompidos; o arquivo em si está correto.
- `CONTEXTO.md` e `rascunho.md` são arquivos locais de trabalho e estão no `.gitignore`. Não os adicione de volta ao git.
