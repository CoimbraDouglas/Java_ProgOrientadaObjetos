# Programação Orientada a Objetos

**Professor:** Max Santiago

## Atividade 3

### Descrição

Esta atividade explora os conceitos de **herança, classes abstratas, sobrescrita de métodos e polimorfismo** em Java, além de **sobrecarga de métodos**.

Foram implementados dois conjuntos principais de classes:

1. **Sistema de Funcionários**

   * `Funcionario` (classe abstrata): contém atributos comuns (`nome`, `CPF`, `salarioBase`) e o método abstrato `calculaSalario()`.
   * `Gerente`: herda de `Funcionario`, redefinindo o cálculo do salário (triplo do salário base).
   * `Vendedor`: herda de `Funcionario`, recebendo comissão de 5% sobre o total de vendas.
   * `testeFuncionairo`: classe de teste que cria objetos de `Gerente` e `Vendedor`, exibindo os dados e salários.

2. **Relógio**

   * `Relogio`: permite calcular o tempo restante do dia a partir de horas e minutos informados. Implementa **sobrecarga de métodos** (`imprimirTempoRestanteDia`).
   * `testeRelogio`: classe de teste que instancia um objeto de `Relogio` e chama os métodos de cálculo de tempo.

### Estrutura de Arquivos

* `Funcionario.java`
* `Gerente.java`
* `Vendedor.java`
* `testeFuncionairo.java`
* `Relogio.java`
* `testeRelogio.java`

### Conceitos Trabalhados

* Herança
* Classes Abstratas
* Sobrescrita de Métodos (`@Override`)
* Polimorfismo
* Sobrecarga de Métodos
* Encapsulamento

### Exemplo de Saída (testeFuncionairo)

```
Nome: Paulo Henrique
CPF: 1428519885
Salário base: 1412.32
Salário total: 4236.96

Nome: Sergio Marques
CPF: 1448552036
Salário base: 1412.32
Salário total: 1412.32
```

### Exemplo de Saída (testeRelogio)

```
As horas restantes do dia são: 12
Faltam: 18 horas no dia e -2 minutos.
```
