// Interest.java
// Chapter 3, Exercise #10
// Calculates simple interest
import java.util.Scanner;
class Interest
{
  public static void main(String[] args)
  {
     double investment;
     final double RATE = 0.05;
     Scanner input = new Scanner(System.in);
     investment = getMoney();
     
     System.out.println("The interest for $" +
	investment + " invested for one year at " +
	RATE + " is: " + calcInterest(investment, RATE));
  }

  public static double getMoney()
  {
     double dollars;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter amount of money to invest ");
     dollars = input.nextDouble();
     return dollars;
  }
  public static double calcInterest(double amount, double rate)
  {
     return amount * rate;
  }

}