import java.util.Scanner;
public class Temperatures
{
   public static void main(String[] args)
   {
      int high;
      int low;
      int difference;
      final int HIGH_THRESHHOLD = 90;
      final int LOW_THRESHHOLD = 32;
      final int DIFFERENCE_THRESHHOLD = 40; 
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the day's high temperature >> ");
      high = keyboard.nextInt();
      System.out.print("Enter the day's low temperature >> ");
      low = keyboard.nextInt();
      if(high >= HIGH_THRESHHOLD)
         System.out.println("Heat warning");
      if(low <= LOW_THRESHHOLD)
         System.out.println("Freeze warning");
      if((high - low) >= DIFFERENCE_THRESHHOLD)
         System.out.println("Large temperature swing");
   }
}
