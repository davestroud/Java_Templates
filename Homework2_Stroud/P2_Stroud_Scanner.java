import java.util.Scanner;
public class P2_Stroud_Scanner {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num1, num2, num3;
    System.out.print("Enter first integer >> ");
    num1 = input.nextInt();
    System.out.print("Enter second integer >> ");
    num2 = input.nextInt();
    System.out.print("Enter third integer >> ");
    num3 = input.nextInt();
    displaySum(num1, num2, num3);
    displayAverage(num1, num2, num3);
    displayProduct(num1, num2, num3);
  }

  public static void displaySum(int x, int y, int z) {
    System.out.println("Sum: " + (x + y + z));
  }

  public static void displayAverage(int x, int y, int z) {
    System.out.println("Average: " + ((x + y + z) / 3));
  }

  public static void displayProduct(int x, int y, int z) {
    System.out.println("Product" + (x * y * z));
  }
}
