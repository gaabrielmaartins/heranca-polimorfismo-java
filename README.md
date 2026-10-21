# Funcionários da Empresa – Herança e Polimorfismo

---

# Descrição

Programa que cadastra funcionários de diferentes cargos e calcula a bonificação de fim de ano de cada um usando polimorfismo.

---

## Hierarquia de classes
Funcionario (abstract)
├── Programador
├── Estagiario
├── Gerente
└── Diretor

---

## Como Executar o Projeto via Console

1. **Acessar o diretório do projeto:**
   Navegue até a pasta onde se encontram os arquivos fonte (`.java`):
   ```bash
   cd caminho/para/o/projeto
   ```

2. **Compilar o código fonte:**
   Execute o compilador Java para gerar os arquivos `.class`:
   ```bash
   javac Departamento.java Cargo.java Funcionario.java TesteSistema.java
   ```

3. **Executar o programa:**
   Rode a classe principal que contém o método `main`:
   ```bash
   java TesteSistema
   ```
   
---

## Respostas
1. O que significa dizer que “todo Diretor é um Gerente” e que “todo Gerente é um
Funcionario”?
- Significa que a classe Diretor herda os atributos e métodos da classe Gerente e a classe Gerente herda todos os atributos e métodos da classe Funcionaio.

2. Qual é a diferença entre super(...) e super.getBonificacao()?
- super() faz referẽncia na chamada de um contrutor para obter os atributos da classe mãe enquanto super.getBonificacao() faz a referencia de um método da classe mãe.

3. O método registra() da classe ControleDeBonificacoes recebe um
Funcionario. Como ele sabe qual regra de bonificação usar? Isso é decidido na
compilação ou na execução?
- O Java identifica qual regra utilizar a partir do parâmetro passado, pois toda classe de funcionário possui uma regra de bonificação.

4. Se a empresa criar um novo cargo (por exemplo, Analista), será necessário alterar a
classe ControleDeBonificacoes? Por quê?
- Não será necessário. Pois a classe ControleDeBonificacoes recebe um funcionario (por parametro no método) e qualquer novo cargo que será criado, terá que heranças da classe mãe (Funcionario).

5. Por que não é possível instanciar uma classe abstrata? Então, para que ela serve?
- A classe obstrata serve para poder "obrigar" as classes filhas a utilizar um método criado na classe mãe.

---

## Tecnologias Utilizadas

- **Linguagem:** Java 21
- **IDE:** NetBeans
- **Compilador/Executor:** Java Development Kit (JDK 21)

---

## Informações do Aluno

- **Aluno(a):** Gabriel Martins
- **Turma:** 2º Período
- **Disciplina:** Programação Orientada a Objetos (POO)
- **Professor:** MSc Rodrigo de Lima Cunha
