import java.util.*;
import javax.swing.*;
public class SortStrings
{
   public static void main(String[] args)
   {
      String[] values =  {"mouse", "dog", "cat", "horse", "cow",
         "moose", "tiger", "lion", "elephant", "bird"}; 
      int x;
      String message = "Values:";
      Arrays.sort(values);
      for(x = 0; x < values.length; ++x)
         message = message + "  " + values[x];
      JOptionPane.showMessageDialog(null, message);
   }
}
   