# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T03DoublyLinkedList - P02AddTwoNumbersII

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade
### Questão 1

Crie uma nova classe `DoublyListNode` e, além dos atributos `value` e `next`, adicione o atributo `previous` do tipo `DoublyListNode`. Crie um construtor para inicializar os 3 atributos, e os métodos `get` and `set` dos atributos.

### Questão 2

Crie uma outra classe `DoublyLinkedList` que, além do atributo `head` para a cabeça da lista, também contenha a referência `tail` para a calda a lista.s

### Questão 3

Considerando que a `DoublyLinkedList` também tem um atributo `tail` e que o `DoublyNodeList` agora possui o novo atributo `previous`, implemente os seguintes métodos:

1. método que retorna `true` quando a lista está vazia e `false` caso contrário;
```java
boolean isEmpty() 
```

2. método que retorna o tamanho da lista; 
```java
int size()
```

3. método que adiciona o elemento elem no início da lista;
```java
void addFirst(Integer value)
```

4. método que que retorna o nó `ListNode` cujo elemento procurado `value` esteja na lista ou `null` caso o elemento não esteja na lista;

```java
DoublyListNode search(Integer value)
```

5. método que adiciona um nó com determinado `value` no fim da lista;
```java
void addLast(Integer value)
```

6. método que que reverte a ordem dos items da lista;
```java
void reverse()
```

7. método que deleta no node da lista.
```java
void delete(DoublyListNode nodeToBeDeleted)
```

8. método que que retorna `true` caso os elementos estejam ordenados e `false` caso contrário. Os elementos podem estar ordenados ascendentemente quando `ascending` é `true` (i.e., 1,2,3,4) ou descendentemente quando `ascending` é `false` (ie., 4,3,2,1). 
```java
boolean isOrdered(boolean ascending)
```