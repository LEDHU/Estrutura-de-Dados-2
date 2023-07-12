# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T03DoublyLinkedList - P03ReverseGroupsK

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

### Questão 1
Adicione, na classe `DoublyLinkedList`, o método construtor

```java
public DoublyLinkedList(int[] values)
```
que, cria uma `DoublyLinkedList` a partir de um `array` de valores do tipo `int`. 


### Questão 2
Implemente, na classe `DoublyLinkedList`, o método  

```java
public int[] toArray()
```
que, retorna um `array` com os valores do cada `DoublyListNode` da `head` a `tail` da `DoublyLinkedList`



### Questão 3
Implemente, na classe `DoublyLinkedList`, o método  
```java
@Override
public String toString()
```

que retorna uma `String` no formato "[$v_1$, $v_2$, ... $v_n$]" em que 
- cada v`i` é um valor do `DoublyListNode` `i` da `DoublyLinkedList` e 
- se $v_i$ é valor do  `DoublyListNode` $n$, então $v_{i+1}$ é valor do  `DoublyListNode` $n.next$ 

> **Dica:** Reutilize seu método `toArray` implementado anteriormente
> **Dica:** Reutilize seu método `Arrays.toString` 

### Questão 3
Implemente, na classe `DoublyLinkedList`, o método  
```java
@Override
public void reverse(int kGroupSize)
```

que reverte cada `k` nós na `DoublyLinkedList`. Caso o número de nós não for múltiplo de `k`, então os nós remanescentes devem ser tratados como um grupo e devem ser revertidos.

> **Dica:** Repense como funciona o método `reverse` que reverte os nós de lista a partir de qualquer nó `start` da lista, incluindo a `head`, até qualquer nó `end` sucessor de `start` incluindo a `tail`. 

O método seria 
```java
public void reverse(DoublyListNode start, DoublyListNode end)
```

No caso especial em que toda a lista deve ser revertida, o `start` e o `end` são, respectivamente, a `head` e a `tail`.
```java
public void reverse() {
    reverse(this.head, this.tail);
}
