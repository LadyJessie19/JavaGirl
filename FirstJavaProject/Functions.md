```markdown
# Escrevendo uma Função em Java

Uma função em Java é chamada de método. Um método é um bloco de código que executa uma tarefa específica e pode receber argumentos e retornar um valor. Aqui estão os passos para escrever um método em Java:

## 1. Escopo e Modificadores de Acesso

O escopo de um método determina onde ele pode ser acessado. Os modificadores de acesso, como `public`, `private` e `protected`, definem a visibilidade do método. Um método deve ser declarado dentro de uma classe.

```java
public class MinhaClasse {
    // ...
    public static int minhaFuncao(int parametro) {
        // Corpo do método
    }
}
```

## 2. Tipo de Retorno

O tipo de retorno especifica qual tipo de valor o método irá retornar. Use a palavra-chave `void` se o método não retornar nenhum valor.

```java
public static int minhaFuncao(int parametro) {
    // Corpo do método
    return valorDeRetorno;
}
```

## 3. Nome do Método

Escolha um nome significativo para o método. Convenção: use camelCase e inicie com um verbo.

```java
public static int calcularSoma(int a, int b) {
    // Corpo do método
    return a + b;
}
```

## 4. Argumentos

Os argumentos são valores que o método recebe para realizar suas operações. Eles são definidos entre parênteses após o nome do método.

```java
public static int calcularSoma(int a, int b) {
    // Corpo do método
    return a + b;
}
```

## 5. Bloco de Execução

O bloco de execução contém as instruções que o método executará. Aqui é onde a lógica do método é implementada.

```java
public static int calcularSoma(int a, int b) {
    int soma = a + b;
    return soma;
}
```

## Exemplo Completo:

```java
public class Calculadora {
    public static int calcularSoma(int a, int b) {
        int soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        int resultado = calcularSoma(5, 7);
        System.out.println("Resultado da soma: " + resultado);
    }
}
```

Lembre-se de que os métodos podem variar em complexidade e funcionalidade, mas seguir essas etapas básicas ajudará você a criar métodos eficazes e legíveis em Java.

# Sobrecarga de Método em Java

Em Java, a sobrecarga de método permite que você defina vários métodos com o mesmo nome, mas com diferentes parâmetros. Isso significa que você pode criar funções com comportamentos semelhantes, mas que podem lidar com diferentes tipos ou números de argumentos.

## Exemplo de Sobrecarga de Método

```java
public class MinhaClasse {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static String soma(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultadoInt = soma(5, 7);
        double resultadoDouble = soma(3.14, 2.71);
        String resultadoString = soma("Olá, ", "mundo!");

        System.out.println("Resultado da soma int: " + resultadoInt);
        System.out.println("Resultado da soma double: " + resultadoDouble);
        System.out.println("Resultado da soma string: " + resultadoString);
    }
}
```

Neste exemplo, a classe `MinhaClasse` possui três métodos `soma` com o mesmo nome, mas diferentes tipos de parâmetros. O Java selecionará automaticamente qual método chamar com base nos tipos de argumentos passados.

A sobrecarga de método é uma maneira poderosa de criar métodos flexíveis e legíveis, permitindo que você lide com diferentes tipos de entrada da maneira mais apropriada para cada caso.
```