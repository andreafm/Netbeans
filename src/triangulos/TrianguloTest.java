package triangulos;

import org.junit.Test;

import static triangulos.TrianguloType.EQUILATERO;
import static triangulos.TrianguloType.NOVALIDO;
import static triangulos.TrianguloType.ISOSCELES;
import static triangulos.TrianguloType.ESCALENO;

import static org.junit.Assert.assertEquals;

public class TrianguloTest {

  @Test
  public void test1() {
    final TrianguloType type = Triangulo.classify(1, 2, 3);
    assertEquals(ESCALENO, type);
  }

  @Test
  public void testInvalid1() {
    final TrianguloType type = Triangulo.classify(1, 2, 4);
    assertEquals(NOVALIDO, type);
  }

  @Test
  public void testInvalid2() {
    final TrianguloType type = Triangulo.classify(0, 0, 0);
    equals(NOVALIDO);
  }

  @Test
  public void testInvalid3() {
    final TrianguloType type = Triangulo.classify(4, 1, 2);
    assertEquals(NOVALIDO, type);

  }

  @Test
  public void testInvalidNeg1() {
    final TrianguloType type = Triangulo.classify(-1, 1, 1);
    assertEquals(NOVALIDO, type);
  }

  @Test
  public void testInvalidNeg2() {
    final TrianguloType type = Triangulo.classify(1, -1, 1);
    assertEquals(NOVALIDO, type);
  }

  @Test
  public void testInvalidNeg3() {
    final TrianguloType type = Triangulo.classify(1, 1, -1);
    assertEquals(NOVALIDO, type);
  }

  @Test
  public void testEquiliteral() {
    final TrianguloType type = Triangulo.classify(1, 1, 1);
    assertEquals(EQUILATERO, type);
  }

  @Test
  public void testIsoceles1() {
    final TrianguloType type = Triangulo.classify(2, 2, 3);
    assertEquals(ISOSCELES, type);
  }

  @Test
  public void testIsoceles2() {
    final TrianguloType type = Triangulo.classify(2, 3, 2);
    assertEquals(ISOSCELES, type);
  }

  @Test
  public void testIsoceles3() {
    final TrianguloType type = Triangulo.classify(3, 2, 2);
    assertEquals(ISOSCELES, type);
  }

  @Test
  public void testInvalid() {
    final TrianguloType type = Triangulo.classify(3, 1, 1);
    assertEquals(NOVALIDO, type);
  }
}