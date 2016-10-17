public class Vehicle
{
   private int wheels;
   private int mpg;

   public Vehicle(int wh, int miles)
   {
      wheels = wh;
      mpg = miles;
   }

   public String toString()
   {
      return ("Wheels: " + wheels + " Mpg: " + mpg );
   }
}