import java.util.Scanner;
public class BarGraph
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      int pamSales;
      int leoSales;
      int kimSales;
      int bobSales;
      System.out.print("Enter cars sold by Pam >> ");
      pamSales = input.nextInt();
      System.out.print("Enter cars sold by Leo >> ");
      leoSales = input.nextInt();
      System.out.print("Enter cars sold by Kim >> ");
      kimSales = input.nextInt();
      System.out.print("Enter cars sold by Bob >> ");
      bobSales = input.nextInt();
      System.out.println("\nCar Sales for Month\n");
      drawGraph("Pam", pamSales);
      drawGraph("Leo", leoSales);
      drawGraph("Kim", kimSales);
      drawGraph("Bob", bobSales);
   }
   public static void drawGraph(String name, int sales)
   {
      System.out.print(name + "  ");
      for(int x = 0; x < sales; ++x)
         System.out.print("X");
      System.out.println();
   }
}

