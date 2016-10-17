import java.util.*;
import javax.swing.*;
public class ConvertDate
{
   public static void main(String[] args)
   {
      String[] monthName =  {"January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October",
        "November", "December"};
      int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
      String entry= "";
      String monthString = "", dayString = "", yearString = "";
      String outString;
      int x = 0;
      int daysInYear = 0;
      int month = 0, day = 0, yr = 0;
      final char SLASH = '/';
      int firstSlashPosition, secondSlashPosition;
      boolean leapYear;
      boolean isValidDate = false;
      entry = JOptionPane.showInputDialog(null, "Enter a date in the format MM/DD/YYYY");
      while (!isValidDate)
      {
         x = 0;
         while(entry.charAt(x) != SLASH)
             ++x;
         firstSlashPosition = x;
         ++x;
         while(entry.charAt(x) != SLASH)
             ++x;
         secondSlashPosition = x;
         monthString = entry.substring(0, firstSlashPosition);
         dayString = entry.substring(firstSlashPosition + 1, secondSlashPosition);
         yearString = entry.substring(secondSlashPosition + 1, entry.length());
         month = Integer.valueOf(monthString);
         day = Integer.valueOf(dayString);
         yr = Integer.valueOf(yearString);
         leapYear = false;
         if(yr % 400 == 0)
            leapYear = true;
         else
            if(yr % 100 == 0)
              leapYear = false;
            else
              if(yr % 4 == 0)
                  leapYear = true;
         if(leapYear)
             days[2] = 29;
         isValidDate = true;
         if(month < 1 || month > 12)
             isValidDate = false;
         else
             if(day < 0 || day > days[month])
                  isValidDate = false;
             else 
                  isValidDate = true;
         if(!isValidDate)
            entry = JOptionPane.showInputDialog
              (null, "Invalid date. Enter a date in the format MM/DD/YY"); 
       }   
       x = 0;
       while(x < month)
       {
          daysInYear += days[x];
          ++x;
       }
       daysInYear += day; 
       outString = monthName[month - 1] + " " + day + ", " + yearString;
       JOptionPane.showMessageDialog(null, "Date is " + outString +
         "\nDay in the year is " + daysInYear);
   }
}
