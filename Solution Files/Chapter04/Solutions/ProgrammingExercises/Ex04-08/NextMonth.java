import java.util.*;
public class NextMonth
{
   public static void main(String[] args)
   {
      final int DAYS_IN_YEAR = 365;
      GregorianCalendar now = new GregorianCalendar();
      int currentYear = now.get(Calendar.YEAR);
      int currentMonth = now.get(Calendar.MONTH);
      GregorianCalendar nextMonth = new GregorianCalendar(currentYear, currentMonth + 1, 1);
      int day = now.get(Calendar.DAY_OF_YEAR);
      int nextMonthDay = nextMonth.get(Calendar.DAY_OF_YEAR);
      int diff = nextMonthDay - day;
      System.out.println("Next month starts in " + diff + " days");
   }
}
    
 