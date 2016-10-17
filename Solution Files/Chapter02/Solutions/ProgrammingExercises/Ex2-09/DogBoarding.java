// DogBoarding.java
import java.util.Scanner;
class DogBoarding
{
  public static void main(String[] args) 
  {  
      final double DAY_RATE = 0.50;
      int weight;
      int days;
      double total;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter dog's weight in pounds >> ");
      weight = input.nextInt();
      System.out.print("Enter number of days to board >> ");
      days = input.nextInt();
      total = DAY_RATE * days * weight;
      System.out.println("The price to board a " + weight +
        " pound dog for " + days + " days is $" + total);
   }
}