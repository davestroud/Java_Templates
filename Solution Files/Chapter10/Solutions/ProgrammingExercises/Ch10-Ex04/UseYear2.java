import javax.swing.*;
public class UseYear2
{
  public static void main(String args[])
  {
    Year2 year2015 = new Year2();
    LeapYear2 year2016 = new LeapYear2();
    String inStr;
    int month, day;
    inStr = JOptionPane.showInputDialog(null, "Enter month");
    month = Integer.parseInt(inStr);
    inStr = JOptionPane.showInputDialog(null, "Enter day");
    day = Integer.parseInt(inStr);
    JOptionPane.showMessageDialog(null,
    year2015.daysElapsed(month, day) +
       " days elapse to\n     " +
       month + "/" + day  + " in a normal year\n and " +
    year2016.daysElapsed(month,day) +
       " days elapse to\n     " +
       month + "/" + day + " in a leap year");
  }
}