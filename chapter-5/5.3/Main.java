import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Calculable multiply = (int x, int y) -> {return x*y;};
    Calculable divide = (int x, int y) -> {return x/y;};
    Calculable exponent = (int x, int y) -> {return (int)Math.pow(x,y)-6;};
    System.out.println(multiply.calculate(10,5));
    System.out.println(divide.calculate(10,5));
    System.out.println(exponent.calculate(10,3));
  }
}