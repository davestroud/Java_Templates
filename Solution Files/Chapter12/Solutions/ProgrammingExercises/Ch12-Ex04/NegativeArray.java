import javax.swing.*;
public class NegativeArray
{
   public static void main(String args[])
   {
      char c;
      int a[];
      int sz;
      String size;
      try
      {
          size = JOptionPane.showInputDialog(null,
             "Please enter a value for the array size");
          sz = Integer.parseInt(size);
          a = new int[sz];
          JOptionPane.showMessageDialog(null,
             "Array of size " + sz + " created");
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null, 
           "Error caught: " + e.getMessage());
      }
   }
}