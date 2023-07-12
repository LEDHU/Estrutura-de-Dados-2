# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T06BinarySearchTree - P01AbstractDataType

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

### Questão 01
Implemente uma classe genérica `Node<Key, Value>` em que o tipo `Value` possa ser de qualquer tipo e a tipo `Key` tem que `extends Comparable<Key>`. A classe `Node` deve possuir os atributos (e respectivos métodos get e set) a seguir:

1.	atributo `key` do tipo `Key`;
2.	atributo `value` do tipo `Value`;
3.	atributo `left` do tipo `Node<Key, Value>`;
4.	atributo `right` do tipo `Node<Key, Value>`; e
5.	atributo `size` do tipo `int`.

### Questão 02

Implemente uma classe genérica `BinarySearchTree<Key, Value>` em que o tipo `Value` possa ser de qualquer tipo e o tipo `Key` tem que `extends Comparable<Key>`. 
Implemente os seguintes métodos:

```java
Value get(Key key)
```
que recebe um `Key` e retorna um `Value` encontrado;

```java
void put(Key key, Value value) 
```
que adiciona um `Value` na `Key`;

```java
int size() 
```
que retorna um `int` com a quantidade de nós;

```java
Key min()
```
que retorna a `Key` de menor valor;

```java
Key max()
```
que retorna a `Key` de maior valor;

```java
Key select(int rank)
```
que retorna a `Key` associada ao rank `rank`.

```java
void delete(Key key)
```
que remove o nó associado com a `Key`;

### Questão 03
Implemente uma classe genérica `BinaryTreeWalker<Key, Value>` em que o tipo `Value` possa ser de qualquer tipo e o tipo `Key` tem que `extends Comparable<Key>`. A `BinaryTreeWalker<Key, Value>` recebe uma `BinarySearchTree<Key, Value>` em seu construtor. Implemente métodos que visitam a árvore e retornam uma `List<Key>` contendo as chaves nas ordems visitadas a seguir:

```java
List<Key> inOrder()
```
```java
List<Key> breadthFirst()
```

```java
List<Key> preorder()
```

```java
List<Key> postorder()
```