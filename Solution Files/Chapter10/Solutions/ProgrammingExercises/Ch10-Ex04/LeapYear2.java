public class LeapYear2 extends Year2
{
   LeapYear2()
   {
     days = 366;
   }

   public int daysElapsed(int m, int d)
   {
      int[] daysInMo = {0, 31, 29, 31, 30, 31,
         30, 31, 31, 30, 31, 30};
      int de = 0,x;
      for(x = 0; x < m; ++x)
         de += daysInMo[x];
      de += d;
      return de;
   }
}