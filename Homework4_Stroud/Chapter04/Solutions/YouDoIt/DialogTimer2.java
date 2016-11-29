import javax.swing.JOptionPane;
import java.util.*;
public class DialogTimer2
{
  public static void main(String[] args)
  {
    final int SECONDSINMINUTE = 60;
    final int MILLISECS_IN_SECOND = 1000;
    int time1, time2, milli1, milli2, sec1,
      sec2, timeDifference;
    int min1, min2;                                  // min variables added for the minute
    GregorianCalendar before = new GregorianCalendar();
    milli1 = before.get(GregorianCalendar.MILLISECOND);  
    sec1 =  before.get(GregorianCalendar.SECOND);
    min1 = before.get(GregorianCalendar.MINUTE);     // value for min1
    time1 = MILLISECS_IN_SECOND * sec1 + milli1;
    JOptionPane.showConfirmDialog(null,
       "Is stealing ever justified? ");
    GregorianCalendar after = new GregorianCalendar(); 
    milli2 =  after.get(GregorianCalendar.MILLISECOND);
    sec2 = after.get(GregorianCalendar.SECOND);
    min2 = after.get(GregorianCalendar.MINUTE);     // value for min2
    time2 = 1000 * sec2 + milli2;
    timeDifference = time2 + ((min2 - min1) * (SECONDSINMINUTE * MILLISECS_IN_SECOND) - time1);
    // If min2 is the same minute as min1 the subtraction result in the inner parentheses
    // is 0, so the equation becomes just time2 - time1
    // If it is  new minute, then time 1 is subtracted from a full minute
    // and added to time2
    // For example, if you start at 5 milliseconds to the minute
    // and end at 12 milliseconds after the minute
    // the total is 17 milliseconds
    JOptionPane.showMessageDialog(null,"It took " + timeDifference +
       " milliseconds for you to answer");
  }
}
