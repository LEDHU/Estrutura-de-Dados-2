# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T01StackQueueArray - P02ParenthesesValidator

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade
### Questão 01
Implemente uma classe `ParentesesValidator` com um construtor

```java
ParentesesValidator(String[] expression) 
```

que recebe um vetor de de String `expression` e o método 

```java
boolean isValid() 
```

que retorna `true` caso o vetor `expression` contenha uma expressão válida e `false` caso contrário. 

Uma expressão é válida se

- Parenteses `(` abertos devem ser fechados por parênteses `)`, colchetes `[` por colchetes `]`, e chaves `{` por chaves `}`;

Por exemplo, as seguintes expressão são válidas
- `(` `)`
- `(` `)` `[` `]` `{` `}`
- `(` `[` `{` `}` `]` `)`

E as seguintes expressões são inválidas 
- `)`
- `(` `[` `}` `]`
- `(` `[` `]` `)` `{`


> Uma `IStack` ou `IQueue` implementada anteriormente e adaptada para `String` pode ajudar.
> Armazene os parenteses, conchetes e chaves abertos `(` `[` `{` em uma varíavel
> Armazene os parenteses, conchetes e chaves fechados `)` `]` `}` em uma varíavel
> Modularize o código criando os métodos 

```java
boolean isOpen(String character)
```
que retorna `true` caso `character` seja um parentese, conchete ou chave aberta `(` `[` `{`  e 

```java
String getOpen(String closeCharacter)
```

que a partir de um `closeCharacter` igual a `)` `]` `}` retorna uma `String` com o respectivo parenteses, conchetes e chaves aberto `(` `[` `{`.

