# Lista de Exercícios
<img src="cassets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Dr. Diego Pinheiro

**Disciplina**: Estrutura de Dados 1

**Atividade**: T00WarmUp - P01AritmeticConditionalsPair

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. Não modifique nenhum código dentro da pasta src/**test**/java).
> 3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade
### Questão 01
Crie uma classe `SumDivision` que contém os dois métodos `static` a seguir:
1. método `sum` que recebe dois parâmetros `addend1` e `addend2` do tipo double e retorna um double
que é a soma entre `addend1` e `addend2`.
2. Método divide que recebe dois parâmetros `dividend` e `divisor` do tipo double e retorna um double que é o resultado da divisão de `dividend` por `divisor`.

A variável `result` no código a seguir armazena o valor `15`:

    ```java
    double n = 15;
    double result = SumDivision.sum(n, 0);
    ```

### Questão 02
Crie uma classe `Volume` contendo um método `static` chamado `getName` que recebe uma variável `volume` do tipo `int` e retorna uma `String` com a descrição de `volume` a seguir
 1. `"Min Volume"`, caso `volume` seja menor ou igual a `0`;
 2. `"Low Volume"`, caso volume seja maior que 0 e menor ou igual a `25`;
 3. `"Medium Volume"`, caso volume seja maior que `25` e menor que ou igual a `75`;
 4. `"High Volume"`, caso volume seja maior que `75` e menor que `100`;
 5. `"Max Volume"`, caso volume seja maior ou igual à `100`.


> Exemplos:
A variável `result` no código a seguir armazena o conteúdo `"Low Volume"`.

    ```java
    int volume = 25;
    String result = Volume.getName(volume);
    ```


### Questão 03
Crie uma classe `Pair` para encapsular um par de strings contendo
1.	Dois atributos `left` e `right` ambos do tipo `String`;
2.	Um construtor que recebe as variáveis `left` e `right` e inicializa os respectivos atributos `left` e `right`;
3.	Sobrescreva o método `toString` para retornar o valor dos atributos `left` e `right` entre parênteses e separados por vírgula: 
    
        “(left, right)”
4.	Sobrescreva o método `equals` para que a igualdade entre 2 objetos do tipo `Pair` retorne `true` apenas quando tanto `left` quanto `right` de ambos sejam iguais. 

Crie uma classe `Pairing` para encapsular o pareamento entre duas strings contendo
1.	Atributo `pairs` do tipo vetor de `Pair` (ie., `Pair[]`) e seu respectivo método acessador `getPairs`;
2.	Método `getList`
    1. Modificador de acesso `private`;
    2. 	Recebe uma string `s` como argumento;
    3. Retorna um vetor cujos elementos são do tipo `String` (eg., `String[]`) e cada i-ésimo elemento é uma substring em `s` separada por vírgula;
3.	Método `obtainPairs` 
    1.	modificador de acesso `public`
    2.	Recebe como argumento duas variáveis `s1` e `s2` do tipo String
    3.	Retorna um vetor de elementos do tipo `Pair` (eg., `Pair[]`) em que o `i`-ésimo elemento tem como `left` e `right`, respectivamente, o `i`-ésimo elemento `getList(s1)` e `getList(s2)`.
    4.	Lança exceção caso o tamanho do vetor `getList(s1)` seja diferente do vetor `getList(s2)`
4.	Construtor 
    1.	Recebe String `s1`, String `s2`
    2.	Inicializa o atributo pairs a partir do resultado `obtainPairs(s1,s2)`
    3. Lança exceção

Exemplos:

A variável `result` no código a seguir

    ```java
    String s1 = "Person 1, Person 3, Person 5";
    String s2 = "Person 2, Person 4, Person 6";
    Pairing pairing = new Pairing(s1, s2);
    String result = pairing.toString();
    ```

Armazena o seguinte conteúdo.

    "(Person 1, Person 2), (Person 3, Person 4), (Person 5, Person 6)"

