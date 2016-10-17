// ArithmeticMethods.java
// Chapter 3, Exercise 3
// Demonstrates methods
public class ArithmeticMethods
{
   public static void main (String args[])
   {
      int num1 = 22, num2 = 333;
      displayNumberPlus10(num1);
      displayNumberPlus100(num1);
      displayNumberPlus1000(num1);
      displayNumberPlus10(num2);
      displayNumberPlus100(num2);
      displayNumberPlus1000(num2);
   }
   public static void displayNumberPlus10(int n)
   {
      final int FACTOR = 10;
      System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
   }
   public static void displayNumberPlus100(int n)
   {
      final int FACTOR = 100;
      System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
   }
   public static void displayNumberPlus1000(int n)
   {
      final int FACTOR = 1000;
      System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR)); 
   }
}
