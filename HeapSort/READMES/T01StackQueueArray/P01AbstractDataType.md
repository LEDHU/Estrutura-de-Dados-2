P01AbstractDataType# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T01StackQueueArray - P01AbstractDataType

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade
### Questão 01

Crie uma classe `StackArray` para implementar o `Tipo Abstrato de Dados Pilha`. Na sua implementação, você deve utilizar uma variável de instância `values` do tipo `array` para armazenar os valores da pilha e uma variável de instância `top` para memorizar o topo da pilha. Sua implementação deve possuir possuir os métodos:


```java
1. void push(Integer value);
2. Integer pop() throws IllegalStateException;
3. boolean isEmpty()
```

### Questão 02
Crie uma classe `QueueArray` para implementar o `Tipo Abstrato de Dados Fila`. Na sua implementação, você deve utilizar uma variável de instância `values` do tipo `array`, uma variável de instância `head` para memorizar o início da Fila e uma variável de instância `tail` para armazenar o fim da fila. Sua implementação deve possuir os métodos:

```java
1.	void enqueue(Integer value);
2.	Integer dequeue() throws Exception;
3.	boolean isEmpty();
```

### Questão 03
Implemente o método 
```java
void reverse(QueueArray queueToBeReversed, StackArray stackAuxiliary) 
```

em uma classe `Utils` que reverte a fila `queueToBeReversed`. Apenas utilize os métodos da `QueueArray` e `StackArray` para reverter a fila `queueToBeReversed`.

