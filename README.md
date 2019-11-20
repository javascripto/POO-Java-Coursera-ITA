# Testes Automatizados de Software

## Alguns tipos de testes:

- **`Unidade`**: Testa uma única classe ou um único método.
- **`Integração`**: Testa a colaboração de um grupo de classes.
- **`Funcional`**: Testa o software como um todo de acordo com os requisitos.

## Exemplo básico de uma classe de teste com JUnit:
```java
import org.junit.Test;
import static org.junit.Asserts.*;

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