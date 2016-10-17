public class Year2
{
   protected int days;
   public Year2()
   {
      days = 365;
   }

   public int daysElapsed(int m, int d)
   {
      int[] daysInMo = {0, 31, 28, 31, 30, 31,
         30, 31, 31, 30, 31, 30};
      int de = 0, x;
      for(x = 0; x < m; ++x)
         de += daysInMo[x];
      de += d;
      return de;
   }
   public void getDays()
   {
      System.out.println("The year has " + days + " days.");
   }
}