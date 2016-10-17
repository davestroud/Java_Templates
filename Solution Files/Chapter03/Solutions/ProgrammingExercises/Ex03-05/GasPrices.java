// GasPrices.java
// Chapter 3,Exercise 5

import java.util.Scanner;
public class GasPrices
{
  public static void main (String args[])
  {
    int pricePerBarrel;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the current gas price per barrel >> ");
    pricePerBarrel = input.nextInt();
    calculatePricePerGallon(pricePerBarrel);
  }

  public static void calculatePricePerGallon(int ppb)
  {
    final double LOW = 3.50;
    final double HIGH = 4;
    final double BASE = 100;
    double lowPPG = ppb / BASE * LOW;
    double highPPG = ppb / BASE * HIGH;
    System.out.println("When gas is " + ppb +
      " per barrel, then it price will be from " +
      lowPPG + " to " + highPPG + " per gallon");
  }
}
