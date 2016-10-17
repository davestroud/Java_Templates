import java.util.*;
public class YearEnd
{
   public static void main (String args[])
   {
      int LASTMO = 11;
      int LASTDAY = 31;
      GregorianCalendar today = new GregorianCalendar();
      GregorianCalendar newyear = 
         new GregorianCalendar(today.get(Calendar.YEAR), LASTMO, LASTDAY);
      int diff = newyear.get(newyear.DAY_OF_YEAR) - 
         today.get(today.DAY_OF_YEAR);
      System.out.println("There are " + diff +
         " days left in the year");
   }

}
