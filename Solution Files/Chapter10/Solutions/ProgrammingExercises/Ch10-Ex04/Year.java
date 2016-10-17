public class Year
{
   protected int days;

   public Year()
   {
      days = 365;
   }
   public void getDays()
   {
      System.out.println("The year has " + days + " days.");
   }
}