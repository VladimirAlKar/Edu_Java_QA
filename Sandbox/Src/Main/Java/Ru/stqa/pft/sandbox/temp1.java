package Ru.stqa.pft.sandbox;

public class temp1 {
  public static void main(String[] args) {
    hello("World");
    double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));
  }
  public static double area (double l) {
    return l * l;
      }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}