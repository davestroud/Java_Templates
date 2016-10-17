public class NumberListDemo
{
   public static void main (String args[])
   {
      int[] numbers = {12, 34, 67, 4, 9, 10, 7, 13};
      final int CUTOFF = 5;
      double average;
      int total = 0;
      int i;
      int lowest;
      int highest;
      System.out.print("The numbers are  ");
      for(i = 0; i < numbers.length; ++ i)
         System.out.print(numbers[i] + "  ");
      System.out.print("\nThe numbers in reverse order are  ");
      for(i = numbers.length - 1; i >= 0; -- i)
         System.out.print(numbers[i] + "  ");
      for(i = 0; i < numbers.length; i++)
      {
         total += numbers[i];
      }
      System.out.println("\nThe sum of all numbers is "+ total);
      lowest = numbers[0];
      highest = numbers[0];
      for(i  = 1; i < numbers.length; ++i)
      {
         if(numbers[i] < lowest)
            lowest = numbers[i];
         if(numbers[i] > highest)
            highest = numbers[i];
      }
      System.out.println("The lowest number is " + lowest);
      System.out.println("The highest number is " + highest);
       for(i = 0; i < numbers.length; i++)
         if(numbers[i] < CUTOFF)
             System.out.println(numbers[i] + " is less than " + CUTOFF);
      average = total * 1.0 / numbers.length;
      System.out.println("The average is " + average);
      for(i = 0; i < numbers.length; i++)
         if(numbers[i] > average)
	    System.out.println(numbers[i] + " is greater than the average");
   }
}


