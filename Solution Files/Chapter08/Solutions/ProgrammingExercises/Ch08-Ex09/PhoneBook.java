// PhoneBook.java
// Chapter 8, Exercise 8
// An on-line phone book
import javax.swing.*;
public class PhoneBook
{
   public static void main(String[] args)
   {
      String[] name = new String[20];
      String[] phone = new String[20];
      String entry;
      String list = "";
      int count = 0, x;
      boolean isFound = false;
      entry = JOptionPane.showInputDialog(null,"Enter a name");
      name[count] = entry;
      while(count < name.length && (!entry.equals("zzz")) )
      {
         entry = JOptionPane.showInputDialog(null,"Enter phone number");
         phone[count] = entry;
         ++count;
         entry = JOptionPane.showInputDialog(null,
             "Enter a name or zzz to quit");
         name[count] = entry;
      }
      JOptionPane.showMessageDialog(null,
        "Count of names entered: " + count);
      for(x = 0; x < count; ++x)
         list += name[x] + "\n";
      JOptionPane.showMessageDialog(null, list);
      entry = JOptionPane.showInputDialog(null,
          "Enter a name to search for");
      for(x = 0; x < count; ++x)
          if (entry.equals(name[x]))
          {
              isFound = true;
              JOptionPane.showMessageDialog(null, name[x] +
                "'s phone number is " + phone[x]);
          }
      if(!isFound)
         JOptionPane.showMessageDialog(null,
            "Sorry, no entry for " + entry);
   }
}