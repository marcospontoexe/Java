# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Natureza do repositório

Repositório de estudo de Java (projetos feitos a acompanhar os cursos de Java para Iniciantes e de POO do Curso em Vídeo, com links no README), todo em português: README, comentários, identificadores. Não existe uma aplicação única nem build na raiz. São ~33 projetos NetBeans (Ant) independentes, cada um com o seu próprio `main`. Não há testes (os diretórios `test/` estão vazios), linter, CI nem `.gitignore`.

## Estrutura

- `Material didático/Curso em vídeo/NN-tópico/NN-Projeto/`: cada pasta de projeto tem `build.xml`, `nbproject/`, `src/` e, às vezes, `dist/<Projeto>.jar`. A classe principal está em `main.class` de `nbproject/project.properties`.
  - Projetos de consola usam o pacote padrão do NetBeans (nome do projeto em minúsculas, ex.: `variaveis.Variaveis`).
  - Projetos Swing usam, em geral, o pacote `classes` com um `JFrame` chamado `Tela*` (ex.: `classes.TelaGenio`).
- Exceções ao padrão NetBeans:
  - `08-vetores/03-Arraylist/arrayList/` é um projeto IntelliJ (`.iml`, pacote padrão).
  - `Material didático/manipulação da dados/` tem ficheiros `.java` soltos, sem projeto e no pacote padrão.
- `Material didático/Curso em vídeo/documentação/` é uma cópia local do javadoc da API do JDK. É grande e não é código do projeto: exclua-a das buscas e não a edite.
- Imagens usadas no `ANOTACOES.md`: `Material didático/imagens/` e `Material didático/Curso em vídeo/Imagens/`.

## Compilar e executar

O ambiente tem o JDK 25 (`java`/`javac` no PATH). **O `ant` e o `git` não estão no PATH do PowerShell.** Os projetos declaram `javac.source=18` (o JavaFX `OlaMundo` declara 1.8).

Os diretórios `build/` e `dist/` estão versionados. Para testar uma compilação sem sujar o git, compile para o scratchpad:

```powershell
cd "Material didático\Curso em vídeo\04-Manipulação de dados\01-Variaveis"
$out = "<scratchpad>\classes"
javac -encoding UTF-8 -d $out (Get-ChildItem -Recurse src -Filter *.java).FullName
java -cp $out variaveis.Variaveis
```

- Executar um jar já gerado: `java -jar "dist\Genio.jar"`.
- Com Ant/NetBeans disponível: `ant clean`, `ant jar` (gera `dist/`) e `ant run`, dentro da pasta do projeto.
- `05-operadores/04-Genio` depende de `org.netbeans.lib.awtextra.AbsoluteLayout`. Adicione `dist/lib/AbsoluteLayout.jar` ao classpath.
- `03-pacotes(biblioteca)/05-JavaFX/OlaMundo` importa `javafx.*`, que não vem com o JDK moderno. Compilá-lo exige o OpenJFX. A classe da aplicação é `olamundo.OlaMundo`; `com.javafx.main.Main` é o launcher antigo do empacotador. Para executar o `dist/OlaMundo.jar` no JDK 25: `java --module-path <javafx-sdk>/lib --add-modules javafx.controls,javafx.fxml -jar OlaMundo.jar` (testado com o JavaFX SDK 25.0.4). **Não** acrescente `--enable-native-access=javafx.graphics` para calar os avisos: nesta máquina, com essa opção, a aplicação fecha logo ao abrir (código 0, sem erro).

## Convenções importantes

- **GUIs Swing são geradas pelo GUI Builder do NetBeans.** Cada `Tela*.java` tem um `.form` ao lado. Não edite o código entre `//GEN-BEGIN:` e `//GEN-END:`, porque o NetBeans o regenera a partir do `.form`. Os corpos dos handlers de eventos (entre `//GEN-FIRST:` e `//GEN-LAST:`) podem ser editados.
- **O README.md é a vitrine do repositório e vai servir de base para um portfólio, que o utilizador vai criar mais tarde.** Traz o catálogo "Projetos desenvolvidos" (tabelas de aplicações gráficas, fundamentos e POO) e termina com um link para o `ANOTACOES.md`, onde ficam as anotações teóricas. Os dois estão em português do Brasil. Os links são URLs absolutos do GitHub (`https://github.com/marcospontoexe/Java/blob/main/...` ou `/tree/main/...`), com espaços e acentos codificados e parênteses literais (ex.: `Material%20did%C3%A1tico/Curso%20em%20v%C3%ADdeo/03-pacotes(biblioteca)/`). Ao adicionar um projeto, acrescente uma linha na tabela certa do catálogo e, se houver teoria nova, escreva-a na secção correspondente do `ANOTACOES.md`. As aplicações gráficas apontam para o `.jar` em `dist/`, por isso mantenha o jar atualizado quando alterar uma delas.
- Os caminhos têm espaços, acentos e parênteses (`09-métodos (funções)`, `03-pacotes(biblioteca)`): use sempre aspas.
- As fontes estão em UTF-8 (`source.encoding=UTF-8`). No PowerShell 5.1, `Get-Content` sem `-Encoding UTF8` mostra os acentos corrompidos; o ficheiro em si está correto.

## Regra: Persistência de Contexto (Handoff entre sessões)

### Objetivo

Garantir que nenhum trabalho se perca quando a sessão atual se tornar demasiado longa. O agente deve gravar todo o estado da sessão num ficheiro de handoff, de forma que **qualquer outro chat consiga retomar exatamente de onde parou**, com o mesmo contexto.

---

### Gatilho

Execute o procedimento de salvamento abaixo **antes de continuar qualquer tarefa** sempre que uma das seguintes condições for atingida:
1. A conversa prolongar-se por muitas interações (aproximando-se do limite prático da janela de contexto).
2. Uma funcionalidade ou milestone importante for concluída.
3. O utilizador disser explicitamente: `salvar contexto`, `handoff` ou `checkpoint`.

---

### Procedimento de salvamento

1. **Termine** a tarefa atual.
2. Crie ou atualize o arquivo **`CONTEXTO.md`** na raiz do projeto.
   - Se já existir, **atualize** as seções em vez de duplicar (mantenha o histórico relevante, remova o que já foi superado).
   - Sempre atualize o campo de data/hora e o número da sessão.
3. Preencha **todas** as seções do template abaixo. Não deixe seções vazias — escreva "nenhum" quando não houver conteúdo.
4. Confirme ao usuário que o contexto foi salvo e informe o caminho do arquivo.
5. **Gestão do CONTEXTO.md:**  Mantenha o CONTEXTO.md enxuto. Ele segue o template abaixo, mas cada seção deve ter só o resumo. Quando um tópico precisar de mais detalhe (uma decisão longa, um passo a passo, etc.), escreva-o num ficheiro em DOCS/ na raiz do projeto e coloque no CONTEXTO.md apenas o link para ele. O objetivo é não sobrecarregar a janela de contexto ao ler o CONTEXTO.md. Se precisar de mais informações sobre um tópico, abra o ficheiro específico em DOCS/.

---

### Template do `CONTEXTO.md`

```markdown
# CONTEXTO DA SESSÃO

- **Última atualização:** AAAA-MM-DD HH:MM
- **Sessão nº:** N
- **Status geral:** (em andamento | bloqueado | pronto para revisão)

## 1. Objetivo da tarefa
Descrição em 1–3 frases do que estamos tentando alcançar (o "porquê").

## 2. Já feito ✅
- Itens concluídos, com o(s) arquivo(s) afetado(s).
- Ex.: "Implementado endpoint POST /login em `src/auth.py`"

## 3. Em andamento 🔧
- O que estava sendo feito no momento do checkpoint.
- Em qual arquivo/linha parei e qual era o próximo passo imediato.

## 4. Próximos passos (planejado) 📋
- Lista ordenada do que falta fazer.
- Quanto mais específico, melhor (arquivo, função, comportamento esperado).

## 5. Decisões e raciocínio 🧠
- Escolhas técnicas feitas e o porquê.
- Alternativas descartadas (para evitar refazer a análise).
- Suposições assumidas.

## 6. Estado do projeto / ambiente
- Arquivos-chave e o papel de cada um.
- Branch git atual, alterações não commitadas, migrations pendentes, etc.
- Variáveis de ambiente ou dependências relevantes.

## 7. Bloqueios e pendências ⚠️
- Erros não resolvidos, dúvidas para o usuário, decisões aguardando aprovação.

## 8. Comandos úteis
- Comandos para rodar/testar/buildar o projeto.
- Ex.: `npm run dev`, `pytest tests/`, etc.

## 9. Como retomar
Instrução direta para o próximo chat: "Leia este arquivo e continue a partir
da seção 3 / passo X."
```

---

### Como retomar em um novo chat

No início de qualquer nova sessão, o agente deve:

1. Verificar se existe o ficheiro `CONTEXTO.md` na raiz do projeto .
2. Se existir, **lê-lo por completo antes de qualquer outra ação**.
3. Resumir ao utilizador em 2–3 linhas onde o trabalho parou e qual é o próximo passo, e então continuar.

> Comando sugerido para o utilizador iniciar um novo chat:
> **"Leia o `CONTEXTO.md` e continue de onde a sessão anterior parou."**

---

### Boas práticas

- **Escreva para um estranho:** o próximo chat não tem memória nenhuma; seja explícito.
- **Caminhos absolutos ou relativos à raiz**, nunca referências vagas ("aquele arquivo").
- **Não salve segredos** (tokens, senhas, chaves) no `CLAUDE.md` e `CONTEXTO.md`.
- **Um arquivo por projeto:** mantenha `CONTEXTO.md` enxuto; arquive versões antigas em `CONTEXTO.arquivo.md` se necessário.
- **Commit opcional:** se o usuário usar git, ofereça commitar o `CONTEXTO.md` para que ele persista entre máquinas.
- **Feedback de alterações:** Caso algum ficheiro seja alterado durante a sessão, informe sempre qual o ficheiro e o que foi alterado no final de cada mensagem.
- **referenciar diretórios e arquivos atraves de links:** Sempre que se referir a um diretório ou arquivo local, use link e não backticks.
