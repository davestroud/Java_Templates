// Subscribers.java
// Chapter 11, Exercise 6
import javax.swing.*;
public class Subscribers
{
   public static void main(String[] args) 
   {
      NewspaperSubscriber[] subArray = new
         NewspaperSubscriber[6];
      int x;
      String inputString, outputString;
      int option;
      for(x = 0; x < subArray.length;++x)
      {
         inputString = JOptionPane.showInputDialog(null,
            "Please select the type of" +
            "\nsubscribtion you want:" +
            "\n   1 - Seven day" +
            "\n   2 - Weekday only" +
            "\n   3 - Weekend only");
         option = Integer.parseInt(inputString);
         if(option == 1)
           subArray[x] = new SevenDaySubscriber();
         else if(option == 2)
           subArray[x] = new WeekdaySubscriber();
         else
           subArray[x] = new WeekendSubscriber();
      // check for duplicates
         for(int y = 0; y < x; ++y)
           if(subArray[x].equals(subArray[y]))
           {
   	     JOptionPane.showMessageDialog(null,
              "Sorry - you just entered a duplicate subscription");
		  --x;
           }
       }

       outputString = "\nThe subscriptions are:\n";
       for(x = 0; x < subArray.length; ++x)
	   outputString = outputString +"\n#" + (x+1) + "   " +
           subArray[x].toString();
       JOptionPane.showMessageDialog(null, outputString);
   }
}
