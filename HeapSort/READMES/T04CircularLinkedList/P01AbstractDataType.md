# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T04CircularLinkedList - P01AbstractDataType

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

### Questão 1

Crie uma class `CircularLinkedList` que, em vez de possuir `head` and `tail`, possui **APENAS** uma `sentinel` do tipo `CircularListNode` inicializado com ambos `next` e `previous` apontando para `sentinel` e implemente os seguintes métodos 

1.	método que retorna true quando a lista está vazia e false caso contrário;
```java
boolean isEmpty() 
```
2. método que adiciona o elemento elem no início da lista;
```java
void addFirst(Integer value)
```
3. método que que retorna o nó ListNode cujo elemento procurado elem se encontra ou null caso o elemento não esteja na lista;
```java
CircularListNode search(int elem)
```
4.	método que retorna o tamanho da lista; 
```java
int size()
```
5.	método que que adiciona no fim da lista;
```java
void addLast(Integer value)
```
6.  método que reverte a ordem dos items da lista;
```java
void reverse()
```
7.	método que que deleta no node da lista.
```java
void delete(CircularListNode nodeDelete)
```
8.	método que retorna true caso os elementos estejam ordenados e false caso contrário. Os elementos podem estar ordenados ascendentemente quando ascending é true (i.e., 1,2,3,4) ou descendentemente quando ascending é false (ie., 4,3,2,1). 
```java
boolean isOrdered(boolean ascending)
```

### Questão 2

Implemente o método 
```java
CircularLinkedList copy()
```
na `CircularLinkedList` que retorna uma cópia também do tipo `CircularLinkedList` baseado no objeto em que o método foi chamado. Utilize o método `void addLast(Integer value)` implementado anteriormente. 

### Questão 3

Implemente o método 
```java
boolean isEquals(CircularLinkedList otherList)
```

na `CircularLinkedList` que recebe um `otherList` do tipo `CircularLinkedList` e retorna `true` caso a `otherList` seja igual a lista na qual o método foi chamado ou `false` caso contrário. 

### Questão 4

Implemente o método 
```java
int get(int index) throws Exception
```
na `CircularLinkedList` que percorre a lista circular e obtém o nó da posição `index` da lista ou retorna uma exceção caso a lista esteja vazia. 

Caso `index > 0` continue circulando a lista até encontrar o valor. 

```java
CircularLinkedList list = new CircularLinkedList();
list.addLast(1);
list.addLast(2);
list.addLast(3);
```

Então, 

```java
list.get(0) == list.get(3) == list.get(6) == 1
list.get(1) == list.get(4) == list.get(7) == 2
list.get(2) == list.get(5) == list.get(8) == 3
```
> Dica: você tem que “pular” a sentinela. 
