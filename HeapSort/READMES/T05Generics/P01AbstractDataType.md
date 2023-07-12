# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T05Generics - P01AbstractDataType

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade
### Questão 01

Implemente a classe genérica `StackCircularLinkedList<Value>` de `Value` utilizando uma `CircularLinkedList` com sentinela como base, a classe `StackCircularLinkedList<Value>` deve possuir os seguintes métodos:

```java
Value pop() throws Exception
2.	void push(Value value)
3.	boolean isEmpty()
```

### Questão 2

Implemente a classe genérica `StackCircularLinkedList<Value>` de `Value` utilizando uma `CircularLinkedList` com sentinela como base, a classe `QueueCircularLinkedList<Value>` deve possuir os seguintes métodos:

```java
void enqueue(Value item) 
Value dequeue() throws Exception
boolean isEmpty()
```