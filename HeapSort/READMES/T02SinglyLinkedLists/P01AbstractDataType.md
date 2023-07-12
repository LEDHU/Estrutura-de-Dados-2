# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T02LinkedLists - P01AbstractDataType

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade
## Parte 1
### Questão 1
Crie uma classe `SinglyListNode` que contém os atributos `next` do tipo `SinglyListNode`, um atributo `value` do tipo `Integer`, um construtor para inicializar `value` e `next`, e os métodos `get` e `set` desses atributos. 

> Não utilize uma variável de instância `previous`!

### Questão 2
Crie uma classe de uma lista `unicamente` encadeada `SinglyLinkedList` que contenha a referência `head` do tipo `ListNode` para a cabeça da lista. 
> Não utilize uma variável de instância `tail`!

A classe deve conter os seguintes métodos: 

```java
1. boolean isEmpty()
```
 que retorna true quando a lista está vazia e false caso contrário;

```java
2. void addFirst(Integer value)
```
que adiciona o elemento value no início da lista;

```java
2. ListNode search(Integer value)
```
que retorna o nó `ListNode` cujo elemento procurado value se encontra ou `null` caso o elemento não esteja na lista;

```java
1. int size()
```

que retorna o tamanho da lista; 

### Questão 3
Implemente o método 
```java
boolean isOrdered(boolean ascending)
``` 
que retorna `true` caso os elementos estejam ordenados e `false` caso contrário. Os elementos podem estar ordenados ascendentemente quando `ascending` é `true` (i.e., 1,2,3,4) ou descendentemente quando `ascending` é `false` (ie., 4,3,2,1). 

### Questão 4
Implemente o método 

```java
void addLast(Integer value)
```
na classe `SinglyLinkedList` que adiciona o `value` no fim da lista.

### Questão 5
Implemente o método 

```java
void reverse()
```
na classe `SinglyLinkedList` que reverte a ordem dos items da lista. 
> Não crie uma nova instância da `SinglyLinkedList` ou `SinglyListNode`. Atualize apenas as referências `next` de cada `SinglyListNode` e head da `SinglyLinkedList`.

### Questão 6
Implemente o método 

```java
void delete(ListNode node)
```
na classe `SinglyLinkedList`.