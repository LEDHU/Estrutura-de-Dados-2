# Lista de Exercícios
<img src="../../assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T02LinkedLists - P02AddTwoNumbersII

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

### Questão 01 (Adaptado Leetcode 445. Add Two Numbers II)

Considere 2 (duas) Listas Unicamente Encadeadas **não vazias** representando 2 (dois) números inteiros **não negativos**. Os digitos são armazenados na **ordem reversa**, e cada um de seus nós contém um único digito. Some os dois números e retorne a soma também como uma Lista Unicamente Encadeada.

Em uma classe `Utils`, implemente o método 

```java
public static SinglyLinkedList sum(SinglyLinkedList listAddendOne, SinglyLinkedList listAddendTwo)
```

**Informações**
> Você deve utilizar as suas classes `SinglyLinkedList` e `SinglyListNode` 
> 
> Implemente o método `toArray` na `SinglyLinkedList` para retornar os valores em um array de inteiros `Integer[]`.
> 

#### Exemplo 1
<img src="../../assets/images/addtwonumber1.jpeg" alt="drawing" width="600"/>

**Entrada**
     
    l1 = [2,4,3], l2 = [5,6,4] 
**Saída**

    [7,0,8]

**Explicação**

    342 + 465 = 807.

#### Exemplo 2
**Entrada**
     
    l1 = [0], l2 = [0]
**Saída**

    [0]

#### Exemplo 3
**Entrada**
     
    l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
**Saída**

    [8,9,9,9,0,0,0,1]

