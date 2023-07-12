# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T04CircularLinkedList - P02JosephusProblem

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

### Questão 01 

Considere pessoas dispostas em um círculo para serem executadas uma a uma até que apenas uma sobreviva. As `n` pessoas são colocadas em círculo nas posições de `0 `até `n-1`. Partindo da posição `0`, cada cada `m`-ésima vai sendo executada percorrendo o círculo até que apenas `1` pessoa sobreviva.

O josephus problem consiste em encontrar qual a posição inicial uma pessoa deve escolher para não ser executada.

Crie a classe `JosephusProblem` e implemente o método estático 
```java
Integer[] solve(int m, int n)
```
para retornar a ordem na qual as pessoas são executadas.

Por exemplo, 

    solve(2,7) 
deve retornar 

    {1, 3, 5, 0, 4, 2, 6}. 
Ou seja, a pessoa na posição `6` sobrevive.

Por exemplo

    solve(4,7) 
deve retornar 
    
    {3, 0, 5, 4, 6, 2, 1}. 
Ou seja, a pessoa na posição 1 sobrevive.

1. Utilize uma `CircularLinkedList`;
2. Os métodos `get`, `search`, e `delete` podem ajudar;
3. A criação de um método 
```java
CircularListNode getSuccessor(CircularListNode node)
```
na lista circular pode ajudar a evitar retornar a sentinel;
4. A criação de um método 
```java
get(CircularListNode currentNode, int index)
``` 
também pode ajudar.