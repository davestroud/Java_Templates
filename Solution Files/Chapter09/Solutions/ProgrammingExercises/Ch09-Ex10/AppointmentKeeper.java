import java.util.*;
class AppointmentKeeper
{
   public static void main(String[] args)
   {
      String[][] appointments = new String[31][24]; 
      Scanner keyboard = new Scanner(System.in);
      final int QUIT = 99;
      int day;
      int hour;
      int x, y;
      String amPm;
      for(x = 0; x < appointments.length; ++x)
         for(y = 0; y< appointments[0].length; ++y)
            appointments[x][y] = "Nothing scheduled";
      System.out.print("Enter the day for an appointment or " + QUIT + " to quit >> ");
      day = keyboard.nextInt();
      while (day != QUIT)
      {
         System.out.print("Enter hour for appointment using a 24-hour clock >> ");
         hour = keyboard.nextInt();
         keyboard.nextLine();
         --day;
         System.out.print("Enter details >> ");
         appointments[day][hour] = keyboard.nextLine();
         System.out.print("Enter the day for an appointment or " + QUIT + " to quit >> ");
         day = keyboard.nextInt();      
      }
      System.out.print("\nEnter a day to see what is scheduled, or " + QUIT + " to quit >> ");
      day = keyboard.nextInt();
      while(day != QUIT)
      {
         --day;
         for(x = 0; x < appointments[0].length; ++x)
         {
            hour = x;
            if(hour < 12)
               amPm = " a.m. >> ";
            else
               amPm = " p.m. >> ";
            if(hour == 0)
               hour = 12;
            else
               if(hour > 12)
                  hour -= 12;
            if(hour < 10)
               System.out.print(" ");
            System.out.println(hour + amPm + appointments[day][x]);
         }
         System.out.print("\nEnter a day to see what is scheduled, or " + QUIT + " to quit >> ");
         day = keyboard.nextInt();
      }
   }
}
   