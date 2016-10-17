// MilesToFeet.java

class MilesToFeet
{    
   public static void main(String[] args) 
   {  
      final int FEET_IN_MILE = 5280;
      double distanceInMiles = 8.5;
      double distanceInFeet;
      distanceInFeet = distanceInMiles * FEET_IN_MILE;
      System.out.println("The distance to my uncle's house is " +
         distanceInMiles + " miles or " + distanceInFeet +
         " feet."); 
   }
}