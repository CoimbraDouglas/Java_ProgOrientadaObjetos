# 📘 Atividade 5 - Programação Orientada a Objetos

**Disciplina:** Programação Orientada a Objetos
**Professor:** Max Santiago
**Instituição:** Newton Paiva
**Curso:** Análise e Desenvolvimento de Sistemas

---

## 📂 Estrutura da Pasta

A pasta **Atividade 5** contém **2 arquivos Java**, ambos voltados para a prática de criação de classes e encapsulamento de dados em POO.

### 1. **Aluno1.java**

* Classe que modela um aluno simples.
* Atributos privados:

  * `nome` (String)
  * `idade` (int)
  * `matricula` (String)
* Construtor: recebe os três atributos.
* Métodos *getters* e *setters* para manipular os valores de forma controlada.

👉 Essa classe tem como objetivo exercitar o **uso de construtores e encapsulamento** em atributos básicos.

---

### 2. **Aluno.java**

* Classe mais detalhada que representa um aluno com notas.
* Atributos:

  * Públicos: `nome`, `matricula`, `nota_mat`, `nota_bio`
  * Privado: `CPF`
* Construtor: inicializa nome, matrícula e notas.
* Métodos principais:

  * `setCPF(valor)` e `getCPF()` → manipulação controlada do CPF.
  * `calcularMedia()` → retorna a média entre `nota_mat` e `nota_bio`.
  * `exibirInformacao()` → imprime no console a média calculada.

👉 Essa classe amplia os conceitos, introduzindo **operações com atributos numéricos** e a exibição formatada de informações.

---

## 🎯 Objetivo da Atividade

* Reforçar o conceito de **encapsulamento**.
* Implementar **construtores** e boas práticas no uso de atributos.
* Criar **métodos para cálculo e exibição de dados**.
* Comparar duas abordagens diferentes de modelagem de classes.

---

## 💻 Tecnologias Utilizadas

* **Linguagem:** Java
* **Versão mínima:** Java 8+
* **IDE recomendada:** IntelliJ IDEA / Eclipse / VS Code

---

## 📌 Observações

* O código contém **alguns pontos a corrigir**, como a inicialização de variáveis no construtor e duplicação de métodos (`calcularMedia` e `exibirInformacao`).
* Apesar disso, o exercício cumpre seu papel de **fixar conceitos fundamentais da Programação Orientada a Objetos**.

---

Essa atividade é um passo importante no aprendizado de POO, pois mostra como evoluir de uma classe simples para uma classe que contém **operações lógicas e atributos privados mais sensíveis**.
