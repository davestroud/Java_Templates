import javax.swing.*;
public class CreateBabysittingJob
{
  public static void main(String[] args)
  {
     int year;
     int number;
     int code;
     int children;
     int hours;
     String entry;
     final int LOW_YEAR = 2013;
     final int HIGH_YEAR = 2025;
     final int LOW_NUM = 1;
     final int HIGH_NUM = 9999;
     final int LOW_CODE = 1;
     final int HIGH_CODE = 3;
     final int LOW_KIDS = 1;
     final int HIGH_KIDS = 9;
     final int LOW_HOURS = 1;
     final int HIGH_HOURS = 12;
     String jobNumber;
     entry = JOptionPane.showInputDialog(null, "Enter the year");
     year = Integer.parseInt(entry);
     while(year < LOW_YEAR || year > HIGH_YEAR)
     {
       entry = JOptionPane.showInputDialog(null,
          "Year must be between " + LOW_YEAR + " and " +
           HIGH_YEAR + "\nEnter the year");
       year = Integer.parseInt(entry);
     }
     entry = JOptionPane.showInputDialog(null,
         "Enter the job number for the year");
     number = Integer.parseInt(entry);
     while(number < LOW_NUM || number > HIGH_NUM)
     {
       entry = JOptionPane.showInputDialog(null,
        "Number must be between " + LOW_NUM + " and " +
          HIGH_NUM + "\nEnter the job number");
       number = Integer.parseInt(entry);
     }
     entry = JOptionPane.showInputDialog(null,
         "Enter the babysitter code");
     code = Integer.parseInt(entry);
     while(code < LOW_CODE || code > HIGH_CODE)
     {
       entry = JOptionPane.showInputDialog(null,
       "Code must be between " + LOW_CODE + " and " +
            HIGH_CODE + "\nEnter the code");
       code = Integer.parseInt(entry);
     }
     entry = JOptionPane.showInputDialog(null,
         "Enter the number of children");
     children = Integer.parseInt(entry);
     while(children < LOW_KIDS || children > HIGH_KIDS)
     {
       entry = JOptionPane.showInputDialog(null,
        "Children must be between " + LOW_KIDS + " and " +
           HIGH_KIDS + "\nEnter the number of children");
       children = Integer.parseInt(entry);
     }
     entry = JOptionPane.showInputDialog(null,
         "Enter the number of hours");
     hours = Integer.parseInt(entry);
     while(hours < LOW_HOURS || hours > HIGH_HOURS)
     {
       entry = JOptionPane.showInputDialog(null,
        "Hours must be between " + LOW_HOURS + " and " +
           HIGH_HOURS + "\nEnter the number of hours");
       hours = Integer.parseInt(entry);
     }
     year = year % 2000;
     if(number < 10)
        jobNumber = year + "000" + number;
     else
        if(number < 100)
           jobNumber = year + "00" + number;
        else
           if(number < 1000)
             jobNumber = year + "0" + number;
           else
              jobNumber = "" + year + number; 
     BabysittingJob delivery = new
        BabysittingJob(jobNumber, code, children, hours);  
     delivery.display();
  }
}