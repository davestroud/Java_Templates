public class UseYear
{
   public static void main(String args[])
   {
      Year year2015 = new Year();
      LeapYear year2016 = new LeapYear();
      System.out.println("A regular year:");
      year2015.getDays();
      System.out.println("A leap year:");
      year2016.getDays();
   }
}
