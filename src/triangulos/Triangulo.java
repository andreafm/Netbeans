package triangulos;

public class Triangulo {

  public static TrianguloType classify(final int a, final int b, final int c) {
    int trian;
    if ((a <= 0) || (b <= 0) || (c <= 0)) {
      return TrianguloType.NOVALIDO;
    }
    trian = 0;
    if (a == b) {
      trian = trian + 1;
    }
    if (a == c) {
      trian = trian + 2;
    }
    if (b == c) {
      trian = trian + 3;
    }
    if (trian == 0) {
      if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
        return TrianguloType.NOVALIDO;
      } else {
        return TrianguloType.ESCALENO;
      }
    }
    if (trian > 3) {
      return TrianguloType.EQUILATERO;
    }
    if ((trian == 1) && ((a + b) > c)) {
      return TrianguloType.ISOSCELES;
    } else if ((trian == 2) && ((a + c) > b)) {
      return TrianguloType.ISOSCELES;
    } else if ((trian == 3) && ((b + c) > a)) {
      return TrianguloType.ISOSCELES;
    }
    return TrianguloType.NOVALIDO;
  }

}