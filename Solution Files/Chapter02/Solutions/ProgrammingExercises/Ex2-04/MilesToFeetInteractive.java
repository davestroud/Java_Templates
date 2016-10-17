// MilesToFeetInteractive.java

import java.util.Scanner;
class MilesToFeetInteractive
{    
   public static void main(String[] args) 
   {  
      final int FEET_IN_MILE = 5280;
      double distanceInMiles;
      double distanceInFeet;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter distance to uncle's house in miles >> ");
      distanceInMiles = input.nextDouble();
      distanceInFeet = distanceInMiles * FEET_IN_MILE;
      System.out.println("The distance to my uncle's house is " +
         distanceInMiles + " miles or " + distanceInFeet +
         " feet."); 
   }
}