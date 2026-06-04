# Anotações de Aprendizado - Sistema RH

Arquivo pessoal de estudo que documenta os conceitos aprendidos
na construção do sistema, com linguagem simples e referência de
onde cada conceito aparece no projeto.

------

## Lógica de Programação

**O que é:** Disciplina que ajuda a entender a transformar problemas do mundo real em soluções ordenadas
por códigos seguindo processos lógicos e precisos com a finalidade de trazer resultados previsível.

**Os quatro pilares:**
> Sequência: Instruções executadas em ordem, uma após a outra.
> Condição: Decisões baseadas em situação (SE -> ENTÃO -> SENÃO).
> Repetição: Execultar a mesma operação para múltiplos elementos.
> Abstração: Agrupar instruções em funções com nome e propósito claro.

**Onde encontrar no projeto:** Toda a lógica do `calcularBonus` em `Funcionario.java` foi construída
primeiro em pseudocódigo, depois traduzida para java.

**Palavras-chaves utilizada:** "Lógica de Programação", "Raciocínio Lógico", "Raciocínio algorítmico",
"Resolução de Problemas".

------

## Tipos de Dados e Variáveis

**O que é:** Em Java, toda variável é determinado um tipo que define o valor que ela pode guardar.
Java é estaticamente tipado, o tipo é definido antes de o programa rodar.

**Tipos usados no projeto:** 
> `String` - Texto (nomeCompleto, cpf, departamento, data).
> `double` - Número decimal (salario, notaDeAvaliacao).
> `int` - Número inteiro (quantidadeDeDependente, anosDeEmpresa).
> `boolean` - Verdadeiro ou falso (ativoNaEmpresa).

**Decisões importantes:** 
> CPF é String, não número - Identificadores nunca são númericos.
> Salário é double, mas em sistemas financeiros reais usa-se BigDecimal.
> Data de admissão é String por enquanto - Na fase 2 vira LocalDate.

**Onde encontrar no projeto:** Atributos da classe `Funcionario.java`.

**palavras-chaves utilizada:** "Tipos Primitivos", "Tipagem Estática".

------

## OOP - Orientação a Objetos

**O que é:** Paradigma que traz organização para o código em classes que representam entidades do mundo real.
Cada classe tem dados (atributos) e comportamentos (métodos).

**Conceitos praticados:**

### Classe e Objeto
> Classe é o molde. Objeto é a instância criada a partir do molde.
> `Funcionario` é a classe. `joao`, `maria`, `carlos` são objetos.

### Encapsulamento
> Atributos declarados como `private` - Não acessíveis diretamente de fora.
> Acesso controlado via métodos públicos (getters).
> Motivo: Proteger o objeto de estados inválidos, não apenas sigilo.

### Construtor
> Bloco com o mesmo nome da classe que define o contrato de criação.
> Um `Funcionario` não pode existir sem nome, cpf, salário e nota.
> Garante que objetos inválidos nunca existam no sistema.

### this
> Referência ao próprio objeto sendo criado.
> Diferencia a variável interna (`this.salario`) do parâmetro (`salario`).

### Getters
> Métodos públicos que expõem atributos privados para leitura.
> Convenção: `get` + nome do atributo com primeira letra maiúscula.
> Exemplo: Atributo `salarioMensal` -> getter `getSalarioMensal()`.

### toString e @Override
> `toString()` define como o objeto se descreve como texto.
> `@Override` indica que estamos substituindo o comportamento padrão
herdado da classe `Object` - Classe mãe de todo objeto Java.
> Usado em logs e depuração para exibir dados legíveis.

**Onde encontrar no projeto:** `Funcionario.java` completo.

**Palavras-chaves utilizada:** "OOP", "Orientação a Objetos", "Encapsulamento", "Herança", "Polimorfismo".

------

## Exception Handling - Tratamento de Exceções

**O que é:** Mecanismo para sinalizar situações inválidas de forma explícita, impedindo que o programa
continue com dados corrompidos.

**Conceitos praticados:**

### IllegalArgumentException
> Exceção usada quando um argumento inválido é passado para um método.
> Já existe no Java. Não precisa criar, só lançar.

### throw
> Palavra-chave que lança a exceção e para a execução imediatamente.
> O objeto nunca é criado se uma validação falhar.

### Stack trace
> Rastro que o Java exibe quando uma exceção ocorre.
> Mostra qual exceção foi, a mensagem, e o caminho exato no código.
> Em produção é a primeira ferramenta de investigação de bugs.

### Invariante de Classe
> Condição que é sempre verdadeira para qualquer instância da classe.
> Garantida pelo construtor: Todo `Funcionario` que existe é válido.

### null vs String vazia
> `null` - Ausência total de valor. A variável não aponta para nada.
> `""` - String existe mas não tem caracteres.
> Verificação correta: `nome == null || nome.isEmpty()`.

**Onde encontrar no projeto:** Construtor de `Funcionario.java`.

**Palavras-chaves utilizada:** "Exception Handling", "Tratamento de Exceções", "Validação de Dados".

------

## Collections - Coleções

**O que é:** Estruturas que armazenam grupos de objetos. Resolve o problema de trabalhar com quantidade
variável de elementos sem repetir código.

**Conceitos praticados:**

### List e ArrayList
> `List<Funcionario>` - Interface que define o contrato da lista.
> `ArrayList` - Implementação concreta da list.
> Só aceita o tipo declarado entre `<>` - Isso é Generics.
> Indexada a partir de zero. Ordenada por ordem de inserção.

### Generics
> O `<Funcionario>` entre sinais de maior e menor.
> Garante em tempo de compilação que só o tipo correto entra na lista.
> Evita uma categoria inteira de erros antes de rodar o programa.

### Métodos usados
> `.add()` - Adiciona um elemento na lista.
> `get(0)` - Acessa o elemento na posição zero.
> `.equals()` - Compara conteúdo de Strings (nunca usar `==` para String).

**Onde encontrar no projeto:** `Main.java` - Lista de funcionários.

**Palavras-chaves utilizada:** "Collections", "List", "ArrayList", "Estruturas de Dados".

------

## Algoritmos com Coleções

**O que é:** Lógica para acessar listas e extrair informações. Base de rankings, relatórios e
dashboards em qualquer sistema.

**Algoritmos praticados:**

### Busca por máximo
> Assume o primeiro elemento como maior.
> Itera a lista comparando cada elemento com o maior atual.
> Atualiza o maior quando encontra valor superior.
> Usado em: `encontrarMaiorSalario()` em `Main.java`.

### Acumulador
> Começa com zero.
> A cada iteração soma o valor do elemento ao total.
> Usado em: `calcularTotalFolha()` em `Main.java`.

### Filtro
> Cria uma nova lista vazia.
> Itera a lista original e adiciona só os elementos que passam na condição.
> Usado em: `filtrarPorDepartamento()` em `Main.java`.

**Palavras-chaves utilizada:** "Algoritmos", "Manipulação de Coleções", "Lógica de Negócio".

------

## Loops - Repetição

**O que é:** Estrutura que executar um bloco de código múltiplas vezes sem repetir o código.

**Loop praticado:**

### For-each (Enhanced for)
> Percorre cada elemento de uma coleção automaticamente.
> A cada iteração, a variável representa um elemento diferente.
> Mais legível que o for tradicional para percorrer coleções.
> Sintaxe: `for (tipo variavel : colecao)`.

**Perigo do loop infinito:** Quando a condição de parada nunca se torna falsa. O programa trava.
Evitado com condições bem definidas.

**Palavras-chaves utilizada:** "Loops", "Iteração", "For-each".

------

## Guard Clauses

**O que é:** Retornos antecipados do início de um método que eliminam casos inválidos antes
do fluxo principal.

**Por que usar:**
> Evita aninhamento excessivo de condições (Pyramid of Doom).
> Código fica plano e legível de cima para baixo.
> Casos de bloqueio ficam explícitos e isolados.

**Diferença do else if:**
> `else if` - Caminhos alternativos do fluxo principal.
> Guard Clause - Eliminação de casos inválidos antes do fluxo.

**Onde encontrar no projeto:** Método `calcularBonus()` em `Funcionario.java`.

------

## Git e Versionamento

**O que é:** Sistema de controle de versão que registra o histórico de mudança do código.

**Conceitos praticados:**

### Comandos usados
> `git init` - Inicializa repositório local.
> `git add .` - Move arquivos para o stage.
> `git commit -m "mensagem"` - registra snapshot no histórico.
> `git push` - Envia commits para o repositório remoto.
> `git status` - Mostra estado atual dos arquivos.

### Conventional Commits
> Padrão de mensagem: `tipo(escopo): descrição`
> `feat` — Nova funcionalidade
> `fix` — Correção de bug
> `refactor` — Melhoria sem mudar comportamento externo
> `docs` — Documentação
> `chore` — Configuração e build

### .gitignore
> Arquivo que lista o que o Git deve ignorar.
> `.idea/` — Pasta de configurações do IntelliJ não vai para o repo.

### Por que importa para recrutadores
> Histórico de commits mostra evolução e disciplina.
> Mensagens profissionais mostram que você trabalha em equipe.
> Repositório público é portfólio vivo.

**Palavras-chaves utilizada:** "Git", "GitHub", "versionamento",
"controle de versão".

---

## Maven — Gerenciamento de Build

**O que é:** Ferramenta que gerencia dependências e o processo
de build do projeto Java.

**Conceitos praticados:**
> `pom.xml` — Contrato do projeto. Define identidade e dependências.
> `groupId` — Identificador da organização (domínio invertido)
> `artifactId` — Nome do projeto
> `version` — Versão atual

**Estrutura padrão Maven:**
> `src/main/java` — Código de produção
> `src/test/java` — Código de testes
> Essa estrutura é reconhecida por toda ferramenta Java no mercado.

**Palavras-chaves utilizada:** "Maven", "Gradle", "Build Tools".

---

## Javadoc

**O que é:** Padrão de documentação Java para métodos e classes
públicas. Aparece como tooltip no IntelliJ quando alguém usa
o método.

**Tags usadas:**
> `@param` — Documenta um parâmetro do método
> `@return` — Documenta o que o método retorna

**Regra:** Javadoc documenta o contrato — O que o método faz,
o que recebe e o que retorna. Não é lugar para anotações de estudo.

**Palavras-chaves utilizada:** "Documentação de Código", "Clean Code".