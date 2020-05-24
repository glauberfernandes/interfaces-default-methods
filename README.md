# Interfaces
## Default Methods(defender methods)

* A partir do Java 8, interfaces podem conter métodos concretos.

* A intenção básica é prover implementação padrão para métodos, de modo
a evitar:

  1.repetição de implementação em toda classe que implemente a interface

  2.a necessidade de se criar classes abstratas para prover reuso da implementação

* **Outras vantagens:**

  * Manter a retrocompatibilidade com sistemas existentes
  * Permitir que "interfaces funcionais" (que devem conter apenas um método)
possam prover outras operações padrão reutilizáveis

### Problema exemplo

Fazer um programa para ler uma quantia e a duração em meses de um
empréstimo. 
Informar o valor a ser pago depois de decorrido o prazo do
empréstimo, conforme regras de juros do Brasil. 
A regra de cálculo de juros do Brasil é juro composto padrão de 2% ao mês.

### Diagrama de classe

![DefaultMethods](https://github.com/glauberfernandes/interfaces-default-methods/blob/master/DefaultMethods.PNG)

### Considerações importantes

* **Sim:** agora as interfaces podem prover reuso

* **Sim:** agora temos uma forma de herança múltipla
  * Mas o compilador reclama se houver mais de um método com a mesma
assinatura, obrigando a sobrescreve-lo

* **Interfaces ainda são bem diferentes de classes abstratas.** Interfaces
não possuem recursos tais como construtores e atributos.

***fonte:** curso de Java completo - Prof. Nélio Alves(udemy)*
