# Testes Automatizados de Software

## Alguns tipos de testes:

- **`Unidade`**: Testa uma única classe ou um único método.
- **`Integração`**: Testa a colaboração de um grupo de classes.
- **`Funcional`**: Testa o software como um todo de acordo com os requisitos.

## Exemplo básico de uma classe de teste com JUnit:
```java
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalc {
    @Test
    public void testSoma() { /*...*/ }
}
```

## Alguns métodos de asserção do JUnit:

- `assertTrue()`
- `assertFalse()`
- `assertEquals()`
- `assertNotEquals()`
- `assertSame()`
- `assertNotSame()`
- `assertNull()`
- `assertNotNull()`
- `fail()`

## Diferença entre **`assertEquals()`** e **`assertSame()`**:
`assertEquals` invoca o método `.equals` do objeto comparado, o `assertSame` verifica se os valores são a mesma instancia em memória.

## Evitando duplicação de código nos testes

Quando é necessário executar algum código antes ou depois de cada teste ou classe de teste, usa-se algumas anotações para definir métodos que executem esse trecho de código:

```java
@BeforeEach
public void beforeEach() {}

@AfterEach
public void afterEach() {}

@BeforeAll
public static void beforeAll() {}

@AfterAll
public static void afterALl() {}

```
Imagine uma classe de testes em que como parte do cenário de cada teste eu preciso ter um arquivo, sempre com o mesmo conteúdo, que é apagado do durante a execução. O melhor lugar para criação desse arquivo seria no método anotado com `@BeforeEach`. Já a abertura e fechamento de uma conexão com o banco de dados deveria ser feita nos métodos com as anotações `@BeforeAll` e `@AfterAll`.