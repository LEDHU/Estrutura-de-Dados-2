# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T05Generics - P02InfixExpressionEvaluation

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

### Questão 01
A estrutura de dados `Stack` pode ser utilizada para avaliar expressões aritméticas. Por exemplo, a expressão

    (1+((2+3)*(4*5)))
ao ser avaliada retorna o valor `121`.

Primerio, é resolvida a soma `(2+3)` nos parânterese internos
    (1+(`5`*(4*5)))

Depois, é resolvida a multiplicação `(4*5)`
    (1+(5*`20`))

Depois, é resolvida a multiplicação `(5*20)`
    (1+`100`)
    
Por fim, é resolvida a soma nos parênteses externos `1+100 `.
    (`101`)

E o resultado final é
    101

Implemente uma class `ExpressionEvaluation` que possui um construtor 

```java
public ExpressionEvaluation(String[] expression)
```
e implemente o método 

```java
public Double evaluate() 
```

1. > Utilize 2 pilhas (`java.util.LinkedList<T>`, `java.util.Stack` and uma implementado por você). Uma pilha de String para leitura dos operadores e uma pilha de double para armazer os resultados intermediários.
2. > Quando o token lido é um operador (e.g. `+`, `-`, `*`, `/` e `sqrt`), o token é empilhado na pilha de operadores.
3. > Quando o token lido é um parênteses fechada (e.g., `)`), um operador `op` é desempilhado da pilha de operadores, um valor `val` é desempilhado da pilha de valores, o valor `val` é atualizado com a aplicação do operador `op` e é empilhado novamente na pilha de valores com seu valor atualizado.
4. > Caso contrário, quando o token lido é um operador, o valor é apenas empilhada na pilha de valores.