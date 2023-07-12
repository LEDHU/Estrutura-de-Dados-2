# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T04CircularLinkedList - P03LRUCache

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

### Questão 01 

Utilize uma **CircularLinkedList**  para projetar uma estrutura de dados que obedece as restrições de uma cache do tipo **Least Recently Used (LRU)**. Para isso, implemente a classe `LRUCache` que possui

1. Um construtor 
```java
public LRUCache(CircularLinkedList list, int capacity)
```
que inicializa a cache com uma `list` do tipo `CircularLinkedList` e uma `capacity` que é o tamanho da cache.

2. Um método de instância
```java
public Integer get(Integer key) {
```
que retorna o valor `value` associado à chave `key` caso a chave `key` exista na cache e `null` caso contrário.  

3. Um método de instância 
```java
public void set(Integer key, Integer value)
```
que atualize a chave `key` com o valor `value` caso a chave `key` exista na cache. Caso contrário, adiciona a chave `key` com o valor `value` na cache. Caso o número de chaves exceda a capacidade `capacity` após essa operação, despeje a **chave usada MENOS recentemente**. 


**Exemplos**

O código a seguir 
```java
capacity = 3;
list = new CircularLinkedList();
cache = new LRUCache(list, capacity);
```
constrói uma **LRUCache** com capacidade igual `3` utilizando uma **CircularLinkedList**.

Após executar as operações a seguir
```java
cache.set(1, 91);
cache.set(2, 92);
cache.set(3, 93);
```
a cache contém os seguintes pares `key`-`value`

    [(3, 93), (2, 92), (1, 91)]
em que o par `(3,93)` é o **utilizado MAIS recentemente**.

Ao tentar incluir um quarto par de `key`-`value` a seguir
```java 
cache.set(4, 94);
```
a cache contém os seguintes pares `key`-`value`
    
    [(4, 94), (3, 93), (2, 92)]
em que o par `(4,94)` é o **utilizado MAIS recentemente** e o par `(1, 91)`, que é o par **utilizado MENOS recentemente**, foi despejado da cache pois a capacidade da cache igual à `3` foi excedida.

Caso a chave `3` seja atualizada com o valor `99`, a cache passa a contér os seguintes pares `key`-`value`
    
    [(3, 99), (4, 94), (2, 92)] 
em que o par `(3, 99)` é o **utilizado MAIS recentemente** e o par `(2, 92)` é o par **utilizado MENOS recentemente**.

> ## Para refletir... 
> A chave `key` **utilizada MAIS recentemente** será sempre a chave mas recentemente passada como argumento nos métodos
> - `set`; ou
> - `get` quando a chave existir.
