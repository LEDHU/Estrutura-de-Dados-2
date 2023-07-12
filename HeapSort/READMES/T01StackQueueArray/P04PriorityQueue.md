# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T01StackQueueArray - P04PriorityQueue 

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade
### Questão 01

A estrutura de dados `Fila` pode ser utilizada para, entre outras aplicações, gerenciar a ordem em que processos são atendidos por um sistema operacional. 

Na estrutura de dados Fila, a prioridade é ordem de chegada. Ou seja, `Firt-In, First-Out`. Valores que entram primeiro, saem primeiro da fila.

Um tipo especial de fila é a `Fila de Prioridades`. Nesta fila, elementos com maior prioridade são retirados antes de elementos com prioridades menores. 

Implemente uma `PriorityQueue` em que a prioridade é o menor valor. Ou seja, os valores menores são retirados antes que os  valores menores. 

> Uma dica é alterar o método `enqueue` de uma `QueueArray` já implementada por você.
```java
public void enqueue(Integer value)
```

> Outra dica é modularizar o seu código e incluir, no método `enqueue`, chamada para os métodos `findLocation` e `openSpace`. 

O método 
```java
private int findLocation(Integer value)
```
encontra a posição correta em que o valor será colocado no array obedecendo sua prioridade. Ou seja, valores menores mais à esquerda.

O método

```java
private void openSpace(int location){
```
abre espaço na posição `location` do array para o valor ser colocado. Ou seja, translada os valores a partir da posição `location` para a direita.
