public class Knots
{
   public static void main (String args[])	
   {
       int knots;
       final int MIN = 15;
       final int MAX = 30;
       final double KM_PER_NAUT = 1.852;
       final double MILES_PER_NAUT = 1.151;
       for(knots = MIN; knots <= MAX; ++ knots)
          System.out.println(knots + " knots equals " +
             (knots * KM_PER_NAUT) + " kilometers per hour " +
             " or " + (knots * MILES_PER_NAUT) +
             " miles per hour");     
   }
}


