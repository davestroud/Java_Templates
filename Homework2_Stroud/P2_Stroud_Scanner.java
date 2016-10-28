import java.util.Scanner;
public class P2_Stroud_Scanner {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int num1, num2, num3;
    System.out.print("Enter an integer >> ");
    num1 = kb.nextInt();
    System.out.print("Enter another integer >> ");
    num2 = kb.nextInt();
    System.out.print("Enter another integer >> ");
    num3 = kb.nextInt();
    displaySum(num1, num2, num3);
    displayAverage(num1, num2, num3);
  }

  public static void displaySum(int x, int y, int z) {
    System.out.println(x + y + z);
  }

  public static void displayAverage(int x, int y, int z) {
    System.out.println((x + y + z) / 3);
  }
}
