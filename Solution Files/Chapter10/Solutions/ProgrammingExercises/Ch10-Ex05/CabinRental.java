public class CabinRental
{
   private int cabinNumber;
   protected double rate;
   final int CUTOFF = 4;
   final double LOWRATE = 950;
   final double HIGHRATE = 1100;
   public CabinRental(int num)
   {
      cabinNumber = num;
      if(cabinNumber < CUTOFF)
         rate = LOWRATE;
      else
         rate = HIGHRATE;
   }

   public int getCabinNumber()
   {
     return cabinNumber;
   }
   public double getRate()
   {
     return rate;
   }
}