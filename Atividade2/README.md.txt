# 📘 Atividade 2 - Programação Orientada a Objetos

**Disciplina:** Programação Orientada a Objetos
**Professor:** Max Santiago
**Instituição:** Newton Paiva
**Curso:** Análise e Desenvolvimento de Sistemas

---

## 📂 Estrutura da Pasta

A pasta **Atividade 2** contém **3 arquivos principais**, todos implementados em **Java**:

1. **tipoEmprestimo.java**

   * Classe base responsável por calcular multa de empréstimos.
   * Possui atributos como `taxaMultaPorDia` e método `calcularMulta(int diasAtraso)`.
   * Subclasses:

     * **EmprestimoCurtoPrazo** – define multa de R\$ 1,00 por dia de atraso.
     * **EmprestimoLongoPrazo** – define multa de R\$ 0,50 por dia de atraso.

2. **Material.java**

   * Classe abstrata que modela materiais da biblioteca.
   * Atributos: `titulo`, `anoPublicacao`.
   * Subclasses:

     * **Livro** – representa livros.
     * **Revista** – representa revistas.

3. **Biblioteca.java**

   * Classe principal com o método `main`.
   * Cria instâncias de `Livro` e `Revista`.
   * Aplica regras de empréstimos (curto e longo prazo).
   * Calcula e exibe no console as multas por atraso de cada material.

---

## 🎯 Objetivo da Atividade

* Trabalhar conceitos de **herança** e **polimorfismo** em POO.
* Implementar **classes abstratas** e suas especializações.
* Criar **hierarquia de classes** para modelar materiais de biblioteca e seus empréstimos.
* Simular o cálculo de multas para diferentes prazos de devolução.

---

## 💻 Tecnologias Utilizadas

* **Linguagem:** Java
* **Versão mínima:** Java 8+
* **IDE recomendada:** IntelliJ IDEA / Eclipse / VS Code

---

## 🚀 Execução

Ao executar o programa:

* Um livro e uma revista são cadastrados como materiais.
* Cada material sofre um atraso definido no código (`3 dias` para o livro, `5 dias` para a revista).
* As multas são calculadas com base no tipo de empréstimo (curto ou longo prazo).
* O resultado é exibido no console.

---

## 📌 Resultado Esperado (exemplo simplificado)

```
Multa por atraso do livro 'O Senhor dos Anéis': R$ 3.0
Multa por atraso da revista 'Veja': R$ 2.5
```

---

Essa atividade reforça a aplicação de **herança, polimorfismo e classes abstratas** para resolver problemas práticos no paradigma de orientação a objetos.
